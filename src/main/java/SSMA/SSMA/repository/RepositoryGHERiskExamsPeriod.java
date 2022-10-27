package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoGHERiskExamsPeriod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryGHERiskExamsPeriod extends JpaRepository <TwoGHERiskExamsPeriod, Long>{

    @Query(
            value = "Select p from TwoGHERiskExamsPeriod p " +
                    "where p.gheRiskPeriodId = :gheRiskPeriodId "
    )
    public TwoGHERiskExamsPeriod findAllRiskExamsPeriod (@Param("gheRiskPeriodId")Long gheRiskPeriodId);

    @Query(
            value = "Select e " +
                    "from TwoGHE g " +
                    "    ,TwoGheFactorsRisk f " +
                    "    ,TwoGHERiskPeriodicity p " +
                    "    ,TwoGHERiskExamsPeriod e " +
                    "where g.gheId = f.gheId " +
                    "  and f.gheFactorsRiskId = p.gheFactorsRiskId " +
                    "  and p.gheRiskPeriodId = e.gheRiskPeriodId " +
                    "  and g.estabid = :estabid " +
                    "  and e.examId = :examId "
    )
    public TwoGHERiskExamsPeriod findRiskExamsPeriodByExamId (@Param("estabid")String estabid,
                                                              @Param("examId")Long examId);
}
