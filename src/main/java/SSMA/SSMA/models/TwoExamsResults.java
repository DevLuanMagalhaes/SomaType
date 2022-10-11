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
@Table(name = "TWO_COMPLEMENTARY_EXAMS")
public class TwoExamsResults implements TwoEntity{

    @Id
    @Column(name="EXAMS_RESULTS_ID", nullable = false)
    @GeneratedValue(generator="seqExamsResultsId")
    private Long examsResultsId;
    @Column(name="COMPLEMENTARY_EXAMS_ID", nullable = false)
    private Long complementaryExamsId;
    @Column(name="PROCEDURE_INFORMATION", nullable = false, length = 254)
    private String procedureInformation;
    @Column(name="QUALITATIVE_RESULT", nullable = false, length = 254)
    private String qualitativeResult;

    @Column(name="QUANTITATIVE_RESULT", nullable = false, precision = 6, scale = 2)
    private Double quantitativeResult;

    @Column(name="THORAX_RX_NUMBER", nullable = false, length = 10)
    private String thoraxRxNumber;

    @Column(name="NR7_ANALYSIS_REALIZED ", nullable = false, length = 254)
    private String nr7AnalysisRealized;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @Column(name= "PS_TOXIC_COD_EXAM")
    private String psToxicCodExam;
    @Column(name= "PS_TOXIC_CNPJ_LABOR")
    private String psToxicCnpjLabor;
    @Column(name= "PS_TOXIC_MED_CRM_NUMBER")
    private String psToxicMedCrmNumber;
    @Column(name= "PS_TOXIC_MED_CRM_STATE")
    private String psToxicMedCrmState;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="EXAM_REF_SEQ", referencedColumnName="TYPE_ID")
    private TwoType examRefSeqCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="YEAR_REPORT_RESULTS_ID", referencedColumnName="TYPE_ID")
    private TwoType yearReportResultCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="EXAM_INTERPRETATION_ID", referencedColumnName="TYPE_ID")
    private TwoType examInterpretationCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="NR7_BIOLOGICAL_MATERIAL_ID", referencedColumnName="TYPE_ID")
    private TwoType nr7BiologicalMaterialCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="NR7_EXAM_INTERPRETATION_ID", referencedColumnName="TYPE_ID")
    private TwoType nr7ExamInterpretarionCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="BLOOD_TYPE_ID", referencedColumnName="TYPE_ID")
    private TwoType bloodTypeCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="QUALIFIER_ID", referencedColumnName="TYPE_ID")
    private TwoType qualifierCollection;

    @Transient
    private List<TwoSoaCtrlIntEsocial> soaCtrlIntEsocialCollection;
}
