package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoGHEJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryGHEJob extends JpaRepository <TwoGHEJob, Long>{

    @Query(
            value = "Select g " +
                    "from TwoGHEJob g " +
                    "where ((:gheId is not null and g.gheId = :gheId) or (:gheId is null)) " +
                    "order by g.jobCode "
    )
    public TwoGHEJob findAllGHEJobs (@Param("gheId")Long gheId);

    @Query(
            value = "Select g " +
                    "from TwoGHEJob g " +
                    "where ((:gheId is not null and g.gheId = :gheId) or (:gheId is null))" +
                    "  and g.jobCode = :jobCode " +
                    "order by g.jobCode "
    )
    public TwoGHEJob findAllGHEJobsByJobCode (@Param("gheId")Long gheId,
                                              @Param("jobCode")String jobCode);
}
