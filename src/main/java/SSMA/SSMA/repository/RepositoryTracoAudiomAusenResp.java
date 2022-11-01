package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoTracoAudiomAusenResp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RepositoryTracoAudiomAusenResp extends JpaRepository <TwoTracoAudiomAusenResp,Long> {

    @Query(
            value = "Select t " +
                    "  from TwoTracoAudiomAusenResp t " +
                    "where t.tracoAudiometricoId = :tracoAudiometricoId " +
                    "order by t.tracoAudiomAusenRespId "
    )
    public TwoTracoAudiomAusenResp findTracoAudiomAusenResp (@Param("tracoAudiometricoId")Long tracoAudiometricoId);
}
