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
@Table(name = "TWO_ANAMNESIS_ESTAB")
public class TwoAnamnesisEstab implements TwoEntity{

    @Id
    @Column(name="ANAMNESIS_ESTAB_ID", nullable = false)
    //@GeneratedValue(generator="seqAnamnesisEstabId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long anamnesisEstabId;

    @Column(name="ANAMNESIS_ID")
    private Long anamnesisId;

    @Column(name="ESTABID")
    private String estabId;

    @Transient
    private String estabName;

    @Column(name="CREATED_BY")
    private Long createdBy;

    @Column(name="CREATION_DATE")
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY")
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;

    @Column(name="STATUS")
    private String status;

    @Column(name="ORDER_SEQ")
    private Long orderSeq;
}
