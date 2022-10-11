//package SSMA.SSMA.models;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.sql.Timestamp;
//import java.util.List;
//
//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "TWO_CONSULTA_CLINICA")
//public class TwoConsultaClinica implements TwoEntity{
//
//    @Id
//    @Column(name="CONSULTA_CLINICA_ID", nullable = false, length = 8)
//   // @GeneratedValue(generator="seqConsultaClinicaId")
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long consultaClinicaId;
//
//    @Column(name="ESTABID", nullable = false, length=12)
//    private String estabid;
//    @Column(name="EMPLID", nullable = false, length=11)
//    private String emplid;
//    @Column(name="EMPL_RCD ", nullable = false)
//    private Long emplRcd;
//    @Column(name="DATA_AVALIACAO", nullable = false)
//    private Timestamp dataAvaliacao;
//    @Column(name="CONSULTA_CLINICA_SEQ", nullable = false)
//    private Long consultaClinicaSeq;
//    @Column(name="QUEIXA_PRINCIPAL", nullable = false, length=500)
//    private String queixaPrincipal;
//    @Column(name="HIST_DOENCA_ATUAL_EVOLUCAO", nullable = false, length=500)
//    private String histDoencaAtualEvolucao;
//    @Column(name="TEMPERATURA", nullable = false)
//    private Double temperatura;
//    @Column(name="FREQUENCIA_RESPIRATORIA", nullable = false)
//    private Long frequenciaRespiratoria;
//    @Column(name="FREQUENCIA_CARDIACA", nullable = false)
//    private Long frequenciaCardiaca;
//    @Column(name="PRESSAO_ARTERIAL_PAS", nullable = false)
//    private Long pressaoArterialPas;
//    @Column(name="pressao_arterial_PAD", nullable = false)
//    private Long pressaoArterialPad;
//    @Column(name="ALTURA", nullable = false)
//    private Long altura;
//    @Column(name="PESO_ATUAL", nullable = false)
//    private Double pesoAtual;
//    @Column(name="IMC", nullable = false)
//    private Double imc;
//    @Column(name="CIRCUNFERENCIA_ABNOMINAL", nullable = false)
//    private Double circunferenciaAbnominal;
//    @Column(name="INFORMACOES_COMPLEMENTARES", nullable = false, length=500)
//    private String informacoesComplementares;
//    @Column(name="RESULT_EXAME_COMPL_PROPOSTO", nullable = false, length=500)
//    private String resultExameComplProposto;
//    @Column(name="TRATAMENTO_PROPOSTO", nullable = false, length=500)
//    private String tratamentoProposto;
//    @Column(name="PRESCRICAO", nullable = false, length=500)
//    private String prescricao;
//    @Column(name="CREATED_BY", nullable = false)
//    private Long createdBy;
//    @Column(name="CREATION_DATE", nullable = false)
//    private Timestamp creationDate;
//    @Column(name="LAST_UPDATED_BY", nullable = false)
//    private Long lastUpdatedBy;
//    @Column(name="LAST_UPDATE_DATE", nullable = false)
//    private Timestamp lastUpdateDate;
//    @Column(name="HEALTH_PROFESSION_ID")
//    private Long healthProfessionId;
//
//    @Transient
//    private PsPersonNameQuery personDataCollection;
//
//    @OneToOne(fetch=FetchType.EAGER)
//    @JoinColumn(name="HEALTH_CENTER_ID", referencedColumnName="HEALTH_CENTER_ID")
//    private TwoHealthCenter healthCenterCollection;
//
//    @OneToOne(fetch=FetchType.EAGER)
//    @JoinColumn(name="CLASSIF_PRESSAO_ARTERIAL_ID", referencedColumnName="TYPE_ID")
//    private TwoType classifPressaoArterialCollection;
//
//    @OneToOne(fetch=FetchType.EAGER)
//    @JoinColumn(name="BIOTIPO_ID", referencedColumnName="TYPE_ID")
//    private TwoType biotipoCollection;
//
//    /*
//    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
//    @JoinTable(name = "SSMA_CONS_CLIN_EXAMES_PROP",
//    joinColumns = { @JoinColumn(name="CONSULTA_CLINICA_ID", referencedColumnName="CONSULTA_CLINICA_ID")},
//    inverseJoinColumns = {@JoinColumn(name="EXAM_ID", referencedColumnName="EXAM_ID")})
//    private List<SsmaExams> consClinExamesPropList;
//    */
//
//    @OneToMany(orphanRemoval=true, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.EAGER)
//    @JoinColumn(name="CONSULTA_CLINICA_ID", referencedColumnName="CONSULTA_CLINICA_ID")
//    private List<TwoConsClinExamesProp> consClinExamesPropList;
//
//    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
//    @JoinTable(name = "SSMA_CONS_CLIN_IMPR_DIAGN",
//            joinColumns = { @JoinColumn(name="CONSULTA_CLINICA_ID", referencedColumnName="CONSULTA_CLINICA_ID")},
//            inverseJoinColumns = {@JoinColumn(name="CID_ID", referencedColumnName="TYPE_ID")})
//    private List<TwoType> consClinImprDiagnList;
//}
