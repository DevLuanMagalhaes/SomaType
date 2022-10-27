package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoExamsByJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryExamsByJob extends JpaRepository <TwoExamsByJob, Long>{

    @Query(
            value ="Select e from TwoExamsByJob e " +
                    "where (:jobPeriodId is null or e.jobPeriodId = :jobPeriodId) "
    )
    public TwoExamsByJob findExamsByJob (@Param("jobPeriodId")Long jobPeriodId);
}
