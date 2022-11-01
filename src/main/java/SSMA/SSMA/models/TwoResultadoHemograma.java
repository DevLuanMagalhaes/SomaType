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
@Table(name = "TWO_RESULTADO_HEMOGRAMA")
@SequenceGenerator(name="seqResultadoHemogramaId", sequenceName="TWO_RESULTADO_HEMOGRAMA_S", allocationSize=1)
public class TwoResultadoHemograma implements TwoEntity{

    @Id
    @Column(name="RESULTADO_HEMOGRAMA_ID", nullable = false)
    //@GeneratedValue(generator="seqRiskId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long resultadoHemogramaId;
    @Column(name="EXAMS_RESULTS_ID", nullable = false)
    private Long examsResultsId;
    @Column(name="VALOR", nullable = false, precision = 10, scale = 2)
    private Double valor;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="DESCR_ITEM_ID", referencedColumnName="TYPE_ID")
    private TwoType descrItemCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="TIPO_HEMOGRAMA_ID", referencedColumnName="TYPE_ID")
    private TwoType tipoHemogramaCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="RESULTADO_ID", referencedColumnName="TYPE_ID")
    private TwoType resultadoCollection;
}
