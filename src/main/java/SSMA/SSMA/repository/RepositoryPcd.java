package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoPcd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface RepositoryPcd extends JpaRepository <TwoPcd, Long> {

    @Query(
            value = "Select p1 " +
                    "from TwoPcd p1 " +
                    "where p1.exameOcupacionalId = :exameOcupacionalId"
    )
    public TwoPcd findAllPcdByExameOcupacional (@Param("exameOcupacionalId")Long exameOcupacionalId);

    @Query(
            value = "Select p1.* " +
                    "  from Two_Pcd p1 " +
                    " where (:estabid is null or p1.estabid = :estabid) " +
                    "   and (:emplid is null or p1.emplid = :emplid) " +
                    "   and (:odbPreAdmId is null or p1.odb_Pre_Adm_Id = :odbPreAdmId) " +
                    "   and trunc(p1.valuation_Date) = (Select max(trunc(p2.valuation_Date)) " +
                    "                                   from Ssma_Pcd p2 " +
                    "                                   where p2.estabid = p1.estabid " +
                    "                                     and (:estabid is null or p2.estabid = :estabid) " +
                    "                                     and (:emplid is null or p2.emplid = :emplid) " +
                    "                                     and (:odbPreAdmId is null or p2.odb_Pre_Adm_Id = :odbPreAdmId) " +
                    "                                     and trunc(p2.valuation_Date) <= trunc(:valuationDate)) " +
                    "   and p1.exame_ocupacional_id = (Select max(p3.exame_ocupacional_id) " +
                    "                                    from Ssma_Pcd p3 " +
                    "                                   where p3.estabid = p1.estabid " +
                    "                                     and (:estabid is null or p3.estabid = :estabid) " +
                    "                                     and (:emplid is null or p3.emplid = :emplid) " +
                    "                                     and (:odbPreAdmId is null or p3.odb_Pre_Adm_Id = :odbPreAdmId) " +
                    "                                     and trunc(p3.valuation_Date) = trunc(p1.valuation_Date)) " +
                    "order by p1.estabid, p1.emplid, p1.pcd_Id ", nativeQuery = true
    )
    public TwoPcd findAllPcd (@Param("estabid")String estabid,
                              @Param("emplid")String emplid,
                              @Param("odbPreAdmId")String odbPreAdmId,
                              @Param("valuationDate")Timestamp valuationDate);
}
