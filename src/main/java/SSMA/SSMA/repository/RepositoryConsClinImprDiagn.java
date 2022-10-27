package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoConsClinImprDiagn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryConsClinImprDiagn extends JpaRepository <TwoConsClinImprDiagn,Long> {

    @Query(
            value = "Select c from TwoConsClinImprDiagn c " +
                    "where c.consClinImprDiagnId = :consClinImprDiagnId "
    )
    public TwoConsClinImprDiagn findAllConsClinImprDiagn (@Param("consClinImprDiagnId")Long consClinImprDiagnId);

}
