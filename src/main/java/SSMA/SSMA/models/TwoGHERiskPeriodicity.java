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
@Table(name = "TWO_GHE_RISK_PERIODICITY")
@SequenceGenerator(name="seqRiskPeriodicityId", sequenceName="TWO_GHE_RISK_PERIODICITY_S", allocationSize=1)
public class TwoGHERiskPeriodicity implements TwoEntity{

    @Id
    @Column(name="GHE_RISK_PERIOD_ID", nullable = false, length = 6)
    //@GeneratedValue(generator="seqRiskPeriodicityId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gheRiskPeriodId;
    @Column(name="GHE_FACTORS_RISK_ID", nullable = false, length = 6)
    private Long gheFactorsRiskId;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="EXAMS_PERIODICITY_ID", referencedColumnName="EXAMS_PERIODICITY_ID")
    private     TwoExamsPeriodicity examsPeriodicityCollection;

    @OneToMany(orphanRemoval=true, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    @JoinColumn(name="GHE_RISK_PERIOD_ID", referencedColumnName="GHE_RISK_PERIOD_ID")
    private List<TwoGHERiskExamsPeriod> gheRiskExamsPeriodList;
}
