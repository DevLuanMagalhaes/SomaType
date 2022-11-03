package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoAttestationLicenseHistQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAttestationLicenseHistQuery extends JpaRepository <TwoAttestationLicenseHistQuery, String> {

@Query(
        value = "Select attestation_license_hist_id " +
                "     , attestation_license_id " +
                "     , emplid " +
                "     , empl_rcd " +
                "     , estabid " +
                "     , start_removal " +
                "     , number_days_old " +
                "     , number_days_new " +
                "     , end_removal " +
                "     , last_update_date " +
                "     , creation_date " +
                "  from ssma_attestation_license_hist " +
                " where attestation_license_id = :attestationLicenseId" +
                " order by last_update_date desc ", nativeQuery = true
)
    TwoAttestationLicenseHistQuery findAllHist (@Param("attestationLicenseId")Long attestationLicenseId);
 }
