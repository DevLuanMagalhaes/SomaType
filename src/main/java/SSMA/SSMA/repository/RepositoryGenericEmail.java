//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoGenericEmail;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryGenericEmail extends JpaRepository <TwoGenericEmail, Long>{
//
//    @Query(
//            value = "Select o " +
//                    "  from TwoGenericEmail o " +
//                    " where o.estabid = :estabid " +
//                    "   and (:emailType is null or (o.genericEmailTypeCollection.typeCode = :emailType))"
//    )
//    public TwoGenericEmail findGenericEmail (@Param("estabid")String estabid,
//                                             @Param("emailType")Long emailType);
//}
