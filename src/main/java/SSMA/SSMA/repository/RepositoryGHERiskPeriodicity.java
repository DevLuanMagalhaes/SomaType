//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoGHERiskPeriodicity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryGHERiskPeriodicity extends JpaRepository <TwoGHERiskPeriodicity, Long>{
//
//    @Query(
//            value = "Select p from TwoGHERiskPeriodicity p " +
//                    "where p.gheFactorsRiskId = :gheFactorsRiskId "
//    )
//    public TwoGHERiskPeriodicity findAllRiskPeriodicity (@Param("gheFactorsRiskId")Long gheFactorsRiskId);
//}
