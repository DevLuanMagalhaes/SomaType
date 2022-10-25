//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoAnamnesisItemRatedTl;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryAnamnesisItemRatedTl extends JpaRepository <TwoAnamnesisItemRatedTl,Long> {
//
//    @Query(
//            value = "select t from TwoAnamnesisItemRatedTl t " +
//                    "  where (:anamnesisItemRatedTlId is null or t.anamnesisItemRatedTlId = :anamnesisItemRatedTlId) " +
//                    " order by t.descr "
//    )
//    public TwoAnamnesisItemRatedTl findAllTranslate (@Param("anamnesisItemRatedTlId")Long anamnesisItemRatedTlId);
//}
