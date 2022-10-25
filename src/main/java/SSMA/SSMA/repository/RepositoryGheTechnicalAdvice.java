package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoGheTechnicalAdvice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryGheTechnicalAdvice extends JpaRepository <TwoGheTechnicalAdvice, Long> {

        @Query(
                value = "Select f " +
                        "from TwoGheTechnicalAdvice f " +
                        "where f.gheFactorsRiskId = :gheFactorsRiskId "
        )
        public TwoGheTechnicalAdvice findGheTechnicalAdviceByFR (@Param("gheFactorsRiskId")Long gheFactorsRiskId);
        }
