package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoCatCausativeAgent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCatCausativeAgent extends JpaRepository <TwoCatCausativeAgent, Long>{

    @Query(
            value ="select o from TwoCatCausativeAgent o " +
                    "where (o.catId = :catId or :catId is null) "
    )
    public TwoCatCausativeAgent findCatCausativeAgent (@Param("catId")Long catId);
}
