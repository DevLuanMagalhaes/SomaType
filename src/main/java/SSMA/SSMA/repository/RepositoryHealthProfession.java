package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoHealthProfession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryHealthProfession extends JpaRepository <TwoHealthProfession, Long>{

    @Query(
            value = " select distinct o " +
                    "   from TwoHealthProfession o " +
                    "       , TwoHealthProfessionEstab b " +
                    "       ,TwoAccessFunctionTmp a " +
                    "  where (:healthProfessionId = -1 or o.healthProfessionId = :healthProfessionId) " +
                    "    and (:emplid is null or o.emplid = :emplid ) " +
                    "    and (:emplRcd = -1 or o.emplRcd = :emplRcd ) " +
                    "    and o.healthProfessionId = b.healthProfessionId " +
                    "    and (:estabid is null or b.estabid = :estabid)" +
                    "    and (b.estabid = a.estabid or :sysAdmin = 'Y') " +
                    "  order by o.emplid "
    )
    public TwoHealthProfession findAll (@Param("healthProfessionId")Long healthProfessionId,
                                        @Param("emplid")String emplid,
                                        @Param("emplRcd")Long emplRcd,
                                        @Param("estabid")String estabid,
                                        @Param("sysAdmin")String sysAdmin);

    @Query(
            value = "select distinct o " +
                    "from TwoHealthProfession o " +
                    "   , TwoHealthProfessionEstab b " +
                    "   , TwoAccessFunctionTmp a " +
                    "where o.healthProfessionId = b.healthProfessionId " +
                    "  and (:healthProfessionId = 0 or o.healthProfessionId = :healthProfessionId) " +
                    "  and (b.estabid = :estabid) " +
                    "  and (b.estabid = a.estabid or :sysAdmin = 'Y') " +
                    "order by o.emplid "
    )
    public TwoHealthProfession findHealthProfessionByEstabid (@Param("healthProfessionId")Long healthProfessionId,
                                                              @Param("estabid")String estabid,
                                                              @Param("sysAdmin")String sysAdmin);

    @Query(
            value = "select distinct o " +
                    "from TwoHealthProfession o " +
                    "   , TwoHealthProfessionEstab b " +
                    "   , TwoAccessFunctionTmp a " +
                    "   , TwoType t1" +
                    "   , TwoType t2 " +
                    "where o.healthProfessionId = b.healthProfessionId " +
                    "  and (:healthProfessionId = 0 or o.healthProfessionId = :healthProfessionId) " +
                    "  and (b.estabid = :estabid) " +
                    "  and (b.estabid = a.estabid or :sysAdmin = 'Y') " +
                    "  and t2.typeCode = 'Y' " +
                    "  and t2.typeId = t1.flexValue01 " +
                    "  and t1.typeId = o.classOrganizationId " +
                    "order by o.emplid "
    )
    public TwoHealthProfession findHealthProfessionEsocial (@Param("healthProfessionId")Long healthProfessionId,
                                                            @Param("estabid")String estabid,
                                                            @Param("sysAdmin")String sysAdmin);
}
