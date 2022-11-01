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
@Table(name = "TWO_ANAMNESIS_ITEM_RESPONS_TL")
@SequenceGenerator(name="seqAnamnesisItemResonsTlId", sequenceName="TWO_ANAMNESIS_ITEM_RESPO_TL_S", allocationSize=1)
public class TwoAnamnesisItemResponsTl implements TwoEntity{

    @Id
    @Column(name="ANAMNESIS_ITEM_RESPONSE_TL_ID", nullable = false)
    //@GeneratedValue(generator="seqAnamnesisItemResonsTlId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long anamnesisItemResponseTlId;

    @Column(name="ANAMNESIS_ITEM_RESPONSE_ID")
    private Long anamnesisItemResponseId;

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
