package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoJobPeriodicity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryJobPeriodicity extends JpaRepository <TwoJobPeriodicity, Long>{

    @Query(
            value =  "Select e" +
                    " from TwoJobPeriodicity e " +
                    " where (:examsPeriodicityId is null or e.examsPeriodicityId = :examsPeriodicityId) " +
                    " order by e.jobCode "
    )
    public TwoJobPeriodicity findAllJobPeriodicity (@Param("examsPeriodicityId")Long examsPeriodicityId);

    @Query(
            value = "Select a " +
                    " from TwoExamsPeriodicity p " +
                    "    , TwoJobPeriodicity a " +
                    "    , TwoExamsByJob e " +
                    " where p.examsPeriodicityId = a.examsPeriodicityId " +
                    "  and a.jobPeriodId = e.jobPeriodId " +
                    "  and p.examsPeriodicityId = :examsPeriodicityId " +
                    "  and a.jobCode = :jobCode " +
                    "  and e.examsJobCollection.examId = :examId "
    )
    public TwoJobPeriodicity checkDuplicateExamsByJob (@Param("examsPeriodicityId")Long examsPeriodicityId,
                                                       @Param("jobCode")String jobCode,
                                                       @Param("examId")Long examId);

    @Query(
            value = "Select a " +
                    " from TwoExamsPeriodicity p " +
                    "    ,TwoJobPeriodicity a " +
                    " where p.examsPeriodicityId = a.examsPeriodicityId " +
                    "  and p.examsPeriodicityId = :examsPeriodicityId " +
                    "  and a.jobCode = :jobCode "
    )
    public TwoJobPeriodicity checkDuplicateJob (@Param("examsPeriodicityId")Long examsPeriodicityId,
                                                @Param("jobCode")String jobCode);
}
