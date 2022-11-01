package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoSchedulerEsocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorySchedulerEsocial extends JpaRepository<TwoSchedulerEsocial, Long> {

    @Query(
            value = "select o " +
                    "from TwoSchedulerEsocial o " +
                    "where (:company is null or (:company is not null and o.company = :company )) " +
                    "  and (:schedulerEsocialId = -1 or (:schedulerEsocialId != -1 and o.schedulerEsocialId = :schedulerEsocialId))"
    )
    public TwoSchedulerEsocial findSchedulerEsocial (@Param("company")String company,
                                                     @Param("schedulerEsocialId")Long schedulerEsocialId);
}
