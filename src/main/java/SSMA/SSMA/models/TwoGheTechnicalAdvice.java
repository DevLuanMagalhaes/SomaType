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
@Table(name = "TWO_GHE_TECHNICAL_ADVICE")
public class TwoGheTechnicalAdvice implements TwoEntity{

    @Id
    @Column(name="GHE_TECHNICAL_ADVICE_ID", nullable = false)
    //@GeneratedValue(generator="seqRiskEpcId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gheTechnicalAdviceId;
    @Column(name="GHE_FACTORS_RISK_ID", nullable = false)
    private Long gheFactorsRiskId;
    @Column(name="SPECIFIC_TECHNICAL_ADVICE")
    private String specificTechnicalAdvice;
    @Column(name="SPEC_TECH_ADVICE_RESPONS")
    private String specTechAdviceRespons;
    @Column(name="SPEC_TECH_ADVICE_PROF_REG")
    private String specTechAdviceProfReg;
    @Column(name="SPEC_TECH_ADVICE_CREATION")
    private Timestamp specTechAdviceCreation;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
