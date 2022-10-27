package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryConfig extends JpaRepository<TwoConfig, Long> {

    @Query(
            value = " Select o " +
                    " from TwoConfig o  " +
                    " where o.configName = :configName"
    )
    public TwoConfig findByConfigName(@Param("configName") String configName);
}
