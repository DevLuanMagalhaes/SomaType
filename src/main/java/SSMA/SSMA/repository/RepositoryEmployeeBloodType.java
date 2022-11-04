package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoEmployeeBloodType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEmployeeBloodType extends JpaRepository <TwoEmployeeBloodType,Long> {

    @Query(
            value = "Select res.BLOOD_TYPE_ID " +
                    "from two_exams_results       res " +
                    "    ,two_complementary_exams cpe " +
                    "    ,two_exams               exa " +
                    "    ,two_type                typ " +
                    "where res.complementary_exams_id = cpe.complementary_exams_id " +
                    "  and cpe.exam_id = exa.exam_id " +
                    "  and exa.exams_result_fields = typ.type_id " +
                    "  and typ.domain_code = 'EXAMS_RESULT_FIELDS' " +
                    "  and typ.type_code = 'SG' " +
                    "  and res.blood_type_id is not null " +
                    "  and cpe.employee_exam_id = (Select max(eex.employee_exam_id)  " +
                    "                              from two_employee_exams      eex " +
                    "                                  ,two_exams_results       res " +
                    "                                  ,two_complementary_exams cpe " +
                    "                                  ,two_exams               exa " +
                    "                                  ,two_type                typ " +
                    "                              where eex.employee_exam_id = cpe.employee_exam_id " +
                    "                                and res.complementary_exams_id = cpe.complementary_exams_id " +
                    "                                and cpe.exam_id = exa.exam_id " +
                    "                                and exa.exams_result_fields = typ.type_id " +
                    "                                and typ.domain_code = 'EXAMS_RESULT_FIELDS' " +
                    "                                and typ.type_code = 'SG' " +
                    "                                and eex.estabid = :estabid " +
                    "                                and (:emplid is null or eex.emplid = :emplid)" +
                    "                                and (:odbPreAdmId is null or eex.odb_pre_adm_id = :odbPreAdmId)) " +
                    "  and rownum = 1 ", nativeQuery = true
            )
    public TwoEmployeeBloodType findEmployeeBloodType (@Param("estabid")String estabid,
                                                       @Param("emplid")String emplid,
                                                       @Param("odbPreAdmId")Long odbPreAdmId);
}
