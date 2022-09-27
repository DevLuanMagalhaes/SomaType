package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_ANAMNESIS_ITEM_RATED")
public class TwoAnamnesisItemRated implements TwoEntity{
    @Id
    @Column(name="ANAMNESIS_ITEM_RATED_ID", nullable = false)
    //@GeneratedValue(generator="seqAnamnesisItemRatedId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long anamnesisItemRatedId;

    @Column(name="ANAMNESIS_ID")
    private Long anamnesisId;

    @Column(name="SEQUENCE")
    private Long sequence;

    @Column(name="COMMENT_FLAG")
    private String commentFlag;

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
    @JoinColumn(name="ANAMNESIS_ITEM_RATED_ID", referencedColumnName="ANAMNESIS_ITEM_RATED_ID")
    @MapKey(name="languageCode")
    private Map<String, TwoAnamnesisItemRatedTl> translate;

    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="ANAMNESIS_ITEM_RATED_ID", referencedColumnName="ANAMNESIS_ITEM_RATED_ID")
    @OrderBy("sequence ASC")
    private List<TwoAnamnesisItemResponse> itemResponse;
}
