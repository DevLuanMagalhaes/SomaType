package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoExamsByLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RepositoryExamsByLocation extends JpaRepository <TwoExamsByLocation, Long> {

@Query(
        value ="Select e from TwoExamsByLocation e " +
                "where (:locationPeriodId is null or e.locationPeriodId = :locationPeriodId) "
)
    public TwoExamsByLocation findExamsByLocation (@Param("locationPeriodId")Long locationPeriodId);
}
