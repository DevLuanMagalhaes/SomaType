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
@Table(name = "TWO_EXAM_OCUP_IMPR_DIAGN")
public class TwoExamOcupImprDiagn implements TwoEntity{


    @Id
    @Column(name="EXAM_OCUP_IMPR_DIAGN_ID", nullable = false, length = 8)
    //@GeneratedValue(generator="seqexamOcupImprDiagnId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long examOcupImprDiagnId;
    @Column(name="EXAME_OCUPACIONAL_ID", nullable = false, length = 8)
    private Long exameOcupacionalId;
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

    @Transient
    private TwoType cidCollection;

}
