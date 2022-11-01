package SSMA.SSMA.repository;


import SSMA.SSMA.models.TwoTipoExameFisMental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RepositoryTipoExameFisMental extends JpaRepository<TwoTipoExameFisMental,Long> {

    @Query(
            value = "Select t " +
                    "  from TwoTipoExameFisMental t " +
                    "order by t.tipoExameFisMentalOrdem "
    )
    public TwoTipoExameFisMental findAllTipoExameFisMental ();
}
