package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoGHERiskFactorsEPC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryGHERiskFactorsEPC extends JpaRepository <TwoGHERiskFactorsEPC, Long> {

    @Query(
            value = "Select e from TwoGHERiskFactorsEPC e " +
                    "where e.gheFactorsRiskId = :gheFactorsRiskId "
    )
    public TwoGHERiskFactorsEPC findAllRiskEPC (@Param("gheFactorsRiskId")Long gheFactorsRiskId);

    @Query(
            value = "Select e from TwoGHERiskFactorsEPC e " +
                    "where e.epcId = :epcId "
    )
    public TwoGHERiskFactorsEPC findAllRiskByEPC (@Param("epcId")Long epcId);
}
