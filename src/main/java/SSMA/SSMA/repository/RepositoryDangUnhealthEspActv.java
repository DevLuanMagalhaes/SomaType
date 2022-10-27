package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoDangUnhealthEspActv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDangUnhealthEspActv extends JpaRepository <TwoDangUnhealthEspActv, Long> {

    @Query(
            value = "select a from TwoDangUnhealthEspActv a " +
                    "where (a.activitiesCode like :activitiesCode or :activitiesCode is null) " +
                    "  and (a.activitiesDescr like :activitiesDescr or :activitiesDescr is null) " +
                    "order by a.activitiesCode "
    )
    public TwoDangUnhealthEspActv findAllDangUnhealthEspActv (@Param("activitiesCode")String activitiesCode,
                                                              @Param("activitiesDescr")String activitiesDescr);
}
