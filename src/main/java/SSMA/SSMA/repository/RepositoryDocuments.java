package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoDocuments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDocuments extends JpaRepository <TwoDocuments, Long> {

    @Query(
            value ="Select d from TwoDocuments d " +
                    "where d.module = :module " +
                    "  and d.process = :process " +
                    "  and ((:subprocess is null and d.subprocess is null)" +
                    "   or  (:subprocess is not null and d.subprocess = :subprocess)) "
    )
    public TwoDocuments findAllDoctsByUK (@Param("module")Long module,
                                          @Param("process")Long process,
                                          @Param("subprocess")Long subprocess);
}
