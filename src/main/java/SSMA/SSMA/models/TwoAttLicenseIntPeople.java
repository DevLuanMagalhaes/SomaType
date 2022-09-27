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
@Table(name = "TWO_ATT_LICENSE_INT_PEOPLE")
public class TwoAttLicenseIntPeople implements TwoEntity{

    @Id
    @Column(name="ATTESTATION_LICENSE_ID")
    private Long attestationLicenseId;

    @Column(name="ESTABID")
    private String estabid;

    @Transient
    private String UODescr;

    @Column(name="EMPLID")
    private String emplid;

    @Transient
    private String name;

    @Column(name="EMPL_RCD")
    private Long emplRcd;

    @Column(name="BGN_DT")
    private Timestamp bgnDt;

    @Column(name="END_DT")
    private Timestamp endDt;

    @Column(name="PIN_TAKE_NUM")
    private Long pinTakeNum;

    @Column(name="DURATION_ABS")
    private Long durationAbs;

    @Column(name="EVT_CONFIG1")
    private String evtConfig1;

    @Column(name="VOIDED_IND")
    private String voidedInd;

    @Column(name="PHYSICIAN_ID")
    private String physicianId;

    @Column(name="PHYSICIAN_NAME")
    private String physicianName;

    @Column(name="org_stat_bra")
    private String orgStatBra;

    @Column(name="MED_CRM_BRA")
    private String medCrmBra;

    @Column(name="COUNTRY")
    private String country;

    @Column(name="STATE")
    private String state;

    @Column(name="RSI_TP_ACID")
    private String rsiTpAcid;

    @Column(name="ODB_BGN_DT_ANT")
    private Timestamp bgnDtAnt;

    @Column(name="ODB_END_DT_ANT")
    private Timestamp endDtAnt;

    @Column(name="ODB_PIN_NUM_ANT")
    private Long pinTakeNumAnt;

    @Column(name="ODB_ACAO_SOMA")
    private String odbAcaoSoma;

    @Column(name="INTERFACE_STATUS")
    private String interfaceStatus;

    @Column(name="ERROR_MESSAGE")
    private String errorMessage;

    @Column(name="CREATED_BY")
    private Long createdBy;

    @Column(name="CREATION_DATE")
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY")
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;

    @Column(name="ABSENCE_REASON")
    private String absenceReason;
}
