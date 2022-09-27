//package SSMA.SSMA.models;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.sql.Timestamp;
//
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "TWO_CAT")
//public class TwoCat implements TwoEntity{
//
//    @Id @Column(name="CAT_ID")
//    //@GeneratedValue(generator="seqCatId")
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long catId;
//
//    @Column(name="EMPLID")
//    private String emplid;
//
//    @Column(name="EMPL_RCD")
//    private Long emplRcd;
//
//    @Transient
//    private String name;
//
//    @Column(name="ESTABID")
//    private String estabid;
//
//    @Column(name="SUBSCRIPTION_NUMBER")
//    private String subscriptionNumber;
//
//    @Column(name="CAT_TYPE")
//    private String catType;
//
//    @Column(name="ACCIDENT_DATE")
//    private Timestamp accidentDate;
//
//    @Column(name="ACCIDENT_HOUR")
//    private Timestamp accidentHour;
//
//    @Column(name="after_how_many_hours_of_work")
//    private Timestamp afterHowManyHoursOfWork;
//
//    @Column(name="TYPE")
//    private String type;
//
//    @Column(name="WITHDRAWAL")
//    private String withdrawal;
//
//    @Column(name="LAST_DAY_WORKED")
//    private Timestamp lastDayWorked;
//
//    @Column(name="ACCIDENT_LOCATION_DESCR")
//    private String accidentLocationDescr;
//
//    @Column(name="ACCIDENT_LOCATION_CNPJ")
//    private String accidentLocationCnpj;
//
//    @Column(name="ACCIDENT_LOCATION_ADDRESS")
//    private String accidentLocationAddress;
//
//    @Column(name="ACCIDENT_LOCATION_NUMBER")
//    private String accidentLocationNumber;
//
//    @Column(name="ACCIDENT_LOCATION_POSTAL_CODE")
//    private String accidentLocationPostalCode;
//
//    @Column(name="ACCIDENT_LOCATION_COUNTRY")
//    private String accidentLocationCountry;
//
//    @Column(name="ACCIDENT_LOCATION_STATE")
//    private String accidentLocationState;
//
//    @Column(name="ACCIDENT_LOCATION_CITY")
//    private String accidentLocationCity;
//
//    @Column(name="POLICE_RECORD")
//    private String policeRecord;
//
//    @Column(name="DECEASE")
//    private String decease;
//
//    @Column(name="DECEASE_DATE")
//    private Timestamp deceaseDate;
//
//    @Column(name="NOTE")
//    private String note;
//
//    @Column(name="EMITTER_SIGNATURE_EMPLID")
//    private String emitterSignatureEmplid;
//
//    @Column(name="MEDICAL_CARE_UNIT")
//    private String medicalCareUnit;
//
//    @Column(name="MEDICAL_CARE_DATE")
//    private Timestamp medicalCareDate;
//
//    @Column(name="MEDICAL_CARE_HOUR")
//    private Timestamp medicalCareHour;
//
//    @Column(name="HOSPITALIZED")
//    private String hospitalized;
//
//    @Column(name="QUANTITY_TREATMENT_DAYS")
//    private Long quantityTreatmentDays;
//
//    @Column(name="WITHDRAWAL_DURING_TREATMENT")
//    private String withdrawalDuringTreatment;
//
//    @Column(name="ADDITIONAL_DESCR_LESION")
//    private String additionalDescrLesion;
//
//    @Column(name="PROBABLE_DIAGNOSIS")
//    private String probableDiagnosis;
//
//    @Column(name="CREATED_BY")
//    private Long createdBy;
//
//    @Column(name="CID_ID")
//    private Long cidId;
//
//    @Column(name="NOTE_LESION")
//    private String noteLesion;
//
//    @Column(name="COD_CNES")
//    private String codCnes;
//
//    @Column(name="CAT_RECEIVED_DATE")
//    private Timestamp catReceivedDate;
//
//    @Column(name="UNIT_CODE")
//    private Long unitCode;
//
//    @Column(name="CAT_NUMBER")
//    private Long catNumber;
//
//    @Column(name="SERVER_RECORD")
//    private String serverRecord;
//
//    @Column(name="RESPONSIBLE_MEDICAL_DATA_ID")
//    private Long responsibleMedicalDataId;
//
//    @Column(name="CREATION_DATE")
//    private Timestamp creationDate;
//
//    @Column(name="LAST_UPDATED_BY")
//    private Long lastUpdatedBy;
//
//    @Column(name="LAST_UPDATE_DATE")
//    private Timestamp lastUpdateDate;
//
//    @Column(name="SOA_CTRL_INT_ESOCIAL_ID")
//    private Long soaCtrlIntEsocialId;
//
//    @Column(name="GHE_LOCATION")
//    private String gheLocation;
//    @Transient
//    private String gheLocationDescr;
//
//    @Column(name="ACCIDENT_LOC_ADDR_TYPE_ESOC")
//    private String accidentLocAddrTypeEsoc;
//
//    @Column(name="ACCIDENT_LOC_ADDR_TYPE_PS")
//    private String accidentLocAddrTypePs;
//
//    @Column(name="ACCIDENT_LOC_NEIGHBORHOOD ")
//    private String accidentLocNeighborhood ;
//
//    @Column(name="ACCIDENT_LOC_COMPLEMENT")
//    private String accidentLocComplement;
//
//    @Column(name="CAT_ID_ORIGEM")
//    private Long catIdOrigem;
//
//    @OneToOne(fetch=FetchType.EAGER)
//    @JoinColumn(name="CAT_RECORDER_TYPE_ID", referencedColumnName="TYPE_ID")
//    private TwoType catRecorderTypeCollection;
//
//    @OneToOne(fetch=FetchType.EAGER)
//    @JoinColumn(name="SUBSCRIPTION_TYPE_ID", referencedColumnName="TYPE_ID")
//    private TwoType subscriptionTypeCollection;
//
//    @OneToOne(fetch=FetchType.EAGER)
//    @JoinColumn(name="CAT_INITIATIVE_ID", referencedColumnName="TYPE_ID")
//    private TwoType catInitiativeCollection;
//
//    @OneToOne(fetch=FetchType.EAGER)
//    @JoinColumn(name="ACCIDENT_TYPE_ID", referencedColumnName="TYPE_ID")
//    private TwoType accidentTypeCollection;
//
//    @OneToOne(fetch=FetchType.EAGER)
//    @JoinColumn(name="ACCIDENT_LOCATION_ID", referencedColumnName="TYPE_ID")
//    private TwoType accidentLocationCollection;
//
//    @OneToOne(fetch=FetchType.EAGER)
//    @JoinColumn(name="CAUSATIVE_AGENT_ID", referencedColumnName="TYPE_ID")
//    private TwoType causativeAgentCollection;
//
//    @OneToOne(fetch=FetchType.EAGER)
//    @JoinColumn(name="WORK_ACCIDENT_CAUSES_ID", referencedColumnName="TYPE_ID")
//    private TwoType workAccidentCausesCollection;
//
//    @OneToMany(orphanRemoval=true, fetch=FetchType.EAGER, cascade=CascadeType.ALL)
//    @JoinColumn(name="CAT_ID", referencedColumnName="CAT_ID")
//    private List<TwoCatBodyParts> catBodyPartsCollection;
//
//    @OneToMany(orphanRemoval=true, fetch=FetchType.EAGER, cascade=CascadeType.ALL)
//    @JoinColumn(name="CAT_ID", referencedColumnName="CAT_ID")
//    private List<TwoCatWitness> catWitnessCollection;
//
//    @OneToOne(fetch= FetchType.EAGER)
//    @JoinColumn(name="LESION_NATURE_ID", referencedColumnName="TYPE_ID")
//    private TwoType lesionNatureCollection;
//
//    @Transient
//    private List<TwoSoaCtrlIntEsocial> soaCtrlIntEsocialCollection;
//
//    @OneToMany(orphanRemoval=true, fetch=FetchType.EAGER, cascade=CascadeType.ALL)
//    @JoinColumn(name="CAT_ID", referencedColumnName="CAT_ID")
//    private List<TwoCatCausativeAgent> causativeAgentList;
//}
