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
@Table(name = "TWO_MEASURES_UNIT_FACT_RISK")
@SequenceGenerator(name="seqMeasuresFactRiskId", sequenceName="TWO_MEASURES_FACT_RISK_S", allocationSize=1)
public class TwoMeasuresUnitFactRisk implements TwoEntity{

    @Id
    @Column(name="MEASURES_FACT_RISK_ID", nullable = false)
    //@GeneratedValue(generator="seqHealthCenterId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long measuresFactRiskId;

    @Column(name="MEASURES_UNIT_ID", nullable = false)
    private Long measuresUnitId;
    @Transient
    private TwoType measureUnitCollection;

    @Column(name="FACTORS_RISK_ID", nullable = false)
    private Long factorsRiskId;
    @Transient
    private TwoFactorsRisk factorsRiskCollection;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
