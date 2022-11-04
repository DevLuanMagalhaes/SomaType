package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoCountFactorsRisk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCountFactorsRisk extends JpaRepository <TwoCountFactorsRisk, String> {

    @Query(
            value = "Select * " +
                    "from (Select count(1) COUNT_FACTORS_RISK " +
                    "      from two_factors_risk " +
                    "      where risk_id = :riskId)", nativeQuery = true
    )
    public TwoCountFactorsRisk countFactorsRisk (@Param("riskId")Long riskId);
}
