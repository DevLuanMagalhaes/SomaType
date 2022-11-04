package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoAttestationLicensePrevious;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface RepositoryAttestationLicensePrevious extends JpaRepository <TwoAttestationLicensePrevious, Long>{

    @Query(
            value =
                    " SELECT sal.attestation_license_id attestationLicenseId " +
                            "      , st.type_code cid " +
                            "      , sal.start_removal startRemoval " +
                            "      , sal.number_days numberDays " +
                            "      , sal.end_removal endRemoval " +
                            "      , sal.creation_date creationDate " +
                            "   FROM two_attestation_license sal " +
                            "      , two_type st " +
                            "  WHERE sal.estabid = :estabid " +
                            "    AND sal.emplid = :emplid " +
                            "    AND sal.empl_rcd = :emplRcd " +
                            "    AND sal.attestation_license_id != :attestationLicenseId " +
                            "    AND sal.end_removal >= TO_DATE(:startRemoval,'DD/MON/YYYY','NLS_DATE_LANGUAGE = American') - 60 " +
                            "    AND sal.diagnosis_main_cid_id = st.type_id " +
                            "    AND st.domain_code = 'CID_10' ", nativeQuery = true
    )public TwoAttestationLicensePrevious findAttestationsPrevious (@Param("estabid") String estabid,
                                                                    @Param("emplid")String emplid,
                                                                    @Param("emplRcd")Long emplRcd,
                                                                    @Param("attestationLicenseId")Long attestationLicenseId,
                                                                    @Param("startRemoval")Timestamp startRemoval);
}
