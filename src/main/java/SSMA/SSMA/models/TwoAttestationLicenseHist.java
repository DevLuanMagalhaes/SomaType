package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_ATTESTATION_LICENSE_HIST")
public class TwoAttestationLicenseHist implements TwoEntity{

    @Id
    @Column(name=" ATTESTATION_LICENSE_HIST_ID")
    private Long  attestationLicenseHistId;

    @Column(name=" ATTESTATION_LICENSE_ID")
    private String  attestationLicenseId;

    @Column(name="CREATED_BY")
    private Long createdBy;

    @Column(name="CREATION_DATE")
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY")
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;
}
