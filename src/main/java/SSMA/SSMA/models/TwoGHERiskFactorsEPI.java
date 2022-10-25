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
@Table(name = "TWO_GHE_RISK_FACTORS_EPI")
public class TwoGHERiskFactorsEPI implements TwoEntity{

    @Id
    @Column(name="GHE_FACTORS_RISK_EPI_ID", nullable = false, length = 6)
    @GeneratedValue(generator="seqRiskEpiId")
    private Long gheFactorsRiskEpiId;
    @Column(name="GHE_FACTORS_RISK_ID", nullable = false, length = 6)
    private Long gheFactorsRiskId;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="EPI_ID", referencedColumnName="EPI_ID")
    private TwoEpi epiCollection;

    @OneToMany(orphanRemoval=true, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    @JoinColumn(name="GHE_FACTORS_RISK_EPI_ID", referencedColumnName="GHE_FACTORS_RISK_EPI_ID")
    private List<TwoGheRiskFacEpiQuest> gheRiskFacEpiQuestList;
}
