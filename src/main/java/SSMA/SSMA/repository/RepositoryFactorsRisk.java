//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoFactorsRisk;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryFactorsRisk extends JpaRepository <TwoFactorsRisk, Long>{
//
//    @Query(
//            value = "select t from TwoFactorsRisk t " +
//                    "where ((:factorsRiskCode is not null and t.factorsRiskCode like :factorsRiskCode) " +
//                    "   or  (:factorsRiskCode is null)) "+
//                    "  and ((:factorsRiskDescr is not null and t.factorsRiskDescr like :factorsRiskDescr) " +
//                    "   or  (:factorsRiskDescr is null)) " +
//                    "  and ((:riskId = 0) or (t.riskIdRO = :riskId)) " +
//                    "  and ((:factorsRiskId = 0) or (t.factorsRiskId = :factorsRiskId)) " +
//                    "  and (:active is null or t.active = :active) " +
//                    "order by t.factorsRiskCode"
//    )
//    public TwoFactorsRisk findAllFactorsRisks (@Param("factorsRiskCode")String factorsRiskCode,
//                                               @Param("factorsRiskDescr")String factorsRiskDescr,
//                                               @Param("riskId")Long riskId,
//                                               @Param("factorsRiskId")Long factorsRiskId,
//                                               @Param("active")String active);
//
//    @Query(
//            value = "select t from TwoFactorsRisk t " +
//                    "where (t.riskIdRO = :riskId) " +
//                    "order by t.factorsRiskCode"
//    )
//    public TwoFactorsRisk findAllFactorsRisksByRiskId (@Param("riskId")Long riskId);
//}
