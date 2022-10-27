package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoMeasuresTechniques;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryMeasuresTechniques extends JpaRepository <TwoMeasuresTechniques, Long> {

    @Query(
            value = "select t from TwoMeasuresTechniques t " +
                    "where ((:code is not null and t.code like :code) " +
                    "   or  (:code is null)) " +
                    "  and ((:descr is not null and t.descr like :descr) " +
                    "   or  (:descr is null)) " +
                    "order by t.code"
    )
    public TwoMeasuresTechniques findAllMeasuresTechniques (@Param("code")String code,
                                                            @Param("descr")String descr);

    @Query(
            value = "select t from TwoMeasuresTechniques t " +
                    "where (t.factorsRiskIdRO = :factorsRiskId) " +
                    "order by t.code"
    )
    public TwoMeasuresTechniques findAllMeasuresTechniquesByFactorsRiskId (@Param("factorsRiskId")Long factorsRiskId);

}
