package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoRemovalFollowup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryRemovalFollowup extends JpaRepository <TwoRemovalFollowup, Long>{

    @Query(
            value ="select o " +
                    "  from TwoRemovalFollowup o " +
                    " where o.attestationLicenseId = :attestationLicenseId " +
                    " order by o.removalDate desc"
    )
    public TwoRemovalFollowup findRemovalFollowup (@Param("attestationLicenseId")Long attestationLicenseId);

    @Query(
            value = "select o " +
                    "  from TwoRemovalFollowup o " +
                    "      ,TwoAttestationLicense a " +
                    " where o.attestationLicenseId = a.attestationLicenseId " +
                    "  and a.emplid = :emplid " +
                    " order by a.startRemoval desc, o.removalDate desc"
    )
    public TwoRemovalFollowup findRemovalFollowupByEmplid (@Param("emplid")String emplid);
}
