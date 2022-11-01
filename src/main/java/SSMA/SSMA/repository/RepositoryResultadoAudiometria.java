package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoResultadoAudiometria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryResultadoAudiometria extends JpaRepository <TwoResultadoAudiometria, Long> {

    @Query(
            value = "Select a " +
                    "  from TwoResultadoAudiometria a " +
                    "where a.examsResultsId = :examsResultsId " +
                    "order by a.resultadoAudiometriaId "
    )
    public TwoResultadoAudiometria findResultadoAudiometria (@Param("examsResultsId")Long examsResultsId);
}
