//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoAttLicenseIntPeople;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryAttLicenseIntPeople extends JpaRepository <TwoAttLicenseIntPeople, Long>{
//
//    @Query(
//            value = "select o " +
//                    "from TwoAttLicenseIntPeople o " +
//                    "    ,TwoAccessFunctionTmp a " +
//                    "where o.interfaceStatus != 'SUCCESS' " +
//                    "  and (:estabid is null or (:estabid is not null and o.estabid = :estabid)) " +
//                    "  and (o.estabid = a.estabid or :sysAdmin = 'Y' )"
//    )
//    public TwoAttLicenseIntPeople findAttLicenseIntPeople (@Param("estabid")String estabid,
//                                                           @Param("sysAdmin")String sysAdmin);
//}
