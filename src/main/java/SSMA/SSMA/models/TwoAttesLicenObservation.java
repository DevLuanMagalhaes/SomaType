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
@Table(name = "TWO_ATTES_LICEN_OBSERVATION")
public class TwoAttesLicenObservation implements TwoEntity{

    @Id
    @Column(name = "ATTESTATION_LICENSE_ID")
    private Long attestationLicenseId;

    @Column(name = "ATTES_LICEN_OBSERVATION", nullable = false)
    private String attesLicenObservation;

    @Column(name = "CREATED_BY", nullable = false, length = 1000)
    private Long createdBy;

    @Column(name = "CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name = "LAST_UPDATED_BY")
    private Long lastUpdatedBy;

    @Column(name = "LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;
}
