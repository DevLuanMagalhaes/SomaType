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
@Table(name = "SSMA_AGE_RANGE_PERIODICITY")
public class TwoAgeRangePeriodicity  implements TwoEntity{

    @Id
    @Column(name="AGE_RANGE_PERIOD_ID", nullable = false)
    //@GeneratedValue(generator="seqAgeRangePeriodId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ageRangePeriodId;

    @Column(name="EXAMS_PERIODICITY_ID", nullable = false)
    private Long examsPeriodicityId;

    @Column(name="GENDER_TYPE", nullable = false, length=1)
    private String genderType;

    @Column(name="INITIAL_AGE_RANGE", nullable = false)
    private Long initialAgeRange;

    @Column(name="FINAL_AGE_RANGE", nullable = false)
    private Long finalAgeRange;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="GENDER_CODE", referencedColumnName="TYPE_ID")
    private TwoType genderCollection;

    @OneToMany(orphanRemoval=true, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    @JoinColumn(name="AGE_RANGE_PERIOD_ID", referencedColumnName="AGE_RANGE_PERIOD_ID")
    private List< TwoExamsByAgeRange> examsByAgeRangeList;
}
