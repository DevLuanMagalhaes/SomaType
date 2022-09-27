package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoAnamnesisConceptLinTl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAnamnesisConceptLinTl extends JpaRepository <TwoAnamnesisConceptLinTl, Long> {

    @Query(
            value = "select t from TwoAnamnesisConceptLinTl t " +
                    "where ((:anamnesisConceptLineId is not null and t.anamnesisConceptLineId like :anamnesisConceptLineId) " +
                    "   or  (:anamnesisConceptLineId is null)) "+
                    "order by t.descr "
    )
    public TwoAnamnesisConceptLinTl findAllTranslate (@Param("anamnesisConceptLineId")Long anamnesisConceptLineId);
}
