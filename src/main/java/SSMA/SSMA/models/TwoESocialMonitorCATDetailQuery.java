package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class TwoESocialMonitorCATDetailQuery implements Serializable {

    @Id
    @Column(name="ID")
    private Long id;
    @Column(name="COMPANY")
    private String company;
    @Column(name="ESTABID")
    private String estabid;
    @Column(name="EMPLID")
    private String emplid;
    @Column(name="EMPL_RCD")
    private Long emplRcd;
    @Column(name="ACCIDENT_DATE")
    private Timestamp accidentDate;
    @Column(name="CAT_NUMBER")
    private Long catNumber;
    @Column(name="CAT_TYPE")
    private String catType;
    @Column(name="OPERATION")
    private String operation;
    @Column(name="STATUS")
    private String status;
    @Column(name="MSG")
    private String msg;
    @Column(name="STATUS_RETURN")
    private String statusReturn;
    @Column(name="MSG_RETURN")
    private String msgReturn;
    @Column(name = "XML")
    private String xml;
    @Column(name = "GOV_RETURN_CODE")
    private String govReturnCode;
    @Column(name = "GOV_RETURN_DESCR")
    private String govReturnDescr;
    @Column(name = "CD_RESPOSTA")
    private String cdResposta;
    @Column(name = "DESC_RESPOSTA")
    private String descResposta;
    @Column(name = "PROTOCOL_ONESOURCE")
    private String protocolOnesource;
    @Column(name = "GOVERNMENT_PROTOCOL")
    private String governmentProtocol;
    @Column(name="CREATED_BY")
    private Long createdBy;
    @Column(name="CREATION_DATE")
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY")
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;
    @Column(name="CANCELED_BY")
    private Long canceledBy;
    @Column(name="CANCEL_DATE")
    private Timestamp cancelDate;
    @Column(name = "STATUS_BEFORE_CANCEL")
    private String statusBeforeCancel;
    @Column(name="EVENT_ORIGIN")
    private String eventOrigin;
    @Column(name="RECTIFICATION_ID")
    private Long rectificationId;
    @Column(name = "XML_RETORNO")
    private String xmlRetorno;

    @Transient
    private String emplName;
    @Transient
    private String userName;
    @Transient
    private String emplidConcat;
    @Transient
    private String eventoRetificado;
    @Transient
    private Long nivelStatus;
    @Transient
    private String userNameLastUpdatedBy;
    @Transient
    private String userNameCreatedBy;
    @Transient
    private String userNameCanceledBy;
    @Transient
    private String eventOriginDescr;
}
