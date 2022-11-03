package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoAttachedDocumentsQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAttachedDocumentsQuery extends JpaRepository <TwoAttachedDocumentsQuery, Long> {

    @Query(
            value = "Select a.attach_id ATTACH_ID\n" +
                    "      ,a.document_id DOCUMENT_ID\n" +
                    "      ,a.language_code LANGUAGE_CODE\n" +
                    "      ,a.file_name FILE_NAME\n"+
                    "from TWO_ATTACHED_DOCUMENTS a \n" +
                    "where a.document_id = :documentId ", nativeQuery = true
    )
    public TwoAttachedDocumentsQuery findAttachDocuments (@Param("documentId")Long documentId);


    @Query(
            value =  "Select a.attach_id ATTACH_ID\n" +
                    "      ,a.document_id DOCUMENT_ID\n" +
                    "      ,a.language_code LANGUAGE_CODE\n" +
                    "      ,a.file_name FILE_NAME\n"+
                    "from TWO_ATTACHED_DOCUMENTS a \n" +
                    "where a.file_name = :fileName " , nativeQuery = true
    )
    public TwoAttachedDocumentsQuery findAttachDocumentsByFileName (@Param("fileName")String fileName);
}
