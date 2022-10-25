//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoComplementaryExams;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryComplementaryExams extends JpaRepository <TwoComplementaryExams, Long> {
//
//    @Query(
//            value ="select e from TwoComplementaryExams e " +
//                    " where e.employeeExamId = :employeeExamId "
//    )
//    public TwoComplementaryExams findAllComplementaryExams (@Param("employeeExamId")Long employeeExamId);
//
//    @Query (
//            value ="select e from TwoComplementaryExams e " +
//                    " where e.complementaryExamsId = :complementaryExamsId "
//    )
//    public TwoComplementaryExams findAllComplementaryExamsById (@Param("complementaryExamsId")Long complementaryExamsId);
//
//    @Query(
//            value ="select e from TwoComplementaryExams e " +
//                    " where e.complExamParentId = :complementaryExamsId "
//    )
//    public TwoComplementaryExams findAllComplementaryExamsUsed (@Param("complementaryExamsId")Long complementaryExamsId);
//}
