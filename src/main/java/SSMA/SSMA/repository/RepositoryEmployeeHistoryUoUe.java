package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoEmployeeHistoryUoUe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEmployeeHistoryUoUe extends JpaRepository <TwoEmployeeHistoryUoUe, Long> {

    @Query(
            value = "select o " +
            "from TwoEmployeeHistoryUoUe o " +
            "where o.cpf = :cpf " +
            "order by o.startDt"
    )
    public TwoEmployeeHistoryUoUe findEmployeeHistoryUoUe (@Param("cpf")String cpf);
}
