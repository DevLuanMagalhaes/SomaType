package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoHealthCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryHealthCenter extends JpaRepository <TwoHealthCenter, Long> {

    @Query(
            value ="Select h " +
                    "  from TwoHealthCenter h " +
                    "where (:healthCenterId = 0 or h.healthCenterId = :healthCenterId) " +
                    "  and (:code is null or h.code like :code) " +
                    "  and (:descr is null or h.descr like :descr) " +
                    "  and (:estabid is null or h.estabid = :estabid) " +
                    "  and (:cnesCode is null or h.cnesCode = :cnesCode) " +
                    "order by h.healthCenterId "
    )
    public TwoHealthCenter findAllHealthCenter (@Param("healthCenterId")Long healthCenterId,
                                                @Param("code")String code,
                                                @Param("descr")String descr,
                                                @Param("estabid")String estabid,
                                                @Param("cnesCode")String cnesCode);
}
