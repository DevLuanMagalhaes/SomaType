package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoAnamnesis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAnamnesis extends JpaRepository <TwoAnamnesis,Long> {

    @Query(
            value =" select o " +
                    "   from TwoAnamnesis o " +
                    "  where (:anamnesisId = -1 or o.anamnesisId = :anamnesisId) " +
                    "    and (:descr is null or UPPER(o.name) like UPPER(:descr))" +
                    "  order by o.name "
    )
    public TwoAnamnesis findAll (@Param("anamnesisId")Long anamnesisId,
                                 @Param("descr")String descr);
}
