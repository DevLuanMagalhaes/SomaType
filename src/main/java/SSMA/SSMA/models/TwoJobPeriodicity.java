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
@Table(name = "TWO_JOB_PERIODICITY")
@SequenceGenerator(name = "seqJobPeriodId", sequenceName = "TWO_JOB_PERIOD_S",
        allocationSize = 1)
public class TwoJobPeriodicity implements TwoEntity{

    @Id
    @Column(name = "JOB_PERIOD_ID", nullable = false)
    @GeneratedValue(generator = "seqJobPeriodId")
    private Long jobPeriodId;
    @Column(name = "EXAMS_PERIODICITY_ID", nullable = false)
    private Long examsPeriodicityId;
    @Column(name = "JOB_CODE", nullable = false)
    private String jobCode;
    @Transient
    private String jobDescr;
    @Column(name = "CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name = "CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name = "LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToMany(orphanRemoval = true,
            cascade = { CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.REMOVE }, fetch = FetchType.EAGER)
    @JoinColumn(name = "JOB_PERIOD_ID", referencedColumnName = "JOB_PERIOD_ID")
    private List<TwoExamsByJob> examsByJobList;
}
