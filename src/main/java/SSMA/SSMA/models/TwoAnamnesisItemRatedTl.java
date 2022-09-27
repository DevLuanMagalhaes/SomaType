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
@Table(name = "TWO_ANAMNESIS_ITEM_RATED_TL")
public class TwoAnamnesisItemRatedTl implements TwoEntity{

    @Id
    @Column(name="ANAMNESIS_ITEM_RATED_TL_ID", nullable = false)
    //@GeneratedValue(generator="SsmaAnamnesisItemRatedId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long anamnesisItemRatedTlId;

    @Column(name="ANAMNESIS_ITEM_RATED_ID")
    private Long anamnesisItemRatedId;

    @Column(name="LANGUAGE_CODE")
    private String languageCode;

    @Column(name="DESCR")
    private String descr;

    @Column(name="EXPLANATORY_TEXT")
    private String explanatoryText;

    @Column(name="CREATED_BY")
    private Long createdBy;

    @Column(name="CREATION_DATE")
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY")
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;
}
