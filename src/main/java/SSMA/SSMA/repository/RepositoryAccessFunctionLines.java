package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoAccessFunctionLines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAccessFunctionLines extends JpaRepository <TwoAccessFunctionLines, Long> {

    @Query (
            value = "select o " +
                    " from TwoAccessFunctionLines o " +
                    " where (o.accessFunctionId = :AFunctionId or :AFunctionId is null)"
    )
    public TwoAccessFunctionLines findAll (@Param("AFunctionId")Long AFunctionId);
}
