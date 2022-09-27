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
@Table(name = "TWO_ANAMNESIS_ITEM_RESPONSE")
public class TwoAnamnesisItemResponse implements TwoEntity{

    @Id
    @Column(name="ANAMNESIS_ITEM_RESPONSE_ID", nullable = false)
    //@GeneratedValue(generator="seqAnamnesisItemRespId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long anamnesisItemResponseId;
    @Column(name="ANAMNESIS_ITEM_RATED_ID")
    private Long anamnesisItemRatedId;
    @Column(name="SEQUENCE")
    private Long sequence;
    @Column(name="NOTATION")
    private String notation;
    @Column(name="COMMENT_FLAG")
    private String commentFlag;
    @Column(name="SEX_CRITERION")
    private String sexCriterion;
    @Column(name="CRITERION_AGE_OF")
    private Long criterionAgeOf;
    @Column(name="CRITERION_AGE_TO")
    private Long criterionAgeTo;
    @Column(name="CONCEPT_ID")
    private Long conceptId;
    @Column(name="CREATED_BY")
    private Long createdBy;
    @Column(name="CREATION_DATE")
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY")
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;
    @Column(name="VISIBLE")
    private String visible;

    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="ANAMNESIS_ITEM_RESPONSE_ID", referencedColumnName="ANAMNESIS_ITEM_RESPONSE_ID")
    @MapKey(name="languageCode")
    private Map<String, TwoAnamnesisItemResponsTl> translate;
}
