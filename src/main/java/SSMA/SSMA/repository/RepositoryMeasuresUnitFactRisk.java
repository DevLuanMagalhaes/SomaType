package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoMeasuresUnitFactRisk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryMeasuresUnitFactRisk extends JpaRepository <TwoMeasuresUnitFactRisk, Long> {

    @Query(
            value = "Select f " +
                    "  from TwoMeasuresUnitFactRisk f" +
                    "      ,TwoType t" +
                    " where t.typeId = f.measuresUnitId " +
                    "   and t.flexValue02 = 'Y' " +
                    "   and ((:factorsRiskId = 0 or f.factorsRiskId = :factorsRiskId )" +
                    "   and (:measuresUnitId = 0 or f.measuresUnitId = :measuresUnitId))  "
    )
    public TwoMeasuresUnitFactRisk findMeasuresUnitFactRisk (@Param("factorsRiskId")Long factorsRiskId,
                                                             @Param("measuresUnitId")Long measuresUnitId);
}
