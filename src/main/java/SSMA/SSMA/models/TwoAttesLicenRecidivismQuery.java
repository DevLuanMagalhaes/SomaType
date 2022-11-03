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
public class TwoAttesLicenRecidivismQuery implements Serializable {

    @Id
    @Column(name="ATTES_LICEN_RECIDIVISM_ID")
    private Long attesLicenRecidivismId;
    @Column(name="ATTESTATION_LICENSE_ID")
    private Long attestationLicenseId;
    @Column(name="ATTESTATION_LICENSE_ID_REF")
    private Long attestationLicenseIdRef;
    @Column(name="CREATED_BY")
    private Long createdBy;
    @Column(name="CREATION_DATE")
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY")
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;
    @Column
    private String cid;
    @Column
    private Timestamp startRemoval;
    @Column
    private Long numberDays;
    @Column
    private Timestamp endRemoval;
    @Column
    private Timestamp creationDateAttestation;
}
