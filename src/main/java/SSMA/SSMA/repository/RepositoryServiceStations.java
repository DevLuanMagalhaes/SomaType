package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoServiceStations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryServiceStations extends JpaRepository<TwoServiceStations,Long> {

    @Query(
            value ="select o " +
                    "from TwoServiceStations o " +
                    "   , TwoAccessFunctionTmp a " +
                    "where o.estabid = :estabid" +
                    "  and (o.estabid = a.estabid or :sysAdmin = 'Y') " +
                    "order by o.description "
    )
    public TwoServiceStations findServiceStations (@Param("estabid")String estabid,
                                                   @Param("sysAdmin")String sysAdmin);

    @Query(
            value = "select o " +
                    "from TwoServiceStations o " +
                    "where (o.estabid = :estabid) "  +
                    "order by o.description "
    )
    public TwoServiceStations findServiceStationsId (@Param("estabid")String estabid);


    @Query(
            value = "Select cli.* " +
                    "  from two_service_st_exams_group grp " +
                    "      ,two_service_stations cli " +
                    " where grp.service_stations_id = cli.service_stations_id " +
                    "   and cli.estabid = :estabid " +
                    "   and grp.exam_group_id = :examGroupId " +
                    " order by cli.description " , nativeQuery = true
    )
    public TwoServiceStations findServiceStationsByUoAndExamGroup (@Param("estabid")String estabid,
                                                                   @Param("examGroupId")Long examGroupId);
}
