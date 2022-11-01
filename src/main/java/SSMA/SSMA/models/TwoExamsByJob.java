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
@Table(name = "TWO_EXAMS_BY_JOB")
@SequenceGenerator(name="seqExamsByJobId", sequenceName="TWO_EXAMS_BY_JOB_S", allocationSize=1)
public class TwoExamsByJob implements TwoEntity{

    @Id
    @Column(name="EXAMS_BY_JOB_ID", nullable = false)
    //@GeneratedValue(generator="seqExamsByJobId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long examsByJobId;
    @Column(name="JOB_PERIOD_ID", nullable = false)
    private Long jobPeriodId;
    @Column(name="VALIDITY")
    private Long validity;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="EXAM_ID", referencedColumnName="EXAM_ID")
    private TwoExams examsJobCollection;
}
