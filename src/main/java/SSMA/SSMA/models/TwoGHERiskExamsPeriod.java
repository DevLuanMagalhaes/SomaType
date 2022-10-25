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
@Table(name = "TWO_GHE_RISK_EXAMS_PERIOD")
public class TwoGHERiskExamsPeriod implements TwoEntity{

    @Id
    @Column(name="GHE_RISK_EXAMS_PERIOD_ID", nullable = false, length = 6)
    //@GeneratedValue(generator="seqRiskExamsPeriodId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gheRiskExamsPeriodId;
    @Column(name="GHE_RISK_PERIOD_ID", nullable = false, length = 6)
    private Long gheRiskPeriodId;
    @Column(name="EXAM_ID", nullable = false, length = 6)
    private Long examId;
    @Transient
    private String examCode;
    @Transient
    private String examDescr;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
    @Column(name="VALIDITY", nullable = false, length = 3)
    private Long validity;
}
