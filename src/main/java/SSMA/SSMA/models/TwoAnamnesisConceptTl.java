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
@Table(name = "TWO_ANAMNESIS_CONCEPT_TL")
public class TwoAnamnesisConceptTl implements TwoEntity{

    @Id
    @Column(name="ANAMNESIS_CONCEPT_TL_ID", nullable = false)
    //@GeneratedValue(generator="seqAnamnesisConceptTlId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long anamnesisConceptTlId;

    @Column(name="ANAMNESIS_CONCEPT_ID")
    private Long anamnesisConceptId;

    @Column(name="LANGUAGE_CODE")
    private String languageCode;

    @Column(name="DESCR")
    private String descr;

    @Column(name="CREATED_BY")
    private Long createdBy;

    @Column(name="CREATION_DATE")
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY")
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;
}
