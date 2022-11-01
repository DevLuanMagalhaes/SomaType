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
@Table(name = "TWO_TIPO_EXAME_FIS_MENTAL")
@SequenceGenerator(name="seqTipoExameFisMentalId", sequenceName="TWO_TIPO_EXAME_FIS_MENTAL_S", allocationSize=1)
public class TwoTipoExameFisMental implements TwoEntity{

    @Id
    @Column(name="TIPO_EXAME_FIS_MENTAL_ID", nullable = false)
    //@GeneratedValue(generator="seqRiskId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tipoExameFisMentalId;
    @Column(name="TIPO_EXAME_FIS_MENTAL_ORDEM", nullable = false)
    private Long tipoExameFisMentalOrdem;
    @Column(name="TIPO_RESULTADO", nullable = false, length = 30)
    private String tipoResultado;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="AGRUPAMENTO_TIPO_EXAME_CODE", referencedColumnName="TYPE_CODE")
    private TwoType agrupamentoTipoExameCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="TITULO_CODE", referencedColumnName="TYPE_CODE")
    private TwoType tituloCollection;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="NOTA_CODE", referencedColumnName="TYPE_CODE")
    private TwoType notaCollection;
}
