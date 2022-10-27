package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoAttestationLicense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAttestationLicense extends JpaRepository <TwoAttestationLicense, Long>{

    @Query(
            value = " select o " +
                    "   from TwoAttestationLicense o " +
                    "      , TwoAccessFunctionTmp a " +
                    "  where (:attestationLicenseId = -1 or o.attestationLicenseId = :attestationLicenseId) " +
                    "    and (:emplid is null or o.emplid = :emplid) " +
                    "    and (:emplRcd = -1 or o.emplRcd = :emplRcd) " +
                    "    and (:estabid is null or o.estabid = :estabid) "+
                    "    and (o.estabid = a.estabid or :sysAdmin = 'Y' ) " +
                    "  order by o.emplid asc , o.emplRcd desc , o.endRemoval desc "
    )
    public TwoAttestationLicense findAll (@Param("attestationLicenseId")Long attestationLicenseId,
                                          @Param("emplid")String emplid,
                                          @Param("emplRcd")Long emplRcd,
                                          @Param("estabid")String estabid,
                                          @Param("sysAdmin")String sysAdmin);
}
