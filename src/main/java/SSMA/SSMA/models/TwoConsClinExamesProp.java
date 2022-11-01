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
@Table(name = "TWO_CONS_CLIN_EXAMES_PROP")
@SequenceGenerator(name="seqConsClinExamesPropId", sequenceName="TWO_CONS_CLIN_EXAMES_PROP_S", allocationSize=1)
public class TwoConsClinExamesProp implements TwoEntity{

    @Id
    @Column(name="CONS_CLIN_EXAMES_PROP_ID", nullable = false, length = 8)
   // @GeneratedValue(generator="seqConsClinExamesPropId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long consClinExamesPropId;

    @Column(name="CONSULTA_CLINICA_ID", nullable = false, length = 8)
    private Long consultaClinicaId;

    @Column(name="EXAM_ID", nullable = false)
    private Long examId;

    @Transient
    private TwoExams examCollection;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @Column(name="EXAM_GROUP_ID")
    private Long examGroupId;

    @Transient
    private TwoType examGroupCollection;
}


