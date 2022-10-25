//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoEmployeeExams;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryEmployeeExams extends JpaRepository <TwoEmployeeExams, Long> {
//
//    @Query(
//            value ="select e from TwoEmployeeExams e " +
//                    "where (e.estabid = :estabid or :estabid is null) " +
//                    "  and (e.emplid = :emplid or :emplid is null) " +
//                    "  and (e.emplRcd = :emplRcd or :emplRcd = -1) " +
//                    "  and (e.odbPreAdmId = :odbPreAdmId or :odbPreAdmId is null) "+
//                    "order by e.emplid, e.inclusionDate "
//    )
//    public TwoEmployeeExams findAllEmployeeExams (@Param("estabid")String estabid,
//                                                  @Param("emplid")String emplid,
//                                                  @Param("emplRcd")Long emplRcd,
//                                                  @Param("odbPreAdmId")String odbPreAdmId);
//
//    @Query (
//            value = "select e from TwoEmployeeExams e " +
//                    "where e.functionChangeId = :functionChangeId " +
//                    "order by e.emplid, e.inclusionDate "
//    )
//    public TwoEmployeeExams findEmployeeExamsByFunctionChange (@Param("functionChangeId")Long functionChangeId);
//
//    @Query(
//            value ="select e from TwoEmployeeExams e " +
//                    "where (e.estabid = :estabid) " +
//                    "  and (e.emplid = :emplid or :emplid is null) " +
//                    "  and (e.emplRcd = :emplRcd or :emplRcd = -1) " +
//                    "  and (e.odbPreAdmId = :odbPreAdmId or :odbPreAdmId is null) " +
//                    "  and (e.examType = :examTypeId) "
//    )
//    public TwoEmployeeExams findEmployeeExamsByType (@Param("estabid")String estabid,
//                                                     @Param("emplid")String emplid,
//                                                     @Param("emplRcd")Long emplRcd,
//                                                     @Param("odbPreAdmId")String odbPreAdmId,
//                                                     @Param("examTypeId")Long examTypeId);
//
//    @Query(
//            value = "select e from TwoEmployeeExams e " +
//                    "where e.employeeExamId = (Select max(m.employeeExamId) " +
//                    "                          from TwoEmployeeExams m " +
//                    "                          where m.estabid = :estabid " +
//                    "                            and (:emplid is null or m.emplid = :emplid ) " +
//                    "                            and m.examType = :examTypeId) "
//    )
//    public  TwoEmployeeExams findMaxEmployeeExamsByType (@Param("estabid")String estabid,
//                                                         @Param("emplid")String emplid,
//                                                         @Param("examTypeId")Long examTypeId);
//
//    @Query(
//            value = "select e from TwoEmployeeExams e " +
//                    "where e.estabid = :estabid " +
//                    "  and e.employeeExamId = (Select max(m.employeeExamId) " +
//                    "                          from TwoEmployeeExams m " +
//                    "                          where m.estabid = :estabid " +
//                    "                             and ((:emplid is not null and (m.emplid = :emplid and e.emplRcd = :emplRcd)) " +
//                    "                              or  (:odbPreAdmId is not null and m.odbPreAdmId = :odbPreAdmId ))) "
//    )
//    public TwoEmployeeExams findMaxEmployeeExamsByEmplid (@Param("estabid")String estabid,
//                                                          @Param("emplid")String emplid,
//                                                          @Param("odbPreAdmId")String odbPreAdmId
//                                                          );
//
//    @Query(
//            value = "select e from TwoEmployeeExams e " +
//                    "where e.exameOcupacionalId = :exameOcupacionalId "
//    )
//    public TwoEmployeeExams findEmployeeExamsByExameOcupacional (@Param("exameOcupacionalId")Long exameOcupacionalId);
//
//    @Query(
//            value = "select e from TwoEmployeeExams e " +
//                    "where e.employeeExamId = :employeeExamId "
//    )
//    public TwoEmployeeExams findEmployeeExamsById (@Param("employeeExamId")Long employeeExamId);
//
//    @Query(
//            value = "Select e " +
//                    "  from TwoEmployeeExams e " +
//                    "      ,TwoComplementaryExams c " +
//                    " where e.employeeExamId = c.employeeExamId " +
//                    "   and c.complementaryExamsId = :complementaryExamsId "
//    )
//    public TwoEmployeeExams findEmployeeExamsByComplemExams (@Param("complementaryExamsId")Long complementaryExamsId);
//}
