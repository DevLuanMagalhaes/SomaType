//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoGheFactorsRisk;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryGheFactorsRisk extends JpaRepository <TwoGheFactorsRisk, Long> {
//
//    @Query(
//            value = "Select f " +
//                    "from TwoGheFactorsRisk f " +
//                    "where ((:gheId is not null and f.gheId = :gheId) or (:gheId is null)) " +
//                    "order by f.factorsRiskIdRO "
//    )
//    public TwoGheFactorsRisk findAllGHEFactorsRisk (@Param("gheId")Long gheId);
//
//    @Query(
//            value = "Select f " +
//                    "from TwoGheFactorsRisk f " +
//                    "where f.factorsRiskIdRO = :factorsRiskId " +
//                    "order by f.factorsRiskIdRO "
//    )
//    public TwoGheFactorsRisk findAllGHEByFactorsRisk (@Param("factorsRiskId")Long factorsRiskId);
//}
