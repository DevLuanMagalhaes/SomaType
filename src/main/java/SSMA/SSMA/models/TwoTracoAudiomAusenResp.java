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
@Table(name = "TWO_TRACO_AUDIOM_AUSEN_RESP")
@SequenceGenerator(name="seqTracoAudiomAusenRespId", sequenceName="TWO_TRACO_AUD_AUSEN_RESP_S", allocationSize=1)
public class TwoTracoAudiomAusenResp implements  TwoEntity{

    @Id
    @Column(name="TRACO_AUDIOM_AUSEN_RESP_ID", nullable = false)
    //@GeneratedValue(generator="seqRiskId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tracoAudiomAusenRespId;
    @Column(name="TRACO_AUDIOMETRICO_ID", nullable = false)
    private Long tracoAudiometricoId;
    @Column(name="AUSENCIA_RESPOSTA_ID", nullable = false)
    private Long ausenciaRespostaId;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
