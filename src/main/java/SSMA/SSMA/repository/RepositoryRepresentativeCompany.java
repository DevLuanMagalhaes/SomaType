package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoRepresentativeCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface RepositoryRepresentativeCompany extends JpaRepository<TwoRepresentativeCompany, Long> {

    @Query(
            value = " select r " +
                    "   from TwoRepresentativeCompany r " +
                    "  where (:representativeCompanyId = -1 or r.representativeCompanyId = :representativeCompanyId) " +
                    "    and (:emplid is null or r.emplid = :emplid ) " +
                    "    and (:emplRcd = -1 or r.emplRcd = :emplRcd ) " +
                    "    and (:estabid is null or r.estabid = :estabid) " +
                    "    and (:responsibleEstabid is null or r.responsibleEstabid = :responsibleEstabid) " +
                    "  order by r.estabid, r.emplid, r.startDate "
    )
    public TwoRepresentativeCompany findRepresentativeCompany (@Param("representativeCompanyId")Long representativeCompanyId,
                                                               @Param("emplid")String emplid,
                                                               @Param("emplRcd")Long emplRcd,
                                                               @Param("estabid")String estabid,
                                                               @Param("responsibleEstabid")String responsibleEstabid);

    @Query(
            value = "Select r.* " +
                    "from ssma_representative_company r " +
                    " where r.responsible_estabid = :responsibleEstabid "+
                    " and to_date(:validDate,'dd/mm/rrrr') between r.start_date and nvl(r.end_date,sysdate) ", nativeQuery = true
    )
    public TwoRepresentativeCompany findRepresCompanyByResponsibleEstabid  (@Param("responsibleEstabid")String responsibleEstabid,
                                                                            @Param("validDate")Timestamp validDate);
    }
