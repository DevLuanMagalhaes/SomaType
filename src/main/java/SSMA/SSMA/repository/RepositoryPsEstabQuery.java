package SSMA.SSMA.repository;

import SSMA.SSMA.models.PsEstabQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPsEstabQuery extends JpaRepository <PsEstabQuery, String>{

    @Query(
            value ="Select ROWNUM " +
                    "      ,UO.uo UO " +
                    "      ,UO.uo_descr UO_DESCR " +
                    "      ,UO.country COUNTRY " +
                    "      ,UO.company COMPANY " +
                    "      ,(Select c.estab_id_bra " +
                    "        from ps_estab_id_bra c " +
                    "        where c.estabid = UO.uo " +
                    "          and c.estab_id_type_bra = 'CNPJ' " +
                    "          and c.effdt  = (Select max(c2.effdt) " +
                    "                          from ps_estab_id_bra c2 " +
                    "                          where c2.estabid = c.estabid) " +
                    "          and rownum = 1 ) ESTAB_ID_BRA " +
                    "from (Select a.estabid UO, nvl(b.descr, a.descr) UO_DESCR, a.country COUNTRY, a.company COMPANY " +
                    "      from ps_estab_tbl a " +
                    "          ,ps_estab_tbl_lang b " +
                    "      where a.effdt = (select max(a1.effdt) from ps_estab_tbl a1 " +
                    "                       where a.estabid = a1.estabid) " +
                    "      and a.estabid = b.estabid (+) " +
                    "      and a.effdt = b.effdt (+) " +
                    "      and b.language_cd (+) = 'POR') UO " +
                    "   , ps_odb_ssma_access_function_t posaf " +
                    "where (:UO is null or UO.uo like :UO) " +
                    "  and (:UODescr is null or UO.UO_DESCR like :UODescr) " +
                    "  and (UO.uo = posaf.estabid or :sysAdmin = 'Y')" +
                    "order by UO.uo " , nativeQuery = true
    )
    public PsEstabQuery findEstab (@Param("UO")String UO,
                                   @Param("UODescr")String UODescr,
                                   @Param("sysAdmin")String sysAdmin);

    @Query(
            value = "select rownum " +
                    "     , a.estabid UO " +
                    "     , c.descr companyName " +
                    "     , nvl(b.descr, a.descr) UO_DESCR" +
                    "     , a.country COUNTRY " +
                    "     , a.company COMPANY" +
                    "     , a.address1 " +
                    "     , a.address2 " +
                    "     , a.address3 " +
                    "     , a.address4 " +
                    "     , a.city " +
                    "     , a.num1 " +
                    "     , a.state " +
                    "     , a.postal " +
                    "     , (Select estab_id_bra " +
                    "        from ps_estab_id_bra id1 " +
                    "        where id1.estabid = a.estabid " +
                    "          and id1.estab_id_type_bra = 'CNPJ' " +
                    "          and id1.effdt = (Select max(id2.effdt) " +
                    "                           from ps_estab_id_bra id2 " +
                    "                           where id2.estabid = id1.estabid " +
                    "                             and id2.estab_id_type_bra = 'CNPJ') " +
                    "          and rownum = 1) ESTAB_ID_BRA " +
                    "     , (Select b.estab_id_bra " +
                    "        from ps_estab_tbl d, ps_estab_id_bra b " +
                    "        where d.effdt = (select max(a1.effdt) " +
                    "                          from ps_estab_tbl a1 " +
                    "                         where d.estabid = a1.estabid " +
                    "                           and a1.effdt <= sysdate) " +
                    "          and d.eff_status = 'A' " +
                    "          and d.hqunit = 'Y' " +
                    "          and d.country = 'BRA' " +
                    "          and b.estabid = d.estabid " +
                    "          and d.estabid = a.estabid " +
                    "          and b.estab_id_type_bra = 'CNPJ' " +
                    "          and b.effdt = (select max(b1.effdt) " +
                    "                          from ps_estab_id_bra b1 " +
                    "                         where b1.estabid = b.estabid " +
                    "                           and b1.estab_id_type_bra = b.estab_id_type_bra " +
                    "                           and b1.effdt <= sysdate) " +
                    "          and substr(b.estab_id_bra, 1, (length(b.estab_id_bra) - 6)) = " +
                    "            (Select substr(estab_id_bra, 1, (length(estab_id_bra) - 6)) " +
                    "              from ps_estab_id_bra id1 " +
                    "             where id1.estabid = #estabid " +
                    "               and id1.estab_id_type_bra = 'CNPJ' " +
                    "               and id1.effdt = (Select max(id2.effdt) " +
                    "                                from ps_estab_id_bra id2 " +
                    "                                where id2.estabid = id1.estabid " +
                    "                                  and id2.estab_id_type_bra = 'CNPJ') " +
                    "               and rownum = 1)) ESTAB_ID_BRA_COMPANY " +
                    "  from ps_estab_tbl a " +
                    "     , ps_estab_tbl_lang b " +
                    "     , ps_company_tbl c " +
                    " where a.effdt = (select max(a1.effdt) from ps_estab_tbl a1 " +
                    "                  where a.estabid = a1.estabid) " +
                    "   and a.estabid = b.estabid (+) " +
                    "   and a.effdt = b.effdt (+)    " +
                    "        AND c.effdt  =(select max(a1.effdt) from ps_company_tbl a1  \n" +
                    "                  where c.COMPANY  = a1.COMPANY)    " +
                    "   and a.company = c.company (+) " +
                    "   and b.language_cd(+) = 'POR' " +
                    "   and a.estabid = :estabid " , nativeQuery = true
    )
    public PsEstabQuery findNameByEstabid (@Param("estabid")String estabid);

    @Query(
            value = "select rownum " +
                    "     , a.estabid UO " +
                    "     , nvl(b.descr, a.descr) UO_DESCR " +
                    "     , a.country COUNTRY " +
                    "     , a.company COMPANY " +
                    "     , a.address1 " +
                    "     , a.address2 " +
                    "     , a.address3 " +
                    "     , a.address4 " +
                    "     , a.city " +
                    "     , a.num1 " +
                    "     , a.state " +
                    "     , a.postal  " +
                    "from ps_estab_tbl a " +
                    "   , ps_estab_tbl_lang b " +
                    "   , ps_odb_estab_bu_br bu " +
                    "where a.effdt = (select max(a1.effdt) from ps_estab_tbl a1 " +
                    "                 where a.estabid = a1.estabid) " +
                    "  and a.estabid = b.estabid (+) " +
                    "  and a.effdt = b.effdt (+) " +
                    "  and b.language_cd(+) = 'POR' " +
                    "  and a.estabid (+) = bu.estabid " +
                    "  and bu.business_unit = :businessUnit " +
                    "order by a.estabid " , nativeQuery = true
    )
     public  PsEstabQuery  findNameByBusinessUnit (@Param("businessUnit")Long businessUnit);
}
