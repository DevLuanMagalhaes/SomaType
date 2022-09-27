package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoExamsPeriodicity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryExamsPeriodicity extends JpaRepository <TwoExamsPeriodicity, Long>{

    @Query(
            value = "Select e " +
                    "  from TwoExamsPeriodicity e " +
                    "     , TwoAccessFunctionTmp a " +
                    "where (:estabid is null or e.estabid = :estabid) " +
                    "  and (e.estabid = a.estabid or :sysAdmin = 'Y' )" +
                    "order by e.estabid "
    )
    public TwoExamsPeriodicity findAllExamsPeriodicity (@Param("estabid")String estabid,
                                                        @Param("sysAdmin")String sysAdmin);

    @Query(
            value = "Select e " +
                    "  from TwoExamsPeriodicity e " +
                    "where (:examsPeriodicityId is null or e.examsPeriodicityId = :examsPeriodicityId) "
    )
    public TwoExamsPeriodicity findAllExamsPeriodicityById (@Param("examsPeriodicityId")Long examsPeriodicityId);

    @Query(
            value ="Select e " +
                    "  from TwoExamsPeriodicity e " +
                    "where e.estabid = :estabid " +
                    "  and e.examTypeCollection.typeId = :examTypeId " +
                    "  and (:periodicityExamId = 0 or (:periodicityExamId > 0 and e.periodicityExamCollection.typeId = :periodicityExamId))" +
                    "order by e.validity "
    )
    public TwoExamsPeriodicity findExamsPeriodicityByExamType (@Param("estabid")String estabid,
                                                               @Param("examTypeId")Long examTypeId,
                                                               @Param("periodicityExamId")Long periodicityExamId);
}
