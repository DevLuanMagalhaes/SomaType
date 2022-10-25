//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoAnamnesisItemResponse;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryAnamnesisItemResponse extends JpaRepository <TwoAnamnesisItemResponse, Long> {
//
//    @Query(
//            value = " select o " +
//                    "   from TwoAnamnesisItemResponse o " +
//                    "  where exists (select a " +
//                    "                  from TwoAnamnesisItemResponsTl a " +
//                    "                 where o.anamnesisItemResponseId = a.anamnesisItemResponseId " +
//                    "                   and (:descr is null or UPPER(a.descr) like UPPER(:descr)) )" +
//                    "  order by o.sequence asc "
//    )
//    public TwoAnamnesisItemResponse findAll (@Param("descr")String descr);
//
//    @Query(
//            value = " Select o " +
//                    " from TwoAnamnesisItemResponse o " +
//                    " where o.anamnesisItemRatedId = :anamnesisItemRatedId" +
//                    "   and (:anamnesisItemResponseId = -1 or o.anamnesisItemResponseId != :anamnesisItemResponseId) " +
//                    "   and o.sequence = :sequence "
//    )
//    public TwoAnamnesisItemResponse findAnamnesisItemResponseBySeq (@Param("anamnesisItemRatedId")Long anamnesisItemRatedId,
//                                                                    @Param("anamnesisItemResponseId")Long anamnesisItemResponseId,
//                                                                    @Param("sequence")Long sequence);
//}
