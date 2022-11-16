package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoESocialEventMonitorSummaryQuery;
import SSMA.SSMA.models.TwoESocialEventMonitorSummaryQueryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface RepositoryESocialEventMonitorSummaryQuery extends JpaRepository <TwoESocialEventMonitorSummaryQuery, TwoESocialEventMonitorSummaryQueryId>{

    @Query(
            value = "Select company COMPANY " +
                    "      ,mon.event_name EVENT_NAME" +
                    "      ,(Select descr " +
                    "        from two_translate l " +
                    "            ,two_type t " +
                    "        where l.language_code = 'PTB' " +
                    "          and l.generic_key = t.type_id " +
                    "          and t.domain_code = 'ESOCIAL_EVENTO' " +
                    "          and t.type_code = mon.event_name) EVENTO " +
                    "      ,count(1) TOTAL_EVENTO " +
                    "      ,sum(decode(status,'NOVO',1,0)) NOVO " +
                    "      ,sum(decode(status,'CONCLUIDO COM ADVERTENCIA',1,0)) CONCLUIDO_COM_ADVERTENCIA " +
                    "      ,sum(decode(status,'ERROS',1,0)) ERROS " +
                    "      ,sum(decode(status,'PRONTO PARA ENVIO',1,0)) PRONTO_PARA_ENVIO " +
                    "      ,sum(decode(status,'AGUARDANDO RETORNO',1,0)) AGUARD_RETORNO " +
                    "      ,sum(decode(status,'RETORNO COM ERRO',1,0)) RETORNO_COM_ERRO " +
                    "      ,sum(decode(status,'CONCLUIDO COM EXITO',1,0)) CONCLUIDO_COM_EXITO " +
                    "      ,sum(decode(status,'CANCELADO',1,0)) CANCELADO " +
                    "from two_soa_ctrl_int_esocial mon " +
                    "    ,two_access_function_tmp  acs " +
                    "where ((:company is not null and mon.company = :company) or :company is null) " +
                    "  and ((:estabid is not null and mon.estabid = :estabid) or :estabid is null) " +
                    "  and ((:eventName is not null and mon.event_name = :eventName) or :eventName is null) " +
                    "  and ((:periodFrom is not null and trunc(mon.creation_date) between to_date(:periodFrom,'dd/mm/rrrr') and to_date(:periodThru,'dd/mm/rrrr')) or :periodFrom is null) " +
                    "  and ((:emplidList is not null and  " +
                    "       (mon.emplid in (with data as (select :emplidList emplid from dual) " +
                    "                       select to_char(regexp_substr(emplid, '[^,]+', 1, rownum)) emplid " +
                    "                       from data " +
                    "                       connect by level <= length(regexp_replace(emplid, '[^,]+')) + 1))) " +
                    "    or :emplidList is null) " +
                    "  and ((nvl(:sysAdmin,'N') != 'Y' and mon.estabid = acs.estabid) or :sysAdmin = 'Y') " +
                    "  and mon.company is not null " +
                    "  and exists (select 1 " +
                    "                from two_type typ " +
                    "               where typ.type_code = mon.event_name " +
                    "                 and typ.domain_code = 'ESOCIAL_EVENTO' " +
                    "                 and typ.flex_value_01 = 'Y') "+
                    "group by mon.company " +
                    "        ,mon.event_name " +
                    "order by mon.company " +
                    "        ,mon.event_name ", nativeQuery = true
    )
    public TwoESocialEventMonitorSummaryQuery findESocialEventMonitorSummaryQuery (@Param("company")String company,
                                                                                   @Param("estabid")String estabid,
                                                                                   @Param("eventName")String eventName,
                                                                                   @Param("periodFrom") Timestamp periodFrom,
                                                                                   @Param("emplidList")String emplidList,
                                                                                   @Param("sysAdmin")String sysAdmin);
}
