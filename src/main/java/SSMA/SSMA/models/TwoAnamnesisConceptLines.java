package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Map;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_ANAMNESIS_CONCEPT_LINES")
@SequenceGenerator(name="seqAnamnesisConceptLinesId", sequenceName="TWO_ANAMNESIS_CONCEPT_LINES_S", allocationSize=1)
public class TwoAnamnesisConceptLines implements TwoEntity{

    @Id
    @Column(name="ANAMNESIS_CONCEPT_LINE_ID", nullable = false)
    //@GeneratedValue(generator="seqAnamnesisConceptLinesId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long anamnesisConceptLineId;

    @Column(name="ANAMNESIS_CONCEPT_ID")
    private Long anamnesisConceptId;

    @Column(name="SEQUENCE")
    private Long sequence;

    @Column(name="CREATED_BY")
    private Long createdBy;

    @Column(name="CREATION_DATE")
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY")
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;

    @OneToMany(fetch=FetchType.EAGER, cascade= CascadeType.ALL)
    @JoinColumn(name="ANAMNESIS_CONCEPT_LINE_ID", referencedColumnName="ANAMNESIS_CONCEPT_LINE_ID")
    private Map<String, TwoAnamnesisConceptLinTl> translate;
}
