package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoExameOcupacional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryExameOcupacional extends JpaRepository <TwoExameOcupacional, Long> {

    @Query(
            value ="Select o from TwoExameOcupacional o " +
                    "where o.estabid = :estabid " +
                    "  and (:emplid is null or o.emplid = :emplid) " +
                    "  and (:emplRcd = -1 or o.emplRcd = :emplRcd) " +
                    "  and (:odbPreAdmId is null or o.odbPreAdmId = :odbPreAdmId) " +
                    "order by o.emplid, o.dataAvaliacao desc"
    )
    public TwoExameOcupacional findAllExameOcupaciona (@Param("emplid")String emplid,
                                                       @Param("emplRcd")Long emplRcd,
                                                       @Param("odbPreAdmId")String odbPreAdmId);
    @Query(
            value ="Select eo1 " +
                    "from TwoExameOcupacional eo1 " +
                    "where eo1.estabid = :estabid " +
                    "  and eo1.emplid = :emplid " +
                    "  and eo1.examTypeId = :typeId "+
                    "  and eo1.exameOcupacionalId = (Select max(eo2.exameOcupacionalId)" +
                    "                                from TwoExameOcupacional eo2 " +
                    "                                where eo2.estabid = eo1.estabid" +
                    "                                  and eo2.emplid = eo1.emplid " +
                    "                                  and eo2.examTypeId = eo1.examTypeId)"
    )
    public TwoExameOcupacional findLastPeriodic (@Param("estabid")String estabid,
                                                 @Param("emplid")String emplid,
                                                 @Param("typeId")Long typeId);

    @Query(
            value ="Select o from TwoExameOcupacional o " +
                    "where o.exameOcupacionalId = :exameOcupacionalId "
    )
    public TwoExameOcupacional findAllExameOcupacionalById (@Param("exameOcupacionalId")Long exameOcupacionalId);
}
