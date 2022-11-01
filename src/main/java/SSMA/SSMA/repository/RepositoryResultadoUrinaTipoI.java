package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoResultadoUrinaTipoI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryResultadoUrinaTipoI extends JpaRepository <TwoResultadoUrinaTipoI, Long> {

    @Query(
            value = "Select u " +
                    "from TwoResultadoUrinaTipoI u " +
                    "where u.examsResultsId = :examsResultsId " +
                    "order by u.resultadoUrinaId "
    )
    public TwoResultadoUrinaTipoI findAllResultadoExameUrina (@Param("examsResultsId")Long examsResultsId);
}
