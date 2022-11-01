package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoWorkplace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface RepositoryWorkplace extends JpaRepository <TwoWorkplace, Long> {

    @Query(
            value = "Select w " +
                    "from TwoWorkplace w " +
                    "where w.estabid = :estabid " +
                    "  and (:workplaceId = 0 or (w.workplaceId = :workplaceId)) " +
                    "  and (:status is null or (w.workplaceStatusCollection.typeCode = :status)) " +
                    "  and (:workplaceCode is null or (w.workplaceCode = :workplaceCode)) " +
                    "order by w.workplaceCode, w.dtValidFrom desc "

    )
    public TwoWorkplace findSsmaWorkplace (@Param("estabid")String estabid,
                                           @Param("workplaceId")Long workplaceId,
                                           @Param("status")String status,
                                           @Param("workplaceCode")String workplaceCode);

    @Query(
            value = "Select w " +
                    "from TwoWorkplace w " +
                    "where w.workplaceId = :workplaceId "
    )
    public TwoWorkplace findSsmaWorkplaceById (@Param("workplaceId")Long workplaceId);

    @Query(
            value = "Select w " +
                    "from TwoWorkplace w " +
                    "where w.estabid = :estabid" +
                    "  and w.workplaceCode = :workplaceCode"
    )
    public TwoWorkplace findSsmaWorkplaceByCode (@Param("workplaceCode")String workplaceCode);

    @Query(
            value = "Select w1.* " +
                    "from Ssma_Workplace w1 " +
                    "where w1.estabid = :estabid " +
                    "  and w1.workplace_code = :workplaceCode " +
                    "  and w1.dt_valid_from != :dtValidFrom " +
                    "  and trunc(w1.dt_valid_from,'month') = trunc(:dtValidFrom,'month') " +
                    "  and w1.dt_valid_from = (Select max(w2.dt_valid_from) " +
                    "                           from Ssma_Workplace w2 " +
                    "                           where w2.estabid = w1.estabid " +
                    "                             and w2.workplace_code = w1.workplace_code   " +
                    "                             and w2.dt_valid_from != :dtValidFrom " +
                    "                             and trunc(w2.dt_valid_from,'month') = trunc(:dtValidFrom,'month'))", nativeQuery = true
    )
    public TwoWorkplace findWorkplaceByMonth (@Param("estabid")String estabid,
                                              @Param("workplaceCode")String workplaceCode,
                                              @Param("dtValidFrom")Timestamp dtValidFrom);

}
