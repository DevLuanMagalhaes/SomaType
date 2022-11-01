package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoTracoAudiomMascaram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RepositoryTracoAudiomMascaram extends JpaRepository <TwoTracoAudiomMascaram, Long> {

    @Query(
            value = "Select t " +
                    "  from TwoTracoAudiomMascaram t " +
                    "where t.tracoAudiometricoId = :tracoAudiometricoId " +
                    "order by t.tracoAudiomMascaramId "
    )
    public TwoTracoAudiomMascaram findTracoAudiomMascaram (@Param("tracoAudiometricoId")Long tracoAudiometricoId);
}
