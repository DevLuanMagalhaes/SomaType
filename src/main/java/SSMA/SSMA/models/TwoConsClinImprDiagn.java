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
public class TwoConsClinImprDiagn implements TwoEntity{

    @Id
    @Column(name="CONS_CLIN_IMPR_DIAGN_ID", nullable = false, length = 8)
    //@GeneratedValue(generator="seqConsClinImprDiagnId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long consClinImprDiagnId;

    @Column(name="CONSULTA_CLINICA_ID", nullable = false, length = 8)
    private Long consultaClinicaId;

    @Column(name="CID_ID", nullable = false)
    private Long cidId;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
