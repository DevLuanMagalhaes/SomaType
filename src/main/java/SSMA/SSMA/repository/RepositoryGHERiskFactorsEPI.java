//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoGHERiskFactorsEPI;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryGHERiskFactorsEPI extends JpaRepository <TwoGHERiskFactorsEPI, Long>{
//
//    @Query(
//            value = "Select e from TwoGHERiskFactorsEPI e " +
//                    "where e.gheFactorsRiskId = :gheFactorsRiskId "
//    )
//    public TwoGHERiskFactorsEPI findAllRiskEPI (@Param("gheFactorsRiskId")Long gheFactorsRiskId);
//
//    @Query(
//            value = "Select e from TwoGHERiskFactorsEPI e " +
//                    "where e.epiCollection.epiId = :epiId "
//    )
//    public TwoGHERiskFactorsEPI findAllRiskByEPI (@Param("epiId")Long epiId);
//}
