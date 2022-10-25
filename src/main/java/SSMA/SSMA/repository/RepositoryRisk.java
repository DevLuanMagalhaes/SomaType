//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoRisk;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryRisk extends JpaRepository <TwoRisk, Long>{
//
//    @Query(
//            value = "select t from TwoRisk t " +
//                    "where (t.riskCode like :riskCode or :riskCode is null) " +
//                    "  and (t.riskDescr like :riskDescr or :riskDescr is null) " +
//                    "order by t.riskCode "
//    )
//    public TwoRisk findAllRisks (@Param("riskCode")String riskCode,
//                                 @Param("riskDescr")String riskDescr);
//}
