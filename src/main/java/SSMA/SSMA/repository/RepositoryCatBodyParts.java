package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoCatBodyParts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCatBodyParts extends JpaRepository <TwoCatBodyParts, Long> {

    @Query(
            value ="select o from TwoCatBodyParts o " +
                    "where (o.catId = :catId or :catId is null) "
    )
    public TwoCatBodyParts findCatBodyParts (@Param("catId")Long catId);
}
