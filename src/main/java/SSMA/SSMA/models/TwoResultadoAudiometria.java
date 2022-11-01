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
@Table(name = "TWO_RESULTADO_AUDIOMETRIA")
@SequenceGenerator(name="seqResultadoAudiometriaId", sequenceName="TWO_RESULTADO_AUDIOMETRIA_S", allocationSize=1)
public class TwoResultadoAudiometria implements TwoEntity {

    @Id
    @Column(name="RESULTADO_AUDIOMETRIA_ID", nullable = false)
    //@GeneratedValue(generator="seqRiskId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long resultadoAudiometriaId;
    @Column(name="EXAMS_RESULTS_ID", nullable = false)
    private Long examsResultsId;

    @Column(name="TEMPO_REPOUSO", length = 2)
    private String tempoRepouso;

    @Column(name="DATA_ULTIMA_AFERICAO_AUDIOM")
    private Timestamp dataUltimaAfericaoAudiom;

    @Column(name="LRF_DIREITA")
    private Long lrfDireita;

    @Column(name="LRF_ESQUERDA")
    private Long lrfEsquerda;

    @Column(name="IRF_DIREITA")
    private Long irfDireita;

    @Column(name="IRF_ESQUERDA")
    private Long irfEsquerda;

    @Column(name="LAUDO", length = 2000)
    private String laudo;

    @Column(name="FONOAUDIOLOGO")
    private String fonoaudiologo;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @Column(name="INTERPRETACAO_DIREITA")
    private String interpretacaoDireita;

    @Column(name="INTERPRETACAO_DIREITA_CLASS")
    private String interpretacaoDireitaClass;

    @Column(name="INTERPRETACAO_ESQUERDA")
    private String interpretacaoEsquerda;

    @Column(name="INTERPRETACAO_ESQUERDA_CLASS")
    private String interpretacaoEsquerdaClass;

    @Column(name="GRAU_PERDA_AUDITIVA_DIREITA")
    private String grauPerdaAuditivaDireita;

    @Column(name="GRAU_PERDA_AUDITIVA_ESQUERDA")
    private String grauPerdaAuditivaEsquerda;

    @Column(name="COMPARATIVO_DIRETA")
    private String comparativoDireta;

    @Column(name="COMPARATIVO_ESQUERDA")
    private String comparativoEsquerda;

    @Column(name="LRF_MASCARAMENTO")
    private Long lrfMascaramento;

    @Column(name="IRF_MASCARAMENTO")
    private Long irfMascaramento;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="AUDIOMETER_ID", referencedColumnName="AUDIOMETER_ID")
    private TwoAudiometer audiometerCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="MEATOSCOPIA_DIREITA", referencedColumnName="TYPE_ID")
    private TwoType meatoscopiaDireitaCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="MEATOSCOPIA_ESQUERDA", referencedColumnName="TYPE_ID")
    private TwoType meatoscopiaEsquerdaCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="MEATOMETRIA_DIREITA", referencedColumnName="TYPE_ID")
    private TwoType meatometriaDireitaCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="MEATOMETRIA_ESQUERDA", referencedColumnName="TYPE_ID")
    private TwoType meatometriaEsquerdaCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="INTERPR_DIREITA_CALCULADA", referencedColumnName="TYPE_ID")
    private TwoType interprDireitaCalculadaCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="INTERPR_DIREITA_AVAL_MEDICA", referencedColumnName="TYPE_ID")
    private TwoType interprDireitaAvalMedicaCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="INTERPR_ESQUERDA_CALCULADA", referencedColumnName="TYPE_ID")
    private TwoType interprEsquerdaCalculadaCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="INTERPR_ESQUERDA_AVAL_MEDICA", referencedColumnName="TYPE_ID")
    private TwoType interprEsquerdaAvalMedicaCollection;

    @Transient
    private String permiteAlterarRefSeq;

    @Transient
    private String permiteAlterarTracoAudiom;
}
