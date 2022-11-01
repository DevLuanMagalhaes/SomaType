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
@Table(name = "TWO_EXAME_OCUPACIONAL")
@SequenceGenerator(name="seqExameOcupacionalId", sequenceName="TWO_EXAME_OCUPACIONAL_S", allocationSize=1)
public class TwoExameOcupacional implements TwoEntity{

    @Id
    @Column(name="EXAME_OCUPACIONAL_ID", nullable = false, length = 8)
    //@GeneratedValue(generator="seqExameOcupacionalId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long exameOcupacionalId;
    @Column(name="ESTABID", nullable = false, length=12)
    private String estabid;
    @Column(name="EMPLID", length=11)
    private String emplid;
    @Column(name="EMPL_RCD ")
    private Long emplRcd;
    @Column(name="ODB_PRE_ADM_ID", length=8)
    private String odbPreAdmId;
    @Column(name="DATA_AVALIACAO", nullable = false)
    private Timestamp dataAvaliacao;
    @Column(name="EXAM_TYPE_ID")
    private Long examTypeId;
    @Column(name="TEMPERATURA", nullable = false)
    private Double temperatura;
    @Column(name="FREQUENCIA_RESPIRATORIA", nullable = false)
    private Long frequenciaRespiratoria;
    @Column(name="FREQUENCIA_CARDIACA", nullable = false)
    private Long frequenciaCardiaca;
    @Column(name="PRESSAO_ARTERIAL_PAS", nullable = false)
    private Long pressaoArterialPas;
    @Column(name="pressao_arterial_PAD", nullable = false)
    private Long pressaoArterialPad;
    @Column(name="ALTURA", nullable = false)
    private Long altura;
    @Column(name="PESO_ATUAL", nullable = false)
    private Double pesoAtual;
    @Column(name="IMC", nullable = false)
    private Double imc;
    @Column(name="CIRCUNFERENCIA_ABNOMINAL", nullable = false)
    private Double circunferenciaAbnominal;
    @Column(name="INFORMACOES_COMPLEMENTARES", length=500)
    private String informacoesComplementares;
    @Column(name="RECOMENDACOES_MEDICAS", length=500)
    private String recomendacoesMedicas;
    @Column(name="RECEITA_MED_REQUISICAO_EXAME", length=500)
    private String receitaMedRequisicaoExame;
    @Column(name="DATA_ASO")
    private Timestamp dataAso;
    @Column(name="OBSERVACOES_ASO", length=500)
    private String observacoesAso;
    @Column(name="HEALTH_PROFESSION_ID")
    private Long healthProfessionId;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @Transient
    private PsPersonNameQuery personDataCollection;

    @Transient
    private TwoType examTypeCollection;

    @Column(name="PERIODICITY_EXAM")
    private Long periodicityExam;

    @Column(name="EXAMS_PERIODICITY_ID")
    private Long examsPeriodicityId;

    @Transient
    private String occupationalExamTypeDescr;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="YEAR_REPORT_RESULTS_ID", referencedColumnName="TYPE_ID")
    private TwoType yearReportResultCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="MEDICAL_ASSIST_TYPE_ID", referencedColumnName="TYPE_ID")
    private TwoType medicalAssistTypeCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="HEALTH_CENTER_ID", referencedColumnName="HEALTH_CENTER_ID")
    private TwoHealthCenter healthCenterCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="CLASSIF_PRESSAO_ARTERIAL_ID", referencedColumnName="TYPE_ID")
    private TwoType classifPressaoArterialCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="BIOTIPO_ID", referencedColumnName="TYPE_ID")
    private TwoType biotipoCollection;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinTable(name = "SSMA_EXAM_OCUP_IMPR_DIAGN",
            joinColumns = { @JoinColumn(name="EXAME_OCUPACIONAL_ID", referencedColumnName="EXAME_OCUPACIONAL_ID")},
            inverseJoinColumns = {@JoinColumn(name="CID_ID", referencedColumnName="TYPE_ID")})
    private List<TwoType> examOcupImprDiagnList;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="RESULTADO_ASO", referencedColumnName="TYPE_ID")
    private TwoType resultadoASOCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="REALIZAR_TRABALHO_EM_ALTURA", referencedColumnName="TYPE_ID")
    private TwoType trabalhoEmAlturaCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="REALIZAR_TRAB_AMB_CONFINADO", referencedColumnName="TYPE_ID")
    private TwoType trabalhoAmbConfinadoCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="REALIZAR_TRAB_ELETRICIDADE", referencedColumnName="TYPE_ID")
    private TwoType trabalhoComEletricidadeCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="EXAM_REF_SEQ", referencedColumnName="TYPE_ID")
    private TwoType examRefSeqCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="EXAM_INTERPRETATION_ID", referencedColumnName="TYPE_ID")
    private TwoType examInterpretationCollection;

    @Column(name="SOA_CTRL_INT_ESOCIAL_ID")
    private Long soaCtrlIntEsocialId;
    @Transient
    private List<TwoSoaCtrlIntEsocial> soaCtrlIntEsocialCollection;

    @Column(name="DIAS_VALIDADE_ASO")
    private Long diasValidadeAso;
    @Column(name="DATA_VALIDADE_ASO", nullable = false)
    private Timestamp dataValidadeAso;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="QUALIFIER_ID", referencedColumnName="TYPE_ID")
    private TwoType qualifierCollection;
}
