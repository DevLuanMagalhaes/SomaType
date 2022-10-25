//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoAnamnesisConceptLines;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryAnamnesisConceptLines extends JpaRepository <TwoAnamnesisConceptLines, Long> {
//
//    @Query(
//            value = " select o " +
//                    "   from TwoAnamnesisConceptLines o " +
//                    "  where (:anamnesisConceptLineId = -1 or o.anamnesisConceptLineId = :anamnesisConceptLineId ) " +
//                    "    and (:anamnesisConceptId = -1 or o.anamnesisConceptId = :anamnesisConceptId)" +
//                    "  order by o.sequence "
//    )
//    public TwoAnamnesisConceptLines findAll (@Param("anamnesisConceptLineId")Long anamnesisConceptLineId,
//                                             @Param("anamnesisConceptId")Long anamnesisConceptId);
//
//    @Query(
//            value =" select o " +
//                    "   from TwoAnamnesisConceptLines o " +
//                    "  where (o.anamnesisConceptId = :anamnesisConceptId) " +
//                    "    and (:anamnesisConceptLineId = -1 or o.anamnesisConceptLineId != :anamnesisConceptLineId ) " +
//                    "    and o.sequence = :sequence "
//    )
//    public TwoAnamnesisConceptLines findAnamnesisConceptLinesBySeq (@Param("anamnesisConceptId")Long anamnesisConceptId,
//                                                                    @Param("anamnesisConceptLineId")Long anamnesisConceptLineId,
//                                                                    @Param("sequence")Long sequence);
//}
