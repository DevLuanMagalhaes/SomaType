package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoBenefitsHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryBenefitsHistory extends JpaRepository <TwoBenefitsHistory, Long> {

    @Query(
            value ="select o " +
                    "  from TwoBenefitsHistory o " +
                    " where o.attestationLicenseId = :attestationLicenseId " +
                    " order by o.beginDate"
    )
    public TwoBenefitsHistory findBenefitsHistory (@Param("attestationLicenseId")Long attestationLicenseId);

    @Query (
            value ="select o " +
                    "  from TwoBenefitsHistory o " +
                    "      ,TwoAttestationLicense a " +
                    "  where o.attestationLicenseId = a.attestationLicenseId " +
                    "    and a.emplid = :emplid " +
                    "  order by o.beginDate"
    )

    public TwoBenefitsHistory findBenefitsHistoryByEmplid (@Param("emplid")String emplid);


}
