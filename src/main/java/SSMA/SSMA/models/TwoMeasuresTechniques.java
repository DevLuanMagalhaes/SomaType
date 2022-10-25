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
@Table(name = "TWO_MEASURES_TECHNIQUES")
public class TwoMeasuresTechniques implements TwoEntity{

    @Id
    @Column(name="MEASURES_TECHNIQUES_ID", nullable = false)
    //@GeneratedValue(generator="seqMeasuresTechniquesId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long measuresTechniquesId;
    @Column(name="CODE", nullable = false, length = 30)
    private String code;
    @Column(name="DESCR", nullable = false, length = 110)
    private String descr;

    /*
    @Column(name="RISK_ID", nullable = false)
    private Long riskId;
    */
    @Column(name="FACTORS_RISK_ID", nullable = false, insertable = false, updatable = false )
    private Long factorsRiskIdRO; // Read Only

    @Column(name="REFERENCE_NORM", nullable = false, length= 40)
    private String referenceNorm;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="RISK_ID", referencedColumnName="RISK_ID")
    private TwoRisk riskCollection;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="FACTORS_RISK_ID", referencedColumnName="FACTORS_RISK_ID")
    private TwoFactorsRisk factorsRiskCollection;
}
