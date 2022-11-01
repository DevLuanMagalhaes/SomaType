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
@Table(name = "TWO_TOXICOLOGICAL_EXAMS")
@SequenceGenerator(name = "seqToxicologicalExamsId", sequenceName = "TWO_TOXICOLOGICAL_EXAMS_S", allocationSize = 1)
public class TwoToxicologicalExams implements TwoEntity{

    @Id
    @Column(name = "TOXICOLOGICAL_EXAMS_ID")
    //@GeneratedValue(generator="seqRiskId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long toxicologicalExamsId;
    @Column(name = "ESTABID")
    private String estabid;
    @Column(name = "EMPLID")
    private String emplid;
    @Column(name = "EMPL_RCD")
    private Long emplRcd;
    @Column(name = "ODB_PRE_ADM_ID")
    private String odbPreAdmId;
    @Column(name = "EXAM_DATE")
    private Timestamp examDate;
    @Column(name="EXAM_ID")
    private Long examId;
    @Column(name = "LABORATORY_EXAM_CODE")
    private String laboratoryExamCode;
    @Column(name = "LABORATORY_CNPJ")
    private String laboratoryCnpj;
    @Column(name = "DOCTOR_NAME")
    private String doctorName;
    @Column(name = "DOCTOR_CRM")
    private String doctorCrm;
    @Column(name = "DOCTOR_CRM_UF")
    private String doctorCrmUf;
    @Column(name = "SOA_CTRL_INT_ESOCIAL_ID")
    private Long soaCtrlIntEsocialId;
    @Column(name = "CREATION_DATE")
    private Timestamp creationDate;
    @Column(name = "LAST_UPDATED_BY")
    private Long lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;
    @Column(name = "CREATED_BY")
    private Long createdBy;
    @Column(name = "REFUSE_IND")
    private String refuseInd;
    @Column(name = "EMPL_TERMINATION_DT")
    private Timestamp emplTerminationDt;

    @Transient
    private TwoExams examsCollection;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="EXAM_REASON_ID", referencedColumnName="TYPE_ID")
    private TwoType examReasonCollection;

    @Transient
    private List<TwoSoaCtrlIntEsocial> soaCtrlIntEsocialCollection;
}
