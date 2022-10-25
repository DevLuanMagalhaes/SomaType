//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoAnamnesisConcept;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//public interface RepositoryAnamnesisConcept extends JpaRepository <TwoAnamnesisConcept, Long>{
//
//    @Query(
//            value = " select o " +
//                    "   from TwoAnamnesisConcept o " +
//                    "  where exists (select a " +
//                    "                  from TwoAnamnesisConceptTl a " +
//                    "                 where o.anamnesisConceptId = a.anamnesisConceptId " +
//                    "                   and (:descr is null or UPPER(a.descr) like UPPER(:descr)) )" +
//                    "    and (:anamnesisConceptId = -1 or o.anamnesisConceptId = :anamnesisConceptId) " +
//                    "    and (:code is null or UPPER(o.code) like UPPER(:code)) ")
//
//    public TwoAnamnesisConcept findAll (@Param("descr")String descr,
//                                        @Param("anamnesisConceptId")Long anamnesisConceptId,
//                                        @Param("code")String code);
//}
