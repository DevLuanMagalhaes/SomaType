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
@Table(name = "TWO_ANAMNESIS_RESPONSE")
public class TwoAnamnesisResponse implements TwoEntity{

    @EmbeddedId
    private TwoAnamnesisResponseIds id;

    @Column(name="FLEX_VALUE_01")
    private String flexValue01;

    @Column(name="FLEX_VALUE_02")
    private String flexValue02;

    @Column(name="CREATED_BY")
    private Long createdBy;

    @Column(name="CREATION_DATE")
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY")
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;

    @Column(name="ODB_PRE_ADM_ID")
    private String odbPreAdmId;
}
