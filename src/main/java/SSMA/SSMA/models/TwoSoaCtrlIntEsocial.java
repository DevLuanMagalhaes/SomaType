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
@Table(name = "TWO_SOA_CTRL_INT_ESOCIAL")
@SequenceGenerator(name = "ssmaSoaCtrlIntEsocialId", sequenceName = "TWO_SOA_CTRL_INT_ESOCIAL_S", allocationSize = 1)
public class TwoSoaCtrlIntEsocial implements TwoEntity{

    @Id
    @Column(name = "ID ")
    //@GeneratedValue(generator="ssmaSoaCtrlIntEsocialId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "EVENT_NAME ")
    private String eventName;

    @Column(name = "COMPOSITE_INSTANCE_ID")
    private Long compositeInstanceId;

    @Column(name = "FLEX_01")
    private String flex01;

    @Column(name = "FLEX_02")
    private String flex02;

    @Column(name = "FLEX_03")
    private String flex03;

    @Column(name = "FLEX_04")
    private String flex04;

    @Column(name = "FLEX_05")
    private String flex05;

    @Column(name = "PROTOCOL_ONESOURCE ")
    private String protocolOneSource;

    @Column(name = "STATUS ")
    private String status;

    @Column(name = "MSG")
    private String msg;

    @Column(name = "STATUS_RETURN")
    private String statusReturn;

    @Column(name = "MSG_RETURN ")
    private String msgReturn;

    @Column(name = "ESTABID")
    private String estabId;

    @Column(name = "EMPLID ")
    private String emplid;

    @Column(name = "EMPL_RCD ")
    private Long emplRcd;

    @Column(name = "OPERATION")
    private String operation;

    @Column(name = "GOVERNMENT_PROTOCOL")
    private String governmentProtocol;

    @Column(name = "COMPANY")
    private String company;

    @Column(name = "CREATION_DATE")
    private Timestamp creationDate;

    @Column(name = "LAST_UPDATED_BY")
    private Long lastUpdatedBy;

    @Column(name = "LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Column(name="EVENT_ORIGIN")
    private String eventOrigin;

    @Column(name="PARENT_ID")
    private Long parentId;

    @Column(name="STATUS_PROC_BPEL")
    private String statusProcBpel;

    @Column(name="STATUS_PROC_BPEL_ERROR_CODE")
    private String statusProcBpelErrorCode;

    @Column(name="STATUS_PROC_BPEL_ERROR_DESCR")
    private String statusProcBpelErrorDescr;

    @Column(name="STATUS_GET_RESULT_OS")
    private String statusGetResultOS;

    @Column(name="S3000_RECORD_DETAILS_REMOVED")
    private String S3000RecordDetailsRemoved;

    @Column(name="CNPJ_UO")
    private String cnpjUo;

    @Column(name="CNPJ_MATRIZ")
    private String cnpjMatriz;

    @Column(name="CPF")
    private String cpf;

    @Column(name="NIS")
    private String nis;

    @Column(name="ODB_PRE_ADM_ID")
    private String odbPreAdmId;

    @Column(name="REG_ESOCIAL_BRA")
    private String regEsocialBra;

    @Column(name="ESOCIAL_INITIAL_LOAD")
    private String esocialInitialLoad;

}
