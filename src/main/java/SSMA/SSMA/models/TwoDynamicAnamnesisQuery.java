package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TwoDynamicAnamnesisQuery implements Serializable {

    @Id
    private Long anamnesisItemResponseId;
    @Column
    private Long anamnesisId;
    @Column
    private String anamnesisName;
    @Column
    private Long anamnesisNameCount;
    @Column
    private String estabid;
    @Column
    private Long anamnesisItemRatedId;
    @Column
    private Long itemRatedSequence;
    @Column
    private String itemRatedDescr;
    @Column
    private String itemRatedExplan;
    @Column
    private String itemRatedCommentFlag;
    @Column
    private Long itemRespSequence;
    @Column
    private String itemRespDescr;
    @Column
    private Long itemRatedCount;
    @Column
    private String itemRespNotation;
    @Column
    private String itemRespCommentFlag;
    @Column
    private String itemRespSexCriterion;
    @Column
    private Long itemRespCriterionAgeOf;
    @Column
    private Long itemRespCriterionAgeTo;
    @Column
    private Long itemRespConceptId;
}
