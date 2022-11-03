package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoAttesLicenRecidivismQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAttesLicenRecidivismQuery extends JpaRepository <TwoAttesLicenRecidivismQuery, Long> {

    @Query(
            value = " SELECT salr.attes_licen_recidivism_id " +
                    "      , salr.attestation_license_id " +
                    "      , salr.attestation_license_id_ref " +
                    "      , salr.last_update_date " +
                    "      , salr.last_updated_by " +
                    "      , salr.creation_date " +
                    "      , salr.created_by " +
                    "      , st.type_code cid " +
                    "      , sal2.start_removal startRemoval " +
                    "      , sal2.number_days numberDays " +
                    "      , sal2.end_removal endRemoval " +
                    "      , sal2.creation_date creationDateAttestation " +
                    "   FROM two_attestation_license sal " +
                    "      , two_attes_licen_recidivism salr " +
                    "      , two_attestation_license sal2 " +
                    "      , two_type st " +
                    "  WHERE sal.attestation_license_id = :attestationLicenseId " +
                    "    AND sal.attestation_license_id = salr.attestation_license_id " +
                    "    AND salr.attestation_license_id_ref = sal2.attestation_license_id " +
                    "    AND sal2.diagnosis_main_cid_id = st.type_id " +
                    "    AND st.domain_code = 'CID_10' ", nativeQuery = true
    )
    public TwoAttesLicenRecidivismQuery findAttesLicenRecidivismQuery (@Param("attestationLicenseId")Long attestationLicenseId);


}
