package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoDeliveryEpi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDeliveryEpi extends JpaRepository <TwoDeliveryEpi, Long> {

    @Query(
            value ="select o " +
                    "  from TwoDeliveryEpi o " +
                    "     , TwoAccessFunctionTmp a " +
                    " where (:emplid is null or o.emplid = :emplid)" +
                    "   and (:estabid is null or o.estabid = :estabid)" +
                    "   and (o.estabid = a.estabid or :sysAdmin = 'Y' )"
    )
    public TwoDeliveryEpi findAll (@Param("emplid")String emplid,
                                   @Param("estabid")String estabid,
                                   @Param("sysAdmin")String sysAdmin);
}
