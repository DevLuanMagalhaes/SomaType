//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoAccessFunction;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryAccessFunction extends JpaRepository <TwoAccessFunction, Long> {
//
//    @Query(
//            value =" select o " +
//                    "   from TwoAccessFunction o " +
//                    "      , TwoAccessFunctionTmp a " +
//                    "  where (UPPER(o.accessFunctionName) like UPPER(:AFunctionNm) or UPPER(:AFunctionNm) is null) " +
//                    "    and (o.accessFunctionUO like :AFunctionUO or :AFunctionUO is null) " +
//                    "    and (:status is null or o.accessFunctionStatus = :status) " +
//                    "    and (o.accessFunctionUO = a.estabid or :sysAdmin = 'Y' )"
//)
//    public TwoAccessFunction findAll (@Param("AFunctionNm")String AFunctionNm,
//                                      @Param("AFunctionUO")String AFunctionUO,
//                                      @Param("status")String status,
//                                      @Param("sysAdmin")String sysAdmin);
//
//
//    @Query(
//            value ="select o " +
//                    "  from TwoAccessFunction o " +
//                    " where UPPER(o.accessFunctionName) = UPPER(:accessFunctionName) " +
//                    "   and o.accessFunctionStatus = 'Y' "
//    )
//
//    public TwoAccessFunction findExists (@Param("accessFunctionName")String accessFunctionName);
//}
