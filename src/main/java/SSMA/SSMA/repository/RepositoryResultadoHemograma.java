package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoResultadoHemograma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryResultadoHemograma extends JpaRepository <TwoResultadoHemograma,Long> {

    @Query(
            value = "Select h " +
                    "  from TwoResultadoHemograma h " +
                    "where h.examsResultsId = :examsResultsId " +
                    "order by h.resultadoHemogramaId "
    )
    public TwoResultadoHemograma findAllResultadoHemograma (@Param("examsResultsId")Long examsResultsId);
}
