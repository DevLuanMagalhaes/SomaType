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
@Table(name = "TWO_EXAM_OCUP_EX_FIS_MENTAL")
@SequenceGenerator(name="seqExameFisMentalId", sequenceName="TWO_EXAM_OCUP_EX_FIS_MENTAL_S", allocationSize=1)
public class TwoExamOcupExFisMental implements TwoEntity{

    @Id
    @Column(name="EXAME_FIS_MENTAL_ID", nullable = false)
    //@GeneratedValue(generator="seqExameFisMentalId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long exameFisMentalId;
    @Column(name="EXAME_OCUPACIONAL_ID", nullable = false)
    private Long exameOcupacionalId;
    @Column(name="TIPO_EXAME_FIS_MENTAL_ID", nullable = false)
    private Long tipoExameFisMentalId;
    @Column(name="EXAME_FIS_MENTAL_DESCR", nullable = false, length = 30)
    private String exameFisMentalDescr;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="RESUTALDO_ID", referencedColumnName="TYPE_ID")
    private TwoType resultadoCollection;
}
