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
@Table(name = "TWO_REMOVAL_FOLLOWUP")
@SequenceGenerator(name="seqRemovalFollowupId", sequenceName="TWO_REMOVAL_FOLLOWUP_S", allocationSize=1)
public class TwoRemovalFollowup implements TwoEntity{

    @Id @Column(name="REMOVAL_FOLLOWUP_ID")

    //@GeneratedValue(generator="seqTypeId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long removalFollowupId;
    @Column(name="ATTESTATION_LICENSE_ID")
    private Long attestationLicenseId;
    @Column(name="REMOVAL_DATE")
    private Timestamp removalDate;
    @Column(name="PROTOCOL_PROCESS")
    private String protocolProcess;
    @Column(name="OBSERVATION")
    private String observation;
    @Column(name="FILE_NAME")
    private String fileName;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
    @Transient
    private String nameLastUpdatedBy;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="REMOVAL_FOLLOWUP_TYPE", referencedColumnName="TYPE_ID")
    private TwoType removalFollowupTypeCollection;

    @Transient
    private TwoAttestationLicense attestationLicenseCollection;
}
