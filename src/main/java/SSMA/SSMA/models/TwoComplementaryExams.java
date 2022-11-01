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
@Table(name = "TWO_COMPLEMENTARY_EXAMS")
@SequenceGenerator(name="seqComplementaryExamsId", sequenceName="TWO_COMPLEMENTARY_EXAMS_S", allocationSize=1)
public class TwoComplementaryExams implements TwoEntity{

    @Id
    @Column(name="COMPLEMENTARY_EXAMS_ID", nullable = false)
    //@GeneratedValue(generator="seqComplementaryExamsId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long complementaryExamsId;

    @Column(name="EMPLOYEE_EXAM_ID", nullable = false)
    private Long employeeExamId;

    @Column(name="EXAM_ID", nullable = false)
    private Long examId;

    @Transient
    private String examDescr;

    @Transient
    private String groupExamDescr;

    @Transient
    private String examsResultFields;

    @Column(name="EXAM_DATE")
    private Timestamp examDate;

    @Column(name= "REALIZED")
    private String realized;

    @Column(name= "EXPIRATION_DATE")
    private Timestamp expirationDate;

    @Column(name= "VALIDITY")
    private Long validity;

    @Column(name= "EXAMS_ORIGIN")
    private Long examsOrigin;

    @Transient
    private TwoType originCollection;

    @Column(name= "COMPL_EXAM_PARENT_ID")
    private Long complExamParentId;

    @Transient
    private String examCopied;

    @Transient
    private Long complementaryExamsIdCopy;

    @Column(name= "ASO_PARTICIPATING")
    private String asoParticipating;

    @Transient
    TwoExamsResults examsResultsCollecion;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
