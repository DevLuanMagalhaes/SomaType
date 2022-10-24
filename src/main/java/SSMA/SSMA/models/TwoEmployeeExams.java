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
@Table(name = "TWO_EMPLOYEE_EXAMS")
public class TwoEmployeeExams implements TwoEntity{

    @Id
    @Column(name="EMPLOYEE_EXAM_ID", nullable = false)
    //@GeneratedValue(generator="seqEmployeeExamsId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeExamId;
    @Column(name="ESTABID", nullable = false, length = 12)
    private String estabid;

    @Column(name="EXAM_TYPE", nullable = false)
    private Long examType;

    @Column(name="EMPLID", length= 11)
    private String emplid;
    @Column(name="ODB_PRE_ADM_ID", length= 8)
    private String odbPreAdmId;
    @Column(name="HEALTH_PROFESSION_ID")
    private Long healthProfessionId;
    @Column(name="EMPL_RCD")
    private Long emplRcd;
    @Transient
    private String name;
    @Transient
    private String gender;
    @Transient
    private Timestamp birthdate;
    @Transient
    private Long age;
    @Transient
    private String hrStatus;
    @Transient
    private String jobcode;
    @Transient
    private String location;
    @Column(name="INCLUSION_DATE", nullable = false)
    private Timestamp inclusionDate;
    @Column(name="FUNCTION_CHANGE_ID", nullable = false)
    private Long functionChangeId;
    @Column(name="EXAME_OCUPACIONAL_ID")
    private Long exameOcupacionalId;

    @Column(name="PERIODICITY_EXAM")
    private Long periodicityExam;
    @Column(name="EXAMS_PERIODICITY_ID")
    private Long examsPeriodicityId;

    @Transient
    private String occupationalExamTypeDescr;

    @Transient
    private TwoType examTypeCollection;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @Transient
    private List<TwoSoaCtrlIntEsocial> soaCtrlIntEsocialCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="HEALTH_CENTER_ID", referencedColumnName="HEALTH_CENTER_ID")
    private TwoHealthCenter healthCenterCollection;
}
