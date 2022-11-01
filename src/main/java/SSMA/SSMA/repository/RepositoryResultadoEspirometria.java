package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoResultadoEspirometria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryResultadoEspirometria extends JpaRepository <TwoResultadoEspirometria, Long> {

    @Query(
            value = "Select e " +
                    "from TwoResultadoEspirometria e " +
                    "where e.examsResultsId = :examsResultsId " +
                    "order by e.resultadoEspirometriaId "
    )
    public TwoResultadoEspirometria findAllResultadoEspirometria (@Param("examsResultsId")Long examsResultsId);
}
