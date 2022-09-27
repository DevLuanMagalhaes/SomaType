package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoAnamnesisEstab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAnamnesisEstab extends JpaRepository <TwoAnamnesisEstab, Long> {

    @Query(
            value =" select o " +
                    "   from TwoAnamnesisEstab o " +
                    "  where (:anamnesisId = -1 or o.anamnesisId = :anamnesisId) " +
                    "    and (:estabId is null or o.estabId = :estabId) " +
                    "  order by o.orderSeq "
    )
    public TwoAnamnesisEstab findAll (@Param("anamnesisId")Long anamnesisId,
                                      @Param("estabId")Long estabId);

    @Query(
            value =" select o " +
                    "   from TwoAnamnesisEstab o " +
                    "  where (o.estabId = :estabid) " +
                    "    and (:anamnesisEstabid = -1 or o.anamnesisEstabId != :anamnesisEstabid) " +
                    "    and o.orderSeq = :orderSeq " +
                    "  order by o.orderSeq "
    )
    public TwoAnamnesisEstab findAnamnesisEstabBySeq (@Param("estabid")Long estabid,
                                                      @Param("anamnesisEstabid")Long anamnesisEstabid,
                                                      @Param("orderSeq")Long orderSeq);
}
