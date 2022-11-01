package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoTracoAudiometrico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTracoAudiometrico extends JpaRepository <TwoTracoAudiometrico, Long> {

    @Query(
            value ="Select t " +
                    "  from TwoTracoAudiometrico t " +
                    "where t.examsResultsId = :examsResultsId " +
                    "order by t.tracoAudiometricoId "
    )
    public TwoTracoAudiometrico findTracoAudiometrico (@Param("examsResultsId")Long examsResultsId);
}
