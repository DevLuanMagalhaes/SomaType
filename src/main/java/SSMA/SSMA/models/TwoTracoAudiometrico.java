package SSMA.SSMA.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_TRACO_AUDIOMETRICO")
@SequenceGenerator(name="seqTracoAudiometricoId", sequenceName="TWO_TRACO_AUDIOMETRICO_S", allocationSize=1)
public class TwoTracoAudiometrico implements TwoEntity{

    @Id
    @Column(name="TRACO_AUDIOMETRICO_ID", nullable = false)
    //@GeneratedValue(generator="seqRiskId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tracoAudiometricoId;
    @Column(name="EXAMS_RESULTS_ID", nullable = false)
    private Long examsResultsId;
    @Column(name="OUVIDO", length = 1)
    private String ouvido;
    @Column(name="VIA", length = 1)
    private String via;
    @Column(name="FREQ_250_HZ", length = 3)
    private Long freq_250_hz;
    @Column(name="FREQ_500_HZ", length = 3)
    private Long freq_500_hz;
    @Column(name="FREQ_1000_HZ", length = 3)
    private Long freq_1000_hz;
    @Column(name="FREQ_2000_HZ", length = 3)
    private Long freq_2000_hz;
    @Column(name="FREQ_3000_HZ", length = 3)
    private Long freq_3000_hz;
    @Column(name="FREQ_4000_HZ", length = 3)
    private Long freq_4000_hz;
    @Column(name="FREQ_6000_HZ", length = 3)
    private Long freq_6000_hz;
    @Column(name="FREQ_8000_HZ", length = 3)
    private Long freq_8000_hz;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinTable(name = "SSMA_TRACO_AUDIOM_AUSEN_RESP",
            joinColumns = { @JoinColumn(name="TRACO_AUDIOMETRICO_ID", referencedColumnName="TRACO_AUDIOMETRICO_ID")},
            inverseJoinColumns = {@JoinColumn(name="AUSENCIA_RESPOSTA_ID", referencedColumnName="TYPE_ID")})
    private List<TwoType> tracoAudiomAusenRespList;


    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(name = "SSMA_TRACO_AUDIOM_MASCARAM",
            joinColumns = { @JoinColumn(name="TRACO_AUDIOMETRICO_ID", referencedColumnName="TRACO_AUDIOMETRICO_ID")},
            inverseJoinColumns = {@JoinColumn(name="MASCARAMENTO_ID", referencedColumnName="TYPE_ID")})
    private List<TwoType> tracoAudiomMascaramList;
}
