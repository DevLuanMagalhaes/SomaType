package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoExamOcupExFisMental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryExamOcupExFisMental extends JpaRepository <TwoExamOcupExFisMental, Long>{

    @Query(
            value ="Select c " +
                    "  from TwoExamOcupExFisMental c " +
                    "where c.exameOcupacionalId = :exameOcupacionalId " +
                    "order by c.exameFisMentalId "
    )
    public TwoExamOcupExFisMental findAllExamOcupExFisMental (@Param("exameOcupacionalId")Long exameOcupacionalId);
}
