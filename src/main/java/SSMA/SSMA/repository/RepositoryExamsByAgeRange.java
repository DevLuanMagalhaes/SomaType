//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoExamsByAgeRange;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryExamsByAgeRange extends JpaRepository <TwoExamsByAgeRange, Long> {
//
//    @Query(
//            value = "Select e from TwoExamsByAgeRange e " +
//                    "where (:ageRangePeriodId is null or e.ageRangePeriodId = :ageRangePeriodId) "
//    )
//    public TwoExamsByAgeRange findExamsByAgeRange (@Param("ageRangePeriodId")Long ageRangePeriodId);
//}
