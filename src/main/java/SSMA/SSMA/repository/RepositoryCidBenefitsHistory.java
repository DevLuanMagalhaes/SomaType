package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoCidBenefitsHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCidBenefitsHistory extends JpaRepository <TwoCidBenefitsHistory, Long>{

    @Query(
            value = "Select c " +
                    "  from TwoCidBenefitsHistory c " +
                    " where c.benefitsHistoryId = :benefitsHistoryId "
    )
    public TwoCidBenefitsHistory findAllCidBenefitsHistory (@Param("benefitsHistoryId")Long benefitsHistoryId);
}
