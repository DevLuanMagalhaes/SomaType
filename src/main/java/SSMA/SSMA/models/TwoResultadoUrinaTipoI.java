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
@Table(name = "TWO_RESULTADO_URINA_TIPO_I")
@SequenceGenerator(name="seqResultadoUrinaId", sequenceName="TWO_RESULTADO_URINA_TIPO_I_S", allocationSize=1)
public class TwoResultadoUrinaTipoI implements TwoEntity{

    @Id
    @Column(name="RESULTADO_URINA_ID", nullable = false)
    //@GeneratedValue(generator="seqRiskId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long resultadoUrinaId;
    @Column(name="EXAMS_RESULTS_ID", nullable = false)
    private Long examsResultsId;
    @Column(name="RESULTADO", nullable = false, length=15)
    private String resultado;

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

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="TIPO_EXAME_URINA_ID", referencedColumnName="TYPE_ID")
    private TwoType tipoExameUrinaCollection;
}
