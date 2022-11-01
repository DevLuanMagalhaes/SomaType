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
@Table(name = "TWO_EXAMS_PERIODICITY")
@SequenceGenerator(name="seqExamsPeriodicityId", sequenceName="TWO_EXAMS_PERIODICITY_S", allocationSize=1)
public class TwoExamsPeriodicity implements TwoEntity{

    @Id
    @Column(name="EXAMS_PERIODICITY_ID", nullable = false)
    //@GeneratedValue(generator="seqExamsPeriodicityId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long examsPeriodicityId;

    @Column(name="ESTABID", nullable = false, length = 12)
    private String estabid;

    @Column(name="VALIDITY", nullable = false)
    private Long validity;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @Column(name="ACTIVE", nullable = false, length = 1)
    private String active;

    @Transient
    private String examTypePeriodicityDescr;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="VALIDITY_REFERENCE", referencedColumnName="TYPE_ID")
    private TwoType validityReferenceCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="EXAM_TYPE", referencedColumnName="TYPE_ID")
    private TwoType examTypeCollection;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="PERIODICITY_EXAM", referencedColumnName="TYPE_ID")
    private TwoType periodicityExamCollection;
}
