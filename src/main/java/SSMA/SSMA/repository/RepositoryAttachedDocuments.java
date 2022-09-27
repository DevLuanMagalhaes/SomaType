package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoAttachedDocuments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAttachedDocuments extends JpaRepository <TwoAttachedDocuments,Long>{

    @Query(
            value ="Select a from TwoAttachedDocuments a " +
                    "where a.attachId = :attachId "
    )
    public TwoAttachedDocuments findAllAttachedDocuments (@Param("attachId")Long attachId);
}
