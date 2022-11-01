package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_ATTESTATION_LICENSE")
@SequenceGenerator(name="seqAttestationLicenseId", sequenceName="TWO_ATTESTATION_LICENSE_S", allocationSize=1)
public class TwoAttestationLicense implements TwoEntity{

    @Id @Column(name="ATTESTATION_LICENSE_ID", nullable = false, length = 7)
    //@GeneratedValue(generator="seqAttestationLicenseId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long attestationLicenseId;

    @Column(name="EMPLID")
    private String emplid;

    @Transient
    private String name;

    @Column(name="EMPL_RCD")
    private Long emplRcd;

    @Column(name="ESTABID")
    private String estabid;

    @Column(name="SOURCE_ID")
    private Long sourceId;

    @Column(name="DOCTOR")
    private String doctor;

    @Column(name="QTD_DAY_ATTESTATIONS")
    private Long qtdDayAttestations;

    @Column(name="ACCIDENT_WAS_TRAFFIC")
    private String accidentWasTraffic;

    @Column(name="TYPE_OF_TRAFFIC_ACCIDENT_ID")
    private Long typeOfTrafficAccidentId;

    @Column(name="DIAGNOSIS_MAIN_CID_ID")
    private Long diagnosisMainCidId;

    @Column(name="SECONDARY_DIAGNOSIS_CID_ID")
    private Long secondaryDiagnosisCidId;

    @Column(name="REASON_FOR_REMOVAL_ID")
    private Long reasonForRemovalId;

    @Column(name="START_REMOVAL")
    private Timestamp startRemoval;

    @Column(name="NUMBER_DAYS")
    private Long numberDays;

    @Column(name="END_REMOVAL")
    private Timestamp endRemoval;

    @Column(name="COMPANY")
    private String company;

    @Column(name="CREATED_BY")
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @Column(name="RESPONSIBLE_REMOVAL_ID")
    private Long responsibleRemovalId;

    @Column(name="ATTESTED_BY_SAME_CID")
    private String attestedBySameCid;

    @Column(name="COMMENTS")
    private String comments;

    @Column(name="DOCTOR_CLASS_ORGANIZATION_ID")
    private Long doctorClassOrganizationId;

    @Column(name="DOCTOR_CLASS_COUNCIL_NUMBER")
    private String doctorClassCouncilNumber;

    @Column(name="DOCTOR_CLASS_COUNCIL_STATE")
    private String doctorClassCouncilState;

    @Column(name="DOCTOR_CLASS_COUNCIL_COUNTRY")
    private String doctorClassCouncilCountry;

    @Transient
    private TwoType cidCollection;

    @Transient
    private TwoType reasonForRemovalCollection;

    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="ATTESTATION_LICENSE_ID", referencedColumnName="ATTESTATION_LICENSE_ID")
    private List<TwoAttesLicenRecidivism> attesLicenRecidivism;



//    @OneToMany(fetch=FetchType.EAGER, cascade= CascadeType.ALL)
//    @JoinColumn(name="ATTESTATION_LICENSE_ID", referencedColumnName="ATTESTATION_LICENSE_ID")
//    private List<TwoAttestationLicenseHist> attestationLicenseHist;
}
