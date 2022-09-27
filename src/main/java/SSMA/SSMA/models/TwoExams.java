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
@Table(name = "TWO_EXAMS")
public class TwoExams implements TwoEntity{

    @Id
    @Column(name="EXAM_ID", nullable = false, length = 7)
    //@GeneratedValue(generator="seqExamsId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long examId;
    @Column(name="EXAM_CODE", nullable = false, length = 7)
    private String examCode;
    @Column(name="EXAM_DESCR", nullable = false, length = 200)
    private String examDescr;
    @Column(name="PRINT_PPP", nullable = false, length = 20)
    private String printPPP;
    @Column(name="VALID", nullable = false, length = 1)
    private String valid;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="TUSS_CODE", referencedColumnName="TUSS_CODE")
    private TwoTuss tussCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="EXAMS_RESULT_FIELD_ID", referencedColumnName="TYPE_ID")
    private TwoType examResultFieldsCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="DIAGNOSTIC_PROCEDURE_ID", referencedColumnName="TYPE_ID")
    private TwoType diagnosticProcedureCollection;
}
