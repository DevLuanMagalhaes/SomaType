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
@Table(name = "TWO_RESULTADO_ESPIROMETRIA")
@SequenceGenerator(name="seqResultadoEspirometriaId", sequenceName="SSMA_RESULTADO_ESPIROMETRIA_S", allocationSize=1)
public class TwoResultadoEspirometria implements TwoEntity{

    @Id
    @Column(name="RESULTADO_ESPIROMETRIA_ID", nullable = false)
    //@GeneratedValue(generator="seqRiskId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long resultadoEspirometriaId;
    @Column(name="EXAMS_RESULTS_ID", nullable = false)
    private Long examsResultsId;
    @Column(name="PREVISTO", nullable = false, precision = 6, scale = 2)
    private Double previsto;
    @Column(name="PRIMEIRO_REAL", nullable = false, precision = 6, scale = 2)
    private Double primeiroReal;
    @Column(name="PERC_PRIMEIRO_REAL", nullable = false, precision = 6, scale = 2)
    private Double percPrimeiroReal;
    @Column(name="SEGUNDO_REAL", nullable = false, precision = 6, scale = 2)
    private Double segundoReal;
    @Column(name="PERC_SEGUNDO_REAL", nullable = false, precision = 6, scale = 2)
    private Double percSegundoReal;
    @Column(name="TERCEIRO_REAL", nullable = false, precision = 6, scale = 2)
    private Double terceiroReal;
    @Column(name="PERC_TERCEIRO_REAL", nullable = false, precision = 6, scale = 2)
    private Double percTerceiroReal;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="DESCR_ITEM_ID", referencedColumnName="TYPE_ID")
    private TwoType descrItemCollection;
}
