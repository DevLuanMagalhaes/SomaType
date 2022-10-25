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
@Table(name = "TWO_GHE_FACTORS_RISK")
public class TwoGheFactorsRisk implements TwoEntity{


    @Id
    @Column(name="GHE_FACTORS_RISK_ID", nullable = false)
    //@GeneratedValue(generator="seqGHEFactorsRiskId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gheFactorsRiskId;

    @Column(name="GHE_ID", nullable = false)
    private Long gheId;

    @Column(name="FACTORS_RISK_ID", nullable = false, insertable = false, updatable = false)
    private Long factorsRiskIdRO;

    @Column(name="MEASURING_DATE", nullable = false)
    private Timestamp measuringDate;

    @Column(name="EVALUATION_RESULT", nullable = false, length=10)
    private String evaluationResult;

    @Column(name="TOLERANCE_LIMIT", nullable = false, length=10)
    private String toleranceLimit;

    @Column(name="evaluation_conclusion", nullable = false, length=10)
    private String evaluationConclusion;

    @Column(name="CONCLUSION_RESULT", nullable = false, length=50)
    private String conclusionResult;

    @Column(name="EPC_EFFECTIVE", nullable = false, length=1)
    private String epcEffective;
    @Column(name="EPI_EFFECTIVE", nullable = false, length=1)
    private String epiEffective;
    @Column(name="PCMSO_MONITORING")
    private String pcmsoMonitoring;

    @Column(name="INSALUBRITY")
    private String insalubrity;
    @Column(name="DANGEROUSNESS")
    private String dangerousness;
    @Column(name="SPECIAL_RETIRING")
    private String specialRetiring;

    @Column(name="RISK_FACTOR_COMPL_DESCR")
    private String riskFactorComplDescr;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @Transient
    private String gheTechnicalAdviceFilled;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="MEASURING_TECHNIQUES", referencedColumnName="MEASURES_TECHNIQUES_ID")
    private TwoMeasuresTechniques measuringTechniquesCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="EVALUATION", referencedColumnName="TYPE_ID")
    private TwoType evaluationCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="USE_EPC", referencedColumnName="TYPE_ID")
    private TwoType useEPCCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="USE_EPI", referencedColumnName="TYPE_ID")
    private TwoType useEPICollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="FACTORS_RISK_ID", referencedColumnName="FACTORS_RISK_ID")
    private TwoFactorsRisk riskFactorsCollection;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinTable(name = "SSMA_GHE_RISK_FACTORS_EPC",
            joinColumns = { @JoinColumn(name="GHE_FACTORS_RISK_ID", referencedColumnName="GHE_FACTORS_RISK_ID")},
            inverseJoinColumns = {@JoinColumn(name="EPC_ID", referencedColumnName="EPC_ID")})
    private List<TwoEpc> gheRiskFactorsEpcList;

    @OneToMany(orphanRemoval=true, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name="GHE_FACTORS_RISK_ID", referencedColumnName="GHE_FACTORS_RISK_ID")
    private List<TwoGHERiskPeriodicity> gheRiskPeriodicityList;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="MEASURE_UNIT_ID", referencedColumnName="TYPE_ID")
    private TwoType measureUnitCollection;

    @OneToMany(orphanRemoval=true, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name="GHE_FACTORS_RISK_ID", referencedColumnName="GHE_FACTORS_RISK_ID")
    private List<TwoGHERiskFactorsEPI> gheRiskFactorsEpiList;
}
