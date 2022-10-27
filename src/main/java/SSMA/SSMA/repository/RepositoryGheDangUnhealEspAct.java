package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoGheDangUnhealEspAct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryGheDangUnhealEspAct extends JpaRepository <TwoGheDangUnhealEspAct, Long>{

    @Query(
            value = "Select g " +
                    "from TwoGheDangUnhealEspAct g " +
                    "where g.gheId = :gheId "
    )
    public TwoGheDangUnhealEspAct findAllGheDangUnhealEspAct (@Param("gheId")Long gheId);
}
