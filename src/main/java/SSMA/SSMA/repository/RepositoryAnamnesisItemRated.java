//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoAnamnesisItemRated;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryAnamnesisItemRated extends JpaRepository <TwoAnamnesisItemRated, Long> {
//
//    @Query(
//            value =" select o " +
//                    "   from TwoAnamnesisItemRated o " +
//                    "  where exists (select a " +
//                    "                  from TwoAnamnesisItemRatedTl a " +
//                    "                 where o.anamnesisItemRatedId = a.anamnesisItemRatedId " +
//                    "                   and (:descr is null or UPPER(a.descr) like UPPER(:descr)) )" +
//                    "  order by o.sequence asc "
//    )
//    public TwoAnamnesisItemRated findAll (@Param("descr")String descr);
//
//    @Query(
//            value = " select o " +
//                    "   from TwoAnamnesisItemRated o " +
//                    "  where o.anamnesisId = :anamnesisId " +
//                    "    and (:anamnesisItemRatedId = -1 or o.anamnesisItemRatedId != :anamnesisItemRatedId) " +
//                    "    and o.sequence = :sequence "
//    )
//    public TwoAnamnesisItemRated findAnamnesisItemRatedBySeq (@Param("anamnesisId")Long anamnesisId,
//                                                              @Param("anamnesisItemRatedId")Long anamnesisItemRatedId,
//                                                              @Param("sequence")String sequence);
//}
