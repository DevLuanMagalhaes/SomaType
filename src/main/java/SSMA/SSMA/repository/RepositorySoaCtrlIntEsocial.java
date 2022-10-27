package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoSoaCtrlIntEsocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorySoaCtrlIntEsocial extends JpaRepository <TwoSoaCtrlIntEsocial, Long> {

    @Query(
            value = "select o " +
                    "  from TwoSoaCtrlIntEsocial o " +
                    " where o.eventName = :event " +
                    " and  (:company LIKE concat('%;',o.company,';%')) "
    )
    public TwoSoaCtrlIntEsocial findAllEsocialEvents (@Param("event")String event,
                                                      @Param("company")String company);

    @Query(
            value ="select o " +
                    "  from TwoSoaCtrlIntEsocial o " +
                    " where o.id = :id "
    )
    public TwoSoaCtrlIntEsocial findAllEsocialEventsById (@Param("id")Long id);

    @Query(
            value ="select o " +
                    "  from TwoSoaCtrlIntEsocial o " +
                    " where (:flex01 is not null and o.flex01 = :flex01 or :flex01 is null) " +
                    "   and (:flex02     is not null and o.flex02 = :flex02 or :flex02 is null) " +
                    "   and (:flex03 is not null and o.flex03 = :flex03 or :flex03 is null) " +
                    "   and (:flex04 is not null and o.flex04 = :flex04 or :flex04 is null) " +
                    "   and (:flex05 is not null and o.flex05 = :flex05 or :flex05 is null) " +
                    " order by o.id"
    )
    public TwoSoaCtrlIntEsocial findAllEsocialEventsByFlex (@Param("flex01")String flex01,
                                                            @Param("flex02")String flex02,
                                                            @Param("flex03")String flex03,
                                                            @Param("flex04")String flex04,
                                                            @Param("flex05")String flex05);

    @Query(
            value ="select o " +
                    "  from TwoSoaCtrlIntEsocial o " +
                    " where o.parentId = :parentId "
    )
    public TwoSoaCtrlIntEsocial findAllEsocialEventsByparentId (@Param("parentId")Long parentId);

    @Query(
            value = "select o " +
                    "  from TwoSoaCtrlIntEsocial o " +
                    " where o.eventName = 'xxod.ssma_s2240_onesource' " +
                    "   and o.estabId = :estabid " +
                    "   and o.emplid = :emplid " +
                    "   and o.emplRcd = :emplRcd " +
                    "   and o.flex01 = :gheId " +
                    " order by o.id desc "
    )
    public TwoSoaCtrlIntEsocial findAllEsocialEventsByGheAndEmplid (@Param("estabid")String estabid,
                                                                    @Param("emplid")String emplid,
                                                                    @Param("emplRcd")Long emplRcd,
                                                                    @Param("gheId")String gheId);

}
