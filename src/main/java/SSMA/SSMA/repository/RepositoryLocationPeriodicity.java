package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoLocationPeriodicity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryLocationPeriodicity extends JpaRepository <TwoLocationPeriodicity, Long> {

    @Query(
            value = "Select e" +
                    " from TwoLocationPeriodicity e " +
                    " where (:examsPeriodicityId is null or e.examsPeriodicityId = :examsPeriodicityId) " +
                    " order by e.location "
    )
    public TwoLocationPeriodicity findAllLocationPeriodicity (@Param("examsPeriodicityId")Long examsPeriodicityId);

    @Query(
            value = "Select a " +
                    "  from TwoExamsPeriodicity p " +
                    "    ,TwoLocationPeriodicity a " +
                    "    ,TwoExamsByLocation e " +
                    "where p.examsPeriodicityId = a.examsPeriodicityId " +
                    "  and a.locationPeriodId = e.locationPeriodId " +
                    "  and p.examsPeriodicityId = :examsPeriodicityId " +
                    "  and a.location = :location " +
                    "  and e.examsLocationCollection.examId = :examId "
    )
    public TwoLocationPeriodicity checkDuplicateExamsByLocation (@Param("examsPeriodicityId")Long examsPeriodicityId,
                                                                 @Param("location")String location,
                                                                 @Param("examId")Long examId);

    @Query(
            value = "Select a " +
                    " from TwoExamsPeriodicity p " +
                    "    ,TwoLocationPeriodicity a " +
                    "where p.examsPeriodicityId = a.examsPeriodicityId " +
                    "  and p.examsPeriodicityId = :examsPeriodicityId " +
                    "  and a.location = :location "
    )
    public TwoLocationPeriodicity checkDuplicateLocation (@Param("examsPeriodicityId")Long examsPeriodicityId,
                                                          @Param("location")String location);
}
