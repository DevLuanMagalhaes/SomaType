package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoControlGroupEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryControlGroupEmployee extends JpaRepository <TwoControlGroupEmployee, Long>{

    @Query(
            value = "Select g from TwoControlGroupEmployee g " +
                    "where g.estabid = :estabid " +
                    "  and (:emplid is null or g.emplid = :emplid)" +
                    "  and (:controlGroupId = 0 or g.controlGroupCollection.typeId = :controlGroupId) " +
                    "order by g.emplid, g.initialControlDate"
    )
    public TwoControlGroupEmployee findAllControlGroupEmployee (@Param("estabid")String estabid,
                                                                @Param("emplid")String emplid,
                                                                @Param("controlGroupId")Long controlGroupId);
}
