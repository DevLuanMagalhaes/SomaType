package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoExamOcupImprDiagn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryExamOcupImprDiagn extends JpaRepository <TwoExamOcupImprDiagn, Long> {

    @Query(
            value ="Select c from TwoExamOcupImprDiagn c " +
                    "where c.examOcupImprDiagnId = :examOcupImprDiagnId "
    )
    public TwoExamOcupImprDiagn findAllExamOcupImprDiagn (@Param("examOcupImprDiagnId")Long examOcupImprDiagnId);

    @Query(
            value ="Select c from TwoExamOcupImprDiagn c " +
                    "where c.exameOcupacionalId = :exameOcupacionalId "
    )
    public TwoExamOcupImprDiagn findImprDiagnByExameOcupacional (@Param("exameOcupacionalId")Long exameOcupacionalId);
}
