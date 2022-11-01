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
@Table(name = "TWO_ANAMNESIS_CONCEPT_LIN_TL")
@SequenceGenerator(name="seqAnamnesisConceptLinesTlId", sequenceName="TWO_ANAMNESIS_CONCEPT_TL_S", allocationSize=1)
public class TwoAnamnesisConceptLinTl implements TwoEntity{

    @Id
    @Column(name="ANAMNESIS_CONCEPT_LINE_TL_ID", nullable = false)
    //@GeneratedValue(generator="seqAnamnesisConceptLinesTlId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long anamnesisConceptLineTlId;

    @Column(name="ANAMNESIS_CONCEPT_LINE_ID")
    private Long anamnesisConceptLineId;

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
