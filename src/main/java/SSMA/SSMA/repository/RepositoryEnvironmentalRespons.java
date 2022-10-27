package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoEnvironmentalRespons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEnvironmentalRespons extends JpaRepository <TwoEnvironmentalRespons, Long> {

    @Query(
            value =" select e " +
                    "   from TwoEnvironmentalRespons e " +
                    "  where (:environmentalResponsId = -1 or e.environmentalResponsId = :environmentalResponsId) " +
                    "    and (:emplid is null or e.emplid = :emplid ) " +
                    "    and (:emplRcd = -1 or e.emplRcd = :emplRcd ) " +
                    "    and (:estabid is null or e.estabid = :estabid) " +
                    "    and (:responsibleEstabid is null or e.responsibleEstabid = :responsibleEstabid) " +
                    "  order by e.estabid, e.startDate "
    )
    public TwoEnvironmentalRespons findEnvironmentalRespons (@Param("environmentalResponsId")Long environmentalResponsId,
                                                             @Param("emplid")String emplid,
                                                             @Param("emplRcd")Long emplRcd,
                                                             @Param("estabid")String estabid,
                                                             @Param("responsibleEstabid")String responsibleEstabid);
    @Query(
            value =" select e " +
                    " from TwoEnvironmentalRespons e " +
                    " where e.classCouncilNumber = :classCouncilNumber " +
                    "   and e.emplid != :emplid "
    )
    public TwoEnvironmentalRespons findEnvResponsClassCouncilNumber (@Param("emplid")Long emplid);

    @Query(
            value ="Select ra.* " +
                    "  from TwoEnvironmentalRespons ra " +
                    "      ,TwoSoaCtrlIntEsocial mn " +
                    " where ra.responsible_estabid = mn.estabid " +
                    "   and ((to_date(mn.flex_02,'dd/mm/rrrr') between ra.start_date and nvl(ra.end_date,sysdate)) " +
                    "    or  (to_date(nvl(mn.flex_05,sysdate),'dd/mm/rrrr') between ra.start_date and nvl(ra.end_date,sysdate)) " +
                    "    or  (ra.start_date between to_date(mn.flex_02,'dd/mm/rrrr') and to_date(nvl(mn.flex_05,sysdate),'dd/mm/rrrr')) " +
                    "    or  (nvl(ra.end_date,sysdate) between to_date(mn.flex_02,'dd/mm/rrrr') and to_date(nvl(mn.flex_05,sysdate),'dd/mm/rrrr')))    " +
                    "   and mn.id = :soaCtrlIntEsocialId " +
                    "order by ra.start_date", nativeQuery = true
    )
    public TwoEnvironmentalRespons findEnvironmentalResponsS2240 (@Param("soaCtrlIntEsocialId")Long soaCtrlIntEsocialId);
}
