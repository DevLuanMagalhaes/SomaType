package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoGheRiskFacEpiQuest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryGheRiskFacEpiQuest extends JpaRepository <TwoGheRiskFacEpiQuest, Long>{

    @Query(
            value = "Select q from TwoGheRiskFacEpiQuest q " +
                    "where q.gheFactorsRiskEpiId = :gheFactorsRiskEpiId "
    )
    public TwoGheRiskFacEpiQuest findGheRiskFacEpiQuest (@Param("gheFactorsRiskEpiId")Long gheFactorsRiskEpiId);
}
