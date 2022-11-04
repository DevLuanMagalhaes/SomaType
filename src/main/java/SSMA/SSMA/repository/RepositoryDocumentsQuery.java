package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoDocumentsQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDocumentsQuery extends JpaRepository <TwoDocumentsQuery, Long> {

    @Query(
            value = "Select doc.document_id DOCUMENT_ID " +
                    "      ,doc.module MODULE " +
                    "      ,doc.module_descr MODULE_DESCR " +
                    "      ,doc.process PROCESS " +
                    "      ,doc.process_descr PROCESS_DESCR " +
                    "      ,doc.subprocess SUBPROCESS " +
                    "      ,doc.subprocess_descr SUBPROCESS_DESCR " +
                    "      ,doc.item ITEM " +
                    "from (Select d.document_id " +
                    "            ,d.module " +
                    "            ,(Select tl.descr " +
                    "              from two_translate tl " +
                    "                  ,two_type tp " +
                    "              where tl.generic_key = tp.type_id " +
                    "                and tl.table_name = 'TWO_TYPE' " +
                    "                and tp.domain_code = 'TWO_DOCUMENTS.MODULE' " +
                    "                and tp.type_code = d.module" +
                    "                and tl.language_code = :languageCode) module_descr " +
                    "            ,d.process  " +
                    "            ,(Select tl.descr " +
                    "              from two_translate tl " +
                    "                  ,two_type tp " +
                    "              where tl.generic_key = tp.type_id " +
                    "                and tl.table_name = 'TWO_TYPE' " +
                    "                and tp.domain_code = 'TWO_DOCUMENTS.PROCESS' " +
                    "                and tp.type_code = d.process" +
                    "                and tl.language_code = :languageCode) process_descr " +
                    "            ,d.subprocess " +
                    "            ,(Select tl.descr " +
                    "              from two_translate tl " +
                    "                  ,two_type tp " +
                    "              where tl.generic_key = tp.type_id " +
                    "                and tl.table_name = 'TWO_TYPE' " +
                    "                and tp.domain_code = 'TWO_DOCUMENTS.SUBPROCESS' " +
                    "                and tp.type_code = d.subprocess" +
                    "                and tl.language_code = :languageCode) subprocess_descr " +
                    "            ,d.item " +
                    "      from two_documents d) doc " +
                    "order by doc.module_descr, doc.process_descr, doc.subprocess_descr desc, doc.item ", nativeQuery = true
    )
    public TwoDocumentsQuery findDocuments (@Param("languageCode")String languageCode);
}
