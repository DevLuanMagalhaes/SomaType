//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoEpi;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.sql.Timestamp;
//
//@Repository
//public interface RepositoryEpi extends JpaRepository <TwoEpi, Long> {
//
//    @Query(
//            value ="select o " +
//                    "  from TwoEpi o " +
//                    "     , TwoAccessFunctionTmp a " +
//                    " where (o.epiCa like :epiCa or :epiCa is null) " +
//                    "   and (upper(o.epiDescr) like upper(:epiDescr) or :epiDescr is null) " +
//                    "   and (o.estabid = :estabid or :estabid is null) " +
//                    //"   and (o.validToDate >= CURRENT_DATE and o.status = 'A' or :status = 'ALL') " +
//                    "   and (o.validToDate >= :validToDate and o.status = 'A' or :status = 'ALL') " +
//                    "   and (o.estabid = a.estabid or :sysAdmin = 'Y' ) " +
//                    " order by o.epiCa, o.validToDate desc" )
//
//    public TwoEpi findAllEpi (@Param("epiCa")String epiCa,
//                              @Param("epiDescr")String epiDescr,
//                              @Param("estabid")String estabid,
//                              @Param("validToDate") Timestamp validToDate,
//                              @Param("status")String status,
//                              @Param("sysAdmin")String sysAdmin);
//}
