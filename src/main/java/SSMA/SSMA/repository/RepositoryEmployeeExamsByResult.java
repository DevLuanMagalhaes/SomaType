package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoEmployeeExamsByResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEmployeeExamsByResult extends JpaRepository <TwoEmployeeExamsByResult, Long> {

    @Query(
            value = "Select er1.exams_results_id examsResultsId " +
                    "      ,ee1.estabid	" +
                    "	   ,ee1.emplid " +
                    "	   ,ee1.inclusion_date inclusionDate" +
                    "	   ,ce1.exam_id examId " +
                    "  from two_employee_exams ee1 " +
                    "      ,two_complementary_exams ce1 " +
                    "	   ,two_exams_results er1 " +
                    " where ee1.employee_exam_id = ce1.employee_exam_id " +
                    "   and ce1.complementary_exams_id = er1.complementary_exams_id " +
                    "	and er1.exams_results_id = :examsResultsId ", nativeQuery = true
    )
    public TwoEmployeeExamsByResult findEmployeeExamsByResultsExamId (@Param("examsResultsId")Long examsResultsId);
}
