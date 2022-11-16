package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoESocialCondAmbTrabalhoDetailQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface RepositoryESocialCondAmbTrabalhoDetailQuery extends JpaRepository <TwoESocialCondAmbTrabalhoDetailQuery,Long> {
    @Query(
            value = "Select mon.id ID " +
                    "      ,mon.company COMPANY " +
                    "      ,mon.estabid ESTABID " +
                    "      ,mon.emplid EMPLID " +
                    "      ,mon.empl_rcd EMPL_RCD " +
                    "      ,ghe.ghe_id GHE_ID " +
                    "      ,ghe.ghe_code GHE_CODE " +
                    "      ,ghe.effective_date EFFECTIVE_DATE " +
                    "      ,(Select l.descr " +
                    "        from two_translate l " +
                    "            ,two_type t " +
                    "        where l.language_code = 'PTB' " +
                    "          and l.table_name = 'TWO_TYPE' " +
                    "          and l.generic_key = t.type_id " +
                    "          and t.type_code = ghe.status " +
                    "          and t.domain_code = 'GHE_STATUS') GHE_STATUS" +
                    "      ,mon.operation OPERATION " +
                    "      ,mon.creation_date CREATION_DATE " +
                    "      ,mon.operation OPERATION " +
                    "      ,mon.creation_date CREATION_DATE " +
                    "      ,mon.status STATUS " +
                    "      ,mon.msg MSG " +
                    "      ,mon.status_return STATUS_RETURN " +
                    "      ,mon.msg_return MSG_RETURN " +
                    "      ,(mon.xml).getClobval() XML " +
                    "      ,mon.gov_return_code GOV_RETURN_CODE" +
                    "      ,mon.gov_return_descr GOV_RETURN_DESCR " +
                    "      ,mon.cd_resposta CD_RESPOSTA " +
                    "      ,mon.desc_resposta DESC_RESPOSTA " +
                    "      ,mon.protocol_onesource PROTOCOL_ONESOURCE " +
                    "      ,mon.government_protocol GOVERNMENT_PROTOCOL " +
                    "      ,mon.created_by CREATED_BY " +
                    "      ,mon.creation_date CREATION_DATE " +
                    "      ,mon.last_updated_by LAST_UPDATED_BY " +
                    "      ,mon.last_update_date LAST_UPDATE_DATE " +
                    "      ,canceled_by CANCELED_BY " +
                    "      ,mon.cancel_date CANCEL_DATE " +
                    "      ,mon.status_before_cancel STATUS_BEFORE_CANCEL " +
                    "      ,mon.event_origin EVENT_ORIGIN " +
                    "      ,mon.parent_id RECTIFICATION_ID " +
                    "      ,(mon.xml_retorno).getClobval() XML_RETORNO " +
                    "from two_ghe                  ghe " +
                    "    ,two_soa_ctrl_int_esocial mon " +
                    "    ,two_access_function_tmp  acs " +
                    "where ghe.ghe_id (+) = to_number(mon.flex_01) " +
                    "  and mon.company = :company " +
                    "  and ((:estabid is not null and mon.estabid = :estabid) or :estabid is null) " +
                    "  and ((:eventName is not null and mon.event_name = :eventName) or :eventName is null) " +
                    "  and ((:periodFrom is not null and trunc(mon.creation_date) between to_date(:periodFrom,'dd/mm/rrrr') and to_date(:periodThru,'dd/mm/rrrr')) or :periodFrom is null) " +
                    "  and ((:emplidList is not null and  " +
                    "       (mon.emplid in (with data as (select :emplidList emplid from dual) " +
                    "                       select to_char(regexp_substr(emplid, '[^,]+', 1, rownum)) emplid " +
                    "                       from data " +
                    "                       connect by level <= length(regexp_replace(emplid, '[^,]+')) + 1))) " +
                    "    or :emplidList is null) " +
                    "  and ((:status is not null and mon.status = :status) or :status is null)" +
                    "  and ((nvl(:sysAdmin,'N') != 'Y' and mon.estabid = acs.estabid) or :sysAdmin = 'Y') " +
                    "order by mon.estabid " +
                    "        ,mon.emplid " +
                    "        ,mon.id ", nativeQuery = true
    )
    public TwoESocialCondAmbTrabalhoDetailQuery findESocialCondAmbTrabalhoDetailQuery (@Param("company")String company,
                                                                                       @Param("estabid")String estabid,
                                                                                       @Param("eventName")String eventName,
                                                                                       @Param("periodFrom")Timestamp periodFrom,
                                                                                       @Param("emplidList")String emplidList,
                                                                                       @Param("status")String status,
                                                                                       @Param("sysAdmin")String sysAdmin);
}
