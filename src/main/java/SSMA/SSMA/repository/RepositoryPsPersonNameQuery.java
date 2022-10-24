package SSMA.SSMA.repository;

import SSMA.SSMA.models.PsPersonNameQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPsPersonNameQuery extends JpaRepository  <PsPersonNameQuery, Long>{

    @Query(
            value ="SELECT rownum " +
                    "     , ppn.emplid " +
                    "     , ppn.name " +
                    "     , (select ppf.emailid from psoprdefn ppf where ppf.emplid = psoa.emplid and rownum = 1)  emailid " +
                    "     , psoa.empl_rcd emplRcd" +
                    "     , pj.company " +
                    "     , pj.estabid " +
                    "     , pj.hire_dt hireDt " +
                    "     , decode(pj.action,'IPR',pj.hire_dt,'HIR',pj.effdt,'REH',pj.effdt,null) dataAdmissaoUo " +
                    "     , pj.termination_dt terminationDt " +
                    "     , pj.last_hire_dt lastHireDt " +
                    "     , case when (pj.termination_dt >= sysdate or termination_dt is null) THEN " +
                    "         DECODE(#language,'PTB','Ativo','ESA','Activo','Active') " +
                    "       else " +
                    "         DECODE(#language,'PTB','Inativo','ESA','Inactivo','Inativo') " +
                    "       end status " +
                    "     ,pj.jobcode " +
                    "     ,(Select replace(cbo_cd_bra,'-','') CBO " +
                    "       from PS_JOBCODE_TBL_BRA cbo " +
                    "       where cbo.setid = (Select a.setid DEFAULT_SETID " +
                    "                          from sysadm.ps_set_cntrl_group a, " +
                    "                               sysadm.ps_odb_estab_bu_br b, " +
                    "                               ps_estab_tbl              c  " +
                    "                          where c.effdt = (select max(c1.effdt) " +
                    "                                           from ps_estab_tbl c1 " +
                    "                                           where c1.estabid = c.estabid " +
                    "                                             and c1.effdt <= sysdate) " +
                    "                           and c.eff_status = 'A' " +
                    "                           and b.estabid = c.estabid " +
                    "                           and b.effdt = c.effdt " +
                    "                           and a.rec_group_id = 'HR_01' " +
                    "                           and a.setcntrlvalue = b.business_unit " +
                    "                           and b.estabid = pj.estabid)   " +
                    "         and cbo.jobcode = pj.jobcode " +
                    "         and cbo.effdt = (Select max(effdt)   " +
                    "                          from PS_JOBCODE_TBL_BRA c2 " +
                    "                          where c2.setid = cbo.setid " +
                    "                            and c2.jobcode = cbo.jobcode)) cbo" +
                    "     ,(Select reg_esocial_bra " +
                    "       from ps_addl_info_bra a1 " +
                    "       where a1.emplid = ppn.emplid " +
                    "         and a1.empl_rcd = psoa.empl_rcd " +
                    "         and a1.effdt = (select max(effdt) " +
                    "                         from ps_addl_info_bra a2 " +
                    "                         where a2.emplid = a1.emplid " +
                    "                           and a2.empl_rcd = a1.empl_rcd)) regEsocialBra " +
                    "     ,(SELECT ppn.national_id " +
                    "         FROM ps_pers_nid ppn " +
                    "        WHERE ppn.emplid = pj.emplid " +
                    "          AND ppn.national_id_type = 'CPF' " +
                    "          AND ppn.country = pj.reg_region) cpf " +
                    "  FROM ps_person_name ppn " +
                    "     , ps_per_org_asgn psoa " +
                    "     , ps_job pj " +
                    "     , ps_pers_nid ppni  " +
                    "     , ps_odb_ssma_access_function_t posaf " +
                    " WHERE ppn.emplid = psoa.emplid " +
                    "   AND psoa.emplid = pj.emplid " +
                    "   AND psoa.empl_rcd = pj.empl_rcd " +
                    "   AND pj.estabid NOT LIKE '%MIG%'" +
                    "   AND (pj.termination_dt >= SYSDATE OR termination_dt IS NULL or #termination = 'Y') " +
                    "   AND (pj.effdt,pj.effseq) = (select max(pj1.effdt) , max(pj1.effseq) " +
                    "                                 from ps_job pj1 " +
                    "                                where pj1.emplid = pj.emplid " +
                    "                                  and pj1.empl_rcd = pj.empl_rcd " +
                    "                                  and pj1.estabid = pj.estabid " +
                    "                                  and pj1.effdt = (select max(pj2.effdt) " +
                    "                                                     from ps_job pj2 " +
                    "                                                    where pj2.emplid = pj.emplid " +
                    "                                                      and pj2.empl_rcd = pj.empl_rcd" +
                    "                                                      and pj2.estabid = pj.estabid)) " +
                    "   AND (UPPER(:name) is null or UPPER(ppn.name) LIKE UPPER(:name))" +
                    "   AND (:emplid is null or ppn.emplid LIKE :emplid) " +
                    "   AND (:emplrcd = -1 or pj.empl_rcd = :emplrcd ) " +
                    "   AND (:estabid is null or pj.estabid = :estabid ) " +
                    "   AND (pj.estabid = posaf.estabid " +
                    "   AND (pj.deptid = posaf.deptid or posaf.deptid is null)  or :sysAdmin = 'Y') " +
                    "   AND ppni.emplid(+) = pj.emplid  " +
                    "   AND ppni.national_id_type(+) = 'CPF'  " +
                    "   AND ppni.country(+) = pj.reg_region  " +
                    "   AND ( :document is null or ppni.national_id like :document)  " +
                    "   ORDER BY ppn.emplid, psoa.empl_rcd ", nativeQuery = true
    )
    public PsPersonNameQuery findPsPersonName (@Param("name")String name,
                                               @Param("emplid")String emplid,
                                               @Param("emplrcd")String emplrcd,
                                               @Param("estabid")String estabid,
                                               @Param("sysAdmin")String sysAdmin,
                                               @Param("document")String document);

    @Query(
            value ="SELECT rownum " +
                    "     , ppn.emplid " +
                    "     , ppn.name " +
                    "     , (select ppf.emailid from psoprdefn ppf where ppf.emplid = psoa.emplid and rownum = 1)  emailid " +
                    "     , psoa.empl_rcd emplRcd" +
                    "     , pj.company " +
                    "     , pj.estabid " +
                    "     , pj.hire_dt hireDt " +
                    "     , pj.termination_dt terminationDt " +
                    "     , pj.last_hire_dt lastHireDt " +
                    "     ,(SELECT ppn.national_id " +
                    "         FROM ps_pers_nid ppn " +
                    "        WHERE ppn.emplid = pj.emplid " +
                    "          AND ppn.national_id_type = 'CPF' " +
                    "          AND ppn.country = pj.reg_region) cpf " +
                    "     ,(SELECT ppn.national_id " +
                    "         FROM ps_pers_nid ppn " +
                    "        WHERE ppn.emplid = pj.emplid " +
                    "          AND ppn.national_id_type = 'PIS'" +
                    "          AND ppn.country = pj.reg_region ) pis " +
                    "     , (select ppn.national_id " +
                    "          from ps_pers_nid ppn " +
                    "         where ppn.emplid = pj.emplid " +
                    "           and ppn.national_id_type = 'RG'" +
                    "           and ppn.country = pj.reg_region ) rg " +
                    "     ,(Select reg_esocial_bra " +
                    "       from ps_addl_info_bra a1 " +
                    "       where a1.emplid = ppn.emplid " +
                    "         and a1.empl_rcd = psoa.empl_rcd " +
                    "         and a1.effdt = (select max(effdt) " +
                    "                         from ps_addl_info_bra a2 " +
                    "                         where a2.emplid = a1.emplid " +
                    "                           and a2.empl_rcd = a1.empl_rcd)) regEsocialBra " +
                    "  FROM ps_person_name ppn " +
                    "     , ps_per_org_asgn psoa " +
                    "     , ps_job pj " +
                    " WHERE ppn.emplid = psoa.emplid " +
                    "   AND psoa.emplid = pj.emplid " +
                    "   AND psoa.empl_rcd = pj.empl_rcd " +
                    "   AND pj.estabid NOT LIKE '%MIG%'" +
                    "   AND (pj.effdt,pj.effseq) = (select max(pj1.effdt) , max(pj1.effseq) " +
                    "                                 from ps_job pj1 " +
                    "                                where pj1.emplid = pj.emplid " +
                    "                                  and pj1.empl_rcd = pj.empl_rcd " +
                    "                                  and pj1.estabid = pj.estabid " +
                    "                                  and pj1.effdt = (select max(pj2.effdt) " +
                    "                                                     from ps_job pj2 " +
                    "                                                    where pj2.emplid = pj.emplid " +
                    "                                                      and pj2.empl_rcd = pj.empl_rcd " +
                    "                                                      and pj2.estabid = pj.estabid)) " +
                    "   AND pj.emplid = :emplid " +
                    "   AND (:emplrcd = -1 or pj.empl_rcd = :emplrcd)" +
                    "   AND (:estabid is null or pj.estabid = :estabid ) " +
                    "   ORDER BY ppn.emplid, psoa.empl_rcd ", nativeQuery = true
    )
    public PsPersonNameQuery findPsPersonNameByEmplid (@Param("emplid")String emplid,
                                                       @Param("emplrcd")String emplrcd,
                                                       @Param("estabid")String estabid);

    @Query(
            value = " SELECT rownum " +
                    "      , ppm.emplid " +
                    "      , ppm.name " +
                    "      , (SELECT ppn.national_id " +
                    "         FROM ps_pers_nid ppn " +
                    "         WHERE ppn.emplid = ppm.emplid " +
                    "           AND ppn.national_id_type = 'PIS') pis " +
                    "   FROM ps_person_name ppm" +
                    "  WHERE ppm.emplid = :emplid", nativeQuery = true

    )
    public PsPersonNameQuery findNameByEmplid (@Param("emplid")String emplid);

    @Query(
            value = "Select rownum " +
                    "      ,pj1.company " +
                    "      ,pj1.estabid " +
                    "      ,pj1.emplid " +
                    "      ,pj1.empl_rcd emplRcd " +
                    "      ,pj1.hire_dt hireDt " +
                    "      ,pd.name_display name " +
                    "      ,(Select name_display " +
                    "        from PS_NAMES n1 " +
                    "        where n1.emplid = pj1.emplid " +
                    "          and n1.name_type = 'MTR' " +
                    "          and n1.effdt = (Select max(effdt) " +
                    "                          from ps_names n2 " +
                    "                          where n2.emplid = n1.emplid " +
                    "                            and n2.name_type = n1.name_type)) motherName" +
                    "      ,pd.sex " +
                    "      ,(Select xlatlongname " +
                    "        from psxlatitemlang p1 " +
                    "        where fieldname = 'MAR_STATUS' " +
                    "          and p1.fieldvalue = pd.mar_status " +
                    "          and p1.language_cd = 'POR' " +
                    "          and effdt = (Select max(effdt) " +
                    "                       from psxlatitemlang p2 " +
                    "                       where p2.fieldname = p1.fieldname " +
                    "                         and p2.fieldvalue = p1.fieldvalue " +
                    "                         and p2.language_cd = p1.language_cd)) maritalStatus " +
                    "      ,pd.birthdate " +
                    "      ,trunc(months_between(sysdate, pd.birthdate) / 12) age" +
                    "      ,pj1.hr_status hrStatus " +
                    "      ,(Select xlatlongname " +
                    "        from psxlatitemlang p1 " +
                    "        where fieldname = 'HR_STATUS' " +
                    "          and p1.fieldvalue = pj1.hr_status " +
                    "          and p1.language_cd = 'POR' " +
                    "          and effdt = (Select max(effdt) " +
                    "                       from psxlatitemlang p2 " +
                    "                       where p2.fieldname = p1.fieldname " +
                    "                         and p2.fieldvalue = p1.fieldvalue " +
                    "                         and p2.language_cd = p1.language_cd)) hrStatusDescr" +
                    "      ,pj1.jobcode jobcode " +
                    "      ,(Select replace(cbo_cd_bra,'-','') CBO " +
                    "        from PS_JOBCODE_TBL_BRA cbo " +
                    "        where cbo.setid = (Select a.setid DEFAULT_SETID  " +
                    "                           from sysadm.ps_set_cntrl_group a,   " +
                    "                                sysadm.ps_odb_estab_bu_br b,   " +
                    "                                ps_estab_tbl              c   " +
                    "                           where c.effdt = (select max(c1.effdt)   " +
                    "                                            from ps_estab_tbl c1   " +
                    "                                            where c1.estabid = c.estabid   " +
                    "                                              and c1.effdt <= sysdate)   " +
                    "                            and c.eff_status = 'A'   " +
                    "                            and b.estabid = c.estabid   " +
                    "                            and b.effdt = c.effdt  " +
                    "                            and a.rec_group_id = 'HR_01'   " +
                    "                            and a.setcntrlvalue = b.business_unit   " +
                    "                            and b.estabid = pj1.estabid) " +
                    "          and cbo.jobcode = pj1.jobcode " +
                    "          and cbo.effdt = (Select max(effdt) " +
                    "                           from PS_JOBCODE_TBL_BRA c2 " +
                    "                           where c2.setid = cbo.setid " +
                    "                             and c2.jobcode = cbo.jobcode)) cbo" +
                    "      ,pj1.location " +
                    "      ,(SELECT ppn.national_id " +
                    "          FROM ps_pers_nid ppn " +
                    "         WHERE ppn.emplid = pj1.emplid " +
                    "           AND ppn.national_id_type = 'CPF' " +
                    "           AND ppn.country = pj1.reg_region) cpf " +
                    "      ,(SELECT ppn.national_id " +
                    "          FROM ps_pers_nid ppn " +
                    "         WHERE ppn.emplid = pj1.emplid " +
                    "           AND ppn.national_id_type = 'PIS'" +
                    "           AND ppn.country = pj1.reg_region ) pis " +
                    "     , (select ppn.national_id " +
                    "          from ps_pers_nid ppn " +
                    "         where ppn.emplid = pj1.emplid " +
                    "           and ppn.national_id_type = 'RG'" +
                    "           and ppn.country = pj1.reg_region ) rg " +
                    "      ,(SELECT a.descr40 " +
                    "         FROM sysadm.ps_hpyp_cc_tbl a " +
                    "             ,sysadm.ps_hpyp_cc_lang b " +
                    "             ,sysadm.ps_odb_dept_ua c " +
                    "        WHERE a.effdt = (select max(t1.effdt) " +
                    "                           from ps_hpyp_cc_tbl t1 " +
                    "                          where t1.hpyp_cntrl_area = a.hpyp_cntrl_area " +
                    "                            and t1.hpyp_cc_id = a.hpyp_cc_id " +
                    "                            and t1.effdt <= sysdate) " +
                    "          AND a.eff_status = 'A' " +
                    "          AND b.hpyp_cntrl_area(+) = a.hpyp_cntrl_area " +
                    "          AND b.hpyp_cc_id(+) = a.hpyp_cc_id " +
                    "          AND b.effdt(+) = a.effdt " +
                    "          AND b.language_cd(+) = 'POR' " +
                    "          and a.hpyp_cntrl_area = c.hpyp_cntrl_area " +
                    "          and a.hpyp_cc_id = c.hpyp_cc_id " +
                    "          and c.setid = pj1.setid_dept " +
                    "          and c.deptid = pj1.deptid " +
                    "          and c.effdt = (select max(d.effdt) " +
                    "                         from sysadm.ps_odb_dept_ua d " +
                    "                         where d.setid = c.setid " +
                    "                           and d.deptid = c.deptid)) centroCustoDescr " +
                    "      ,(SELECT c1.estabid " +
                    "         FROM sysadm.ps_odb_dept_ua c1 " +
                    "        WHERE c1.setid = pj1.setid_dept " +
                    "          and c1.deptid = pj1.deptid " +
                    "          and c1.effdt = (select max(d1.effdt) " +
                    "                          from sysadm.ps_odb_dept_ua d1 " +
                    "                          where d1.setid = c1.setid " +
                    "                            and d1.deptid = c1.deptid)) uoContabil " +
                    "      ,(Select reg_esocial_bra " +
                    "        from ps_addl_info_bra a1 " +
                    "        where a1.emplid = pj1.emplid " +
                    "          and a1.empl_rcd = pj1.empl_rcd " +
                    "          and a1.effdt = (select max(effdt) " +
                    "                          from ps_addl_info_bra a2 " +
                    "                          where a2.emplid = a1.emplid " +
                    "                            and a2.empl_rcd = a1.empl_rcd)) regEsocialBra " +
                    "from ps_job pj1 " +
                    "    ,ps_personal_data pd " +
                    "where pj1.estabid = #estabid " +
                    "  and pj1.emplid = pd.emplid " +
                    "  and (pj1.effdt, pj1.effseq) = " +
                    "      (Select max(pj2.effdt), max(pj2.effseq) " +
                    "       from ps_job pj2 " +
                    "       where pj2.estabid = pj1.estabid " +
                    "         and pj2.emplid = pj1.emplid " +
                    "         and pj2.empl_rcd = pj1.empl_rcd " +
                    "         and pj2.effdt = (Select max(pj3.effdt) " +
                    "                          from ps_job pj3 " +
                    "                          where pj3.estabid = pj2.estabid " +
                    "                            and pj3.emplid = pj2.emplid" +
                    "                            and pj3.empl_rcd = pj2.empl_rcd ))  " +
                    "  and pd.emplid = :emplid" +
                    "  and pj1.empl_rcd = :emplRcd ", nativeQuery = true
    )
    public PsPersonNameQuery findPsPersonalData (@Param("emplid")String emplid,
                                                 @Param("emplRcd")String emplRcd);

    @Query(
            value = " Select rownum " +
                    "       ,emplid " +
                    "       ,emplRcd " +
                    "       ,terminationDt " +
                    "  from (Select emplid emplid, empl_rcd emplRcd, max(termination_dt) terminationDt " +
                    "          from ps_job " +
                    "         where emplid = :emplid " +
                    "           and empl_rcd = :emplRcd " +
                    "        group by emplid, empl_rcd)", nativeQuery = true
    )
    public PsPersonNameQuery findMaxTerminationDtByEmplid (@Param("emplid")String emplid,
                                                           @Param("emplRcd")String emplRcd);
}
