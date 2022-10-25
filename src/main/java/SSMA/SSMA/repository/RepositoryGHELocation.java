package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoGHELocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryGHELocation extends JpaRepository <TwoGHELocation, Long> {

    @Query(
            value = "Select l " +
                    "from TwoGHELocation l " +
                    "where ((:gheId is not null and l.gheId = :gheId) or (:gheId is null)) " +
                    "order by l.gheId "
    )
    public TwoGHELocation findAllGHELocations (@Param("gheId")Long gheId);

    @Query(
            value = "Select l " +
                    "from TwoGHELocation l " +
                    "where ((:gheId is not null and l.gheId = :gheId) or (:gheId is null)) " +
                    " and l.location = :location " +
                    "order by l.gheId "
    )
    public TwoGHELocation findAllGHELocationsByLoc (@Param("gheId")Long gheId,
                                                    @Param("location")String location);
}
