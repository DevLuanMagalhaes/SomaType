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
@Table(name = "TWO_TRACO_AUDIOM_MASCARAM")
@SequenceGenerator(name="seqTracoAudiomMascaramId", sequenceName="TWO_TRACO_AUDIOM_MASCARAM_S", allocationSize=1)
public class TwoTracoAudiomMascaram implements TwoEntity{

    @Id
    @Column(name="TRACO_AUDIOM_MASCARAM_ID", nullable = false)
    //@GeneratedValue(generator="seqRiskId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tracoAudiomMascaramId;
    @Column(name="TRACO_AUDIOMETRICO_ID", nullable = false)
    private Long tracoAudiometricoId;
    @Column(name="MASCARAMENTO_ID", nullable = false)
    private Long mascaramentoId;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
