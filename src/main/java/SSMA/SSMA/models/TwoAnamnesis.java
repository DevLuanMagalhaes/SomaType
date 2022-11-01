package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_ANAMNESIS")
@SequenceGenerator(name="seqAnamnesisId", sequenceName="TWO_ANAMNESIS_S", allocationSize=1)
public class TwoAnamnesis implements TwoEntity{

    @Id
    @Column(name="ANAMNESIS_ID", nullable = false)
    ///@GeneratedValue(generator="seqAnamnesisId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long anamnesisId;
    @Column(name="ANAMNESIS_TYPE_ID")
    private Long anamnesisTypeId;
    @Column(name="NAME")
    private String name;
    @Column(name="CREATED_BY")
    private Long createdBy;
    @Column(name="CREATION_DATE")
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY")
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;

    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="ANAMNESIS_ID", referencedColumnName="ANAMNESIS_ID")
    @OrderBy("sequence ASC")
    private List<TwoAnamnesisItemRated> itemRated;
}
