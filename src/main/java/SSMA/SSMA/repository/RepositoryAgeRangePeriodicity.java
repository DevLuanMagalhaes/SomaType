//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoAgeRangePeriodicity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryAgeRangePeriodicity extends JpaRepository <TwoAgeRangePeriodicity,Long>{
//
//    @Query(
//            value ="Select e from TwoAgeRangePeriodicity e " +
//                    "where (:examsPeriodicityId is null or e.examsPeriodicityId = :examsPeriodicityId) " +
//                    "order by e.initialAgeRange "
//    )
//    public TwoAgeRangePeriodicity findAllAgeRangePeriodicity (@Param("examsPeriodicityId")Long examsPeriodicityId);
//
//   @Query(
//           value ="Select a " +
//                   "from TwoExamsPeriodicity p " +
//                   "    ,TwoAgeRangePeriodicity a " +
//                   "    ,TwoExamsByAgeRange e " +
//                   "where p.examsPeriodicityId = a.examsPeriodicityId " +
//                   "  and a.ageRangePeriodId = e.ageRangePeriodId " +
//                   "  and p.examsPeriodicityId = :examsPeriodicityId " +
//                   "  and ((:initialAgeRange between a.initialAgeRange and a.finalAgeRange) " +
//                   "   or  (:finalAgeRange between  a.initialAgeRange and a.finalAgeRange) " +
//                   "   or  (a.initialAgeRange between :initialAgeRange and :finalAgeRange) " +
//                   "   or  (a.finalAgeRange between :initialAgeRange and :finalAgeRange)) " +
//                   "  and ((:genderType = 'A' and a.genderType in ('F','M')) " +
//                   "   or  ((:genderType = 'F' or :genderType = 'M') and a.genderType = 'A')) " +
//                   "  and e.examsCollection.examId = :examId "
//   )
//    public TwoAgeRangePeriodicity checkDuplicateExamsByGender (@Param("examsPeriodicityId")Long examsPeriodicityId,
//                                                               @Param("initialAgeRange")String initialAgeRange,
//                                                               @Param("genderType")String genderType,
//                                                               @Param("examId")Long examId);
//}
