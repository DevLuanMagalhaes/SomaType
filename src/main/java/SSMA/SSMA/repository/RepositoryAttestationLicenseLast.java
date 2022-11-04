package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoAttestationLicenseLast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RepositoryAttestationLicenseLast extends JpaRepository <TwoAttestationLicenseLast, Long> {

    @Query(
            value ="select tab.* " +
                    "  from (select sal.* " +
                    "          from ssma_attestation_license sal " +
                    "         where sal.emplid = :emplid " +
                    "           and sal.empl_rcd = :emplRcd " +
                    "           and sal.estabid = :estabid " +
                    "           and sal.start_removal = (select max(sal2.start_removal) " +
                    "                                      from ssma_attestation_license sal2 " +
                    "                                     where sal2.emplid = sal.emplid " +
                    "                                       and sal2.empl_rcd = sal.empl_rcd " +
                    "                                       and sal2.estabid = sal.estabid ) " +
                    "         order by sal.start_removal desc) " +
                    "   tab where rownum = 1", nativeQuery = true
    )
    public TwoAttestationLicenseLast findAllLast (@Param("emplid")String emplid,
                                                  @Param("emplRcd")Long emplRcd,
                                                  @Param("estabid")String estabid);
}
