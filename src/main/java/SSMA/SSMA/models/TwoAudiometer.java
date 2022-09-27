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
@Table(name = "TWO_AUDIOMETER")
public class TwoAudiometer implements TwoEntity{

    @Id
    @Column(name="AUDIOMETER_ID", nullable = false)
    //@GeneratedValue(generator="seqAudiometerId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long audiometerId;

    @Column(name="CODE", nullable = false, length = 35)
    private String code;

    @Column(name="DESCR", nullable = false, length = 110)
    private String descr;

    @Column(name="MANUFACTER_NAME", length = 110)
    private String manufacterName;

    @Column(name="MODEL", nullable = false, length = 110)
    private String model;

    @Column(name="SERIE", nullable = false, length = 110)
    private String serie;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
