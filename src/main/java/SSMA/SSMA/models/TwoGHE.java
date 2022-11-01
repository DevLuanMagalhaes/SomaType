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
@Table(name = "TWO_GHE")
@SequenceGenerator(name="seqGheId", sequenceName="TWO_GHE_S", allocationSize=1)
public class TwoGHE implements TwoEntity{

    @Id
    @Column(name="GHE_ID", nullable = false)
    //@GeneratedValue(generator="seqGheId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gheId;
    @Column(name="GHE_CODE", nullable = false)
    private Long gheCode;
    @Column(name="EFFECTIVE_DATE", nullable = false)
    private Timestamp effectiveDate;
    @Column(name="GHE_NAME", nullable = false, length=70)
    private String gheName;
    @Column(name="DESCR_ACTIVITIES_DEVELOPED", nullable = false, length=999)
    private String descrActivitiesDeveloped;
    @Column(name="COMPANY", nullable = false, length=3)
    private String company;
    @Column(name="ESTABID", nullable = false, length=3)
    private String estabid;
    @Column(name="VALID_FROM_DATE", nullable = false)
    private Timestamp validFromDate;
    @Column(name="VALID_TO_DATE")
    private Timestamp validToDate;
    @Column(name="STATUS", nullable = false, length=1)
    private String status;
    @Column(name="WORK_ENVIROMENT_DESCR", nullable = false, length=999)
    private String workEnviromentDescr;
    @Column(name="COMPL_ENVIROMENT_OBS", nullable = true, length=999)
    private String complementEnviromentObs;
    @Transient
    private String workEnviromentDescrWorkplace;
    @Column(name="WORKPLACE", nullable = false, length=1)
    private String workplace;
    @Column(name="ESTAB_TYPE_ID", nullable = false, length=1)
    private String estabTypeId;
    @Column(name="ESTAB_REG_NUMBER", nullable = false, length=1)
    private String estabRegNumber;
    @Column(name="DANGEROUSNESS", nullable = false, length=1)
    private String dangerousness;
    @Column(name="INSALUBRITY", nullable = false, length=1)
    private String insalubrity;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @Column(name="ACTIVATION_DATE", nullable = false)
    private Timestamp activationDate;
    @Column(name="ACTIVATED_BY", nullable = false)
    private Long activatedBy;
    @Transient
    private String activationUsername;
}
