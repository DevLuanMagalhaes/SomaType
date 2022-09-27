package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoExams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryExams extends JpaRepository <TwoExams, Long> {

    @Query(
            value ="select o from TwoExams o " +
                    "where (o.examCode like :examCode or :examCode is null) " +
                    "  and (o.examDescr like :examDescr or :examDescr is null) " +
                    "order by o.examCode "
    )
    public  TwoExams findExams (@Param("examCode")String examCode,
                                @Param("examDescr")String examDescr);


    @Query(
            value = "select o from TwoExams o " +
                    "where (o.examCode like :examCode or :examCode is null) " +
                    "  and (upper(o.examDescr) like upper(:examDescr) or :examDescr is null)" +
                    "  and exists (Select g from TwoExamsGroupUO g " +
                    "              where g.examIdRO = o.examId " +
                    "                and g.estabid = :estabid) " +
                    "  and o.valid = 'Y' "+
                    "order by o.examCode "
    )
    public TwoExams findExamsExistsGroupUO ( @Param("examCode")String examCode,
                                             @Param("examDescr")String examDescr,
                                             @Param("estabid")String estabid);

    @Query(
            value ="select o from TwoExams o " +
                    "where (o.examCode like :examCode or :examCode is null) " +
                    "  and (upper(o.examDescr) like upper(:examDescr) or :examDescr is null)" +
                    "  and not exists (Select g from TwoExamsGroupUO g " +
                    "                  where g.examIdRO = o.examId " +
                    "                    and g.estabid = :estabid) " +
                    "  and o.valid = 'Y' "+
                    "order by o.examCode "
    )
    public TwoExams findExamsNotExistsGroupUO (@Param("examCode")String examCode,
                                               @Param("examDescr")String examDescr,
                                               @Param("estabid")String estabid);

    @Query(
            value = "select o from TwoExams o " +
                    "where o.examId = :examId " +
                    "order by o.examCode "
    )
    public TwoExams findExamsByExamId (@Param("examId")Long examId);

    @Query(
            value = "select o from TwoExams o " +
                    "where (o.examCode like :examCode or :examCode is null) "  +
                    "  and (upper(o.examDescr) like upper(:examDescr) or :examDescr is null) " +
                    "  and o.valid = 'Y' " +
                    "order by o.examCode "
    )
    public TwoExams findAllValidExams (@Param("examCode")String examCode,
                                       @Param("examDescr")String examDescr);

    @Query(
            value = "select o from TwoExams o " +
                    "where ((:resultFieldId > 0 and o.examResultFieldsCollection.typeId = :resultFieldId or :resultFieldId = 0)" +
                    "  and  (:resultFieldCode is not null and o.examResultFieldsCollection.typeCode = :resultFieldCode or :resultFieldCode is null)) " +
                    "  and o.valid = 'Y' " +
                    "order by o.examCode "
    )
    public TwoExams findExamsByResultFields (@Param("resultFieldId")Long resultFieldId,
                                             @Param("resultFieldCode")String resultFieldCode);
}
