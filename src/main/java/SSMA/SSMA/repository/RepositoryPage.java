package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPage extends JpaRepository <TwoPage, Long> {

    @Query(
            value = "select o from TwoPage o " +
                    "where ((:pageName is not null and o.pageName like :pageName)" +
                    "   or  (:pageName is null)) " +
                    "order by o.pageName"
    )
    public TwoPage findAllPages (@Param("pageName")String pageName);

}
