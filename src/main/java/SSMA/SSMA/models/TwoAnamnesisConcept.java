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
@Table(name = "TWO_ANAMNESIS_CONCEPT")
public class TwoAnamnesisConcept implements TwoEntity{

    @Id
    @Column(name="ANAMNESIS_CONCEPT_ID", nullable = false)
    //@GeneratedValue(generator="seqAnamnesisConceptId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long anamnesisConceptId;

    @Column(name="CODE", nullable = false, length = 40)
    private String code;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="ANAMNESIS_CONCEPT_ID", referencedColumnName="ANAMNESIS_CONCEPT_ID")
    @MapKey(name="languageCode")
    private Map<String, TwoAnamnesisConceptTl> translate;
}
