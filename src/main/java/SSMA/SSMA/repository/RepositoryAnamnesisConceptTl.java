//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoAnamnesisConceptTl;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryAnamnesisConceptTl extends JpaRepository <TwoAnamnesisConceptTl, Long> {
//
//    @Query(
//            value ="select t from TwoAnamnesisConceptTl t " +
//                    "where ((:anamnesisConceptId is not null and t.anamnesisConceptId like :anamnesisConceptId) " +
//                    "   or  (:anamnesisConceptId is null)) "+
//                    "order by t.descr "
//    )
//    public TwoAnamnesisConceptTl findAllTranslate (@Param("anamnesisConceptId")Long anamnesisConceptId);
//}
