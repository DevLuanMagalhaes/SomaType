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
@Table(name = "TWO_EXAMS_BY_AGE_RANGE")
@SequenceGenerator(name="seqExamsByAgeRangeId", sequenceName="TWO_EXAMS_BY_AGE_RANGE_S", allocationSize=1)
public class TwoExamsByAgeRange implements TwoEntity{

    @Id
    @Column(name="EXAMS_BY_AGE_RANGE_ID", nullable = false)
    //@GeneratedValue(generator="seqExamsByAgeRangeId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long examsByAgeRangeId;

    @Column(name="AGE_RANGE_PERIOD_ID", nullable = false)
    private Long ageRangePeriodId;

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

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="EXAM_ID", referencedColumnName="EXAM_ID")
    private TwoExams examsCollection;
}
