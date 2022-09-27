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
@Table(name = "TWO_BENEFITS_HISTORY")
public class TwoBenefitsHistory implements TwoEntity{

    @Id @Column(name="BENEFITS_HISTORY_ID")
    //@GeneratedValue(generator="seqBenefitsHistoryId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long benefitsHistoryId;

    @Column(name="ATTESTATION_LICENSE_ID")
    private Long attestationLicenseId;

    @Column(name="BEGIN_DATE")
    private Timestamp beginDate;

    @Column(name="END_DATE")
    private Timestamp endDate;

    @Column(name="BENEFIT_NUMBER")
    private String benefitNumber;

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
    @JoinColumn(name="BENEFIT_TYPE", referencedColumnName="TYPE_ID")
    private TwoType benefitTypeCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="COD_AGENCIA_INSS", referencedColumnName="TYPE_ID")
    private TwoType codAgenciaINSSCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="COD_CID", referencedColumnName="TYPE_ID")
    private TwoType codCIDCollection;

    @OneToMany(orphanRemoval=true, fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="BENEFITS_HISTORY_ID", referencedColumnName="BENEFITS_HISTORY_ID")
    private List<TwoCidBenefitsHistory> cidBenefitsHistoryList;

    @Transient
    private TwoAttestationLicense attestationLicenseCollection;
}
