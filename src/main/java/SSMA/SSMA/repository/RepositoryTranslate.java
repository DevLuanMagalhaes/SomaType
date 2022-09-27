package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoTranslate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTranslate extends JpaRepository <TwoTranslate, Long>{

    @Query(
            value = "select t from TwoTranslate t " +
                    "where t.tableName = 'TWO_TYPE' " +
                    "  and ((:genericKey is not null and t.genericKey like :genericKey) " +
                    "   or  (:genericKey is null)) "+
                    "order by t.descr "
    )
    public TwoTranslate findAllTranslate (@Param("genericKey")Long genericKey);
}
