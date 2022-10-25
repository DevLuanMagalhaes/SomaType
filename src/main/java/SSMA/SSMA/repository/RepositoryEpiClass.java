//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoEpiClass;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryEpiClass extends JpaRepository <TwoEpiClass, Long>{
//
//    @Query(
//            value =" select o " +
//                    "   from TwoEpiClass o " +
//                    "  where (:epiClassId = -1 or o.epiClassId = :epiClassId) " +
//                    "    and (:epiClassDescr is null or UPPER(o.epiClassDescr) like UPPER(:epiClassDescr)) " +
//                    " order by o.epiClassDescr"
//    )
//    public TwoEpiClass findAllEpiClass (@Param("epiClassId")Long epiClassId,
//                                        @Param("epiClassDescr")String epiClassDescr);
//}
