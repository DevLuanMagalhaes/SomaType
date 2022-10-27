package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoAnamnesisItemResponsTl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAnamnesisItemResponsTl extends JpaRepository <TwoAnamnesisItemResponsTl, Long> {

    @Query(
            value =" select t " +
                    "   from TwoAnamnesisItemResponsTl t " +
                    "  where (:anamnesisItemResponseTlId is null or t.anamnesisItemResponseTlId = :anamnesisItemResponseTlId) " +
                    "   order by t.descr "
    )
    public TwoAnamnesisItemResponsTl findAllTranslate (@Param("anamnesisItemResponseTlId")Long anamnesisItemResponseTlId);
}
