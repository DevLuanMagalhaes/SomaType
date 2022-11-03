package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TwoAttestationLicenseHistQuery implements Serializable {

    @Id
    @Column(name="ATTESTATION_LICENSE_HIST_ID")
    private String attestationLicenseHistId;
    @Column(name="ATTESTATION_LICENSE_ID")
    private Long attestationLicenseId;
    @Column(name="EMPLID")
    private String emplid;
    @Column(name="EMPL_RCD")
    private Long emplrcd;
    @Column(name="ESTABID")
    private String estabid;
    @Column(name="START_REMOVAL")
    private Timestamp startRemoval;
    @Column(name="NUMBER_DAYS_OLD")
    private Long numberDaysOld;
    @Column(name="NUMBER_DAYS_NEW")
    private Long numberDaysNew;
    @Column(name="END_REMOVAL")
    private Timestamp endRemoval;
    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;
    @Column(name="CREATION_DATE")
    private Timestamp creationDate;
}
