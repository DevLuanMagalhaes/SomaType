package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoCidQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCidQuery extends JpaRepository<TwoCidQuery, Long> {

    @Query(
            value = "select cid.type_id cidId " +
                    "     , cid.type_code cidCode " +
                    "     , cid_t.descr cidDescr " +
                    "     , cid_class.type_code classCode " +
                    "     , cid_class_t.descr classDescr " +
                    "  from two_type cid " +
                    "     , two_translate cid_t " +
                    "     , two_type cid_class " +
                    "     , twp_translate cid_class_t  " +
                    " where cid.domain_code = 'CID_10' " +
                    "   and to_char(cid.type_id) = cid_t.generic_key " +
                    "   and cid_t.language_code = :languageCode " +
                    "   and cid_t.table_name = 'TWO_TYPE' " +
                    "   and cid.flex_value_01 = to_char(cid_class.type_id) " +
                    "   and cid_class.domain_code = 'CLASSIFICATION_CID_10' " +
                    "   and to_char(cid_class.type_id) = cid_class_t.generic_key " +
                    "   and cid_class_t.language_code = :languageCode " +
                    "   and cid_class_t.table_name = 'SSMA_TYPE' " +
                    "   and (:codCid is null or UPPER(cid.type_code) like UPPER(:codCid)) " +
                    "   and (:descrCid is null or UPPER(cid_t.descr) like UPPER(:descrCid)) " +
                    "   and (:classId = -1 or cid_class.type_id = :classId) ", nativeQuery = true
    )
    public TwoCidQuery findAllCidQuery (@Param("languageCode")String languageCode,
                                        @Param("codCid")String codCid,
                                        @Param("descrCid")String descrCid,
                                        @Param("classId")Long classId);
}
