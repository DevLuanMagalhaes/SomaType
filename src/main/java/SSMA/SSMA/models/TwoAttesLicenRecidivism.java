package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_ATTES_LICEN_RECIDIVISM")
@SequenceGenerator(name="seqAttesLicenRecidivismId", sequenceName="TWO_ATTES_LICEN_RECIDIVISM_S", allocationSize=1)
public class TwoAttesLicenRecidivism implements TwoEntity{

    @Id
    @Column(name="ATTES_LICEN_RECIDIVISM_ID")
    //@GeneratedValue(generator="seqAttesLicenRecidivismId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long attesLicenRecidivismId;

    @Column(name="ATTESTATION_LICENSE_ID")
    private Long attestationLicenseId;

    @Column(name="ATTESTATION_LICENSE_ID_REF")
    private Long attestationLicenseIdRef;

    @Column(name="CREATED_BY")
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
