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
@Table(name = "TWO_EXAMS_BY_LOCATION")
@SequenceGenerator(name="seqExamsByLocationId", sequenceName="TWO_EXAMS_BY_LOCATION_S", allocationSize=1)
public class TwoExamsByLocation implements TwoEntity{

    @Id
    @Column(name="EXAMS_BY_LOCATION_ID", nullable = false)
    //@GeneratedValue(generator="seqExamsByLocationId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long examsByLocationId;
    @Column(name="LOCATION_PERIOD_ID", nullable = false)
    private Long locationPeriodId;
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
    private TwoExams examsLocationCollection;
}
