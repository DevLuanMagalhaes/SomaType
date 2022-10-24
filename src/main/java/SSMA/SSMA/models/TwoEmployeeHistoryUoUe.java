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
@Table(name = "TWO_EMPLOYEE_HISTORY_UO_UE")
public class TwoEmployeeHistoryUoUe implements TwoEntity{

    @Id
    @Column(name="EMPLOYEE_HISTORY_UO_UE_ID")
    //@GeneratedValue(generator="seqEmployeeHistoryUoUeId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeHistoryUoUeId;
    @Column(name="COMPANY")
    private String company;
    @Column(name="UO_UE_CODE")
    private String uoUeCode;
    @Column(name="UO_UE_DESCR")
    private String uoUeDescr;
    @Column(name="EMPLID")
    private String emplid;
    @Column(name="START_DT")
    private Timestamp startDt;
    @Column(name="END_DT")
    private Timestamp endDt;
    @Column(name="CPF")
    private String cpf;
    @Column(name="ORIGIN_SYSTEM")
    private String originSystem;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
