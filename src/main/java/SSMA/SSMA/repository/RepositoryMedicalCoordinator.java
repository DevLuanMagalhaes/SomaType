package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoMedicalCoordinator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface RepositoryMedicalCoordinator extends JpaRepository <TwoMedicalCoordinator,Long> {

    @Query(
            value = " select m " +
                    "   from TwoMedicalCoordinator m " +
                    "  where (:medicalCoordinatorId = -1 or m.medicalCoordinatorId = :medicalCoordinatorId) " +
                    "    and (:healthProfessionId = -1 or m.healthProfessionId = :healthProfessionId) "+
                    "    and (:responsibleEstabid is null or m.responsibleEstabid = :responsibleEstabid) " +
                    "  order by m.responsibleEstabid, m.startDate"
    )
    public TwoMedicalCoordinator findMedicalCoordinator (@Param("medicalCoordinatorId")Long medicalCoordinatorId,
                                                         @Param("healthProfessionId")Long healthProfessionId,
                                                         @Param("responsibleEstabid")String responsibleEstabid);


    @Query(
            value = " select m1 " +
                    "   from TwoMedicalCoordinator m1 " +
                    "  where m1.responsibleEstabid = :responsibleEstabid " +
                    "    and m1.startDate = (Select max(m2.startDate)" +
                    "                        from TwoMedicalCoordinator m2" +
                    "                        where m2.responsibleEstabid = m1.responsibleEstabid " +
                    "                          and ((m2.startDate < :startDate ) or (:startDate is null)) )" +
                    "  order by m1.startDate desc"
    )
    public TwoMedicalCoordinator findMaxMedicalCoordinator (@Param("responsibleEstabid")String responsibleEstabid,
                                                            @Param("startDate")Timestamp startDate);
}
