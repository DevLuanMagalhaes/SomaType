package SSMA.SSMA.repository;

import SSMA.SSMA.models.PsAddressType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPsAddressType extends JpaRepository <PsAddressType, Long> {

    @Query(
            value = "Select rownum " +
                    "      ,t2.gpbr_esoc_addtype ADDRTYPEESOCIAL " +
                    "      ,t3.xlatlongname ADDRTYPEPS " +
                    "from psxlatitemlang t3 " +
                    "    ,sysadm.ps_gpbr_addr_type t2 " +
                    "    ,psxlatitemlang t1 " +
                    "where t3.fieldname like 'GPBR_ESOC_ADDTYPE' " +
                    "  and t3.fieldvalue = t2.GPBR_ESOC_ADDTYPE " +
                    "  and t2.country = 'BRA' " +
                    "  and t2.address_type_bra = t1.fieldvalue " +
                    "  and t1.fieldname like 'ADDRESS_TYPE_BRA' " +
                    "  and t1.language_cd = 'POR' " +
                    "order by t3.xlatlongname", nativeQuery = true
    )
    public PsAddressType findAllAddressType ();

    @Query(
            value = "Select rownum " +
                    "      ,lg.fieldvalue ADDRESS_TYPE_CODE " +
                    "      ,lg.xlatlongname ADDRESS_TYPE_DESCR " +
                    "  from (Select 'US' language_cd " +
                    "              ,e1.fieldvalue  " +
                    "              ,e1.xlatlongname " +
                    "          from psxlatitem e1 " +
                    "         where fieldname = 'ADDRESS_TYPE_BRA' " +
                    "           and e1.effdt = (Select max(e2.effdt) " +
                    "                             from psxlatitem e2 " +
                    "                            where e2.fieldname = e1.fieldname " +
                    "                              and e2.fieldvalue = e1.fieldvalue) " +
                    "        Union " +
                    "        Select e3.language_cd,  e3.fieldvalue, e3.xlatlongname " +
                    "          from psxlatitemlang e3 " +
                    "         where fieldname = 'ADDRESS_TYPE_BRA' " +
                    "           and e3.effdt = (Select max(e4.effdt) " +
                    "                             from psxlatitemlang e4 " +
                    "                            where e4.fieldname = e3.fieldname " +
                    "                              and e4.fieldvalue = e3.fieldvalue) " +
                    "         order by fieldvalue) lg " +
                    " where lg.language_cd = :languageCd " +
                    "   and (:addressTypeCode is null or (:addressTypeCode is not null and lg.fieldvalue = :addressTypeCode))" +
                    " order by xlatlongname ", nativeQuery = true
    )
    public PsAddressType findAddressTypeBRA (@Param("languageCd")String languageCd,
                                             @Param("addressTypeCode")String addressTypeCode);

    @Query(
            value = "Select rownum " +
                    "      ,t3.address_type ADDRESS_TYPE_CODE " +
                    "      ,t3.addr_type_descr ADDRESS_TYPE_DESCR " +
                    "  from (Select 'US' language_cd   " +
                    "               ,t1.address_type " +
                    "               ,t1.addr_type_descr  " +
                    "           from ps_address_typ_tbl t1 " +
                    "          union " +
                    "         select t2.language_cd " +
                    "               ,t2.address_type " +
                    "               ,t2.addr_type_descr  " +
                    "           from ps_address_typ_lng t2) t3 " +
                    " where t3.language_cd = :languageCd " +
                    "   and (:addressTypeCode is null or (:addressTypeCode is not null and t3.address_type = :addressTypeCode)) " +
                    " order by t3.addr_type_descr", nativeQuery = true
    )
    public PsAddressType findAddressType (@Param("languageCd")String languageCd,
                                          @Param("addressTypeCode")String addressTypeCode);
}
