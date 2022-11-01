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
@SequenceGenerator(name="seqControlGroupEmployeeId", sequenceName="TWO_CONTROL_GROUP_EMPLOYEE_S", allocationSize=1)
public class TwoControlGroupEmployee  implements TwoEntity{

    @Id
    @Column(name="CONTROL_GROUP_EMPLOYEE_ID", nullable = false)
    //@GeneratedValue(generator="seqControlGroupEmployeeId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long controlGroupEmployeeId;

    @Column(name="ESTABID", nullable = false, length = 12)
    private String estabid;

    @Column(name="EMPLID", length = 30)
    private String emplid;

    @Column(name="EMPL_RCD", nullable = false)
    private Long emplRcd;

    @Transient
    private String emplName;

    @Transient
    private String emplStatus;

    @Column(name="INITIAL_CONTROL_DATE", nullable = false)
    private Timestamp initialControlDate;

    @Column(name="FINAL_CONTROL_DATE", nullable = false)
    private Timestamp finalControlDate;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="MEDICAL_ASSIST_TYPE_ID", referencedColumnName="TYPE_ID")
    private TwoType medicalAssistTypeCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="CONTROL_GROUP_ID", referencedColumnName="TYPE_ID")
    private TwoType controlGroupCollection;
}
