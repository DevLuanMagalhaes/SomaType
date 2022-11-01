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
@Table(name = "TWO_FACTORS_RISK")
@SequenceGenerator(name="seqFactorsRiskId", sequenceName="TWO_FACTORS_RISK_S", allocationSize=1)
public class TwoFactorsRisk implements TwoEntity{

    @Id
    @Column(name="FACTORS_RISK_ID", nullable = false)
    //@GeneratedValue(generator="seqFactorsRiskId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long factorsRiskId;
    @Column(name="FACTORS_RISK_CODE", nullable = false, length = 10)
    private String factorsRiskCode;
    @Column(name="FACTORS_RISK_DESCR", nullable = false, length = 100)
    private String factorsRiskDescr;
    @Column(name="FACTORS_ESOC_TAB24_TYPE_ID", nullable = false)
    private Long factorsEsocTab24TypeId;
    @Transient
    private String factorsRiskCodeEsocTab24;
    @Column(name="RISK_ID", nullable = false, length = 6, insertable = false, updatable = false )
    private Long riskIdRO; // Read Only
    @Column(name="ACTIVE", nullable = false, length = 1)
    private String active;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
    @Column(name="RISK_FACTOR_COMPL_DESCR_IND", nullable = false, length = 1)
    private String riskDactorComplDescrInd;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="RISK_ID", referencedColumnName="RISK_ID")
    private TwoRisk riskCollection;
}
