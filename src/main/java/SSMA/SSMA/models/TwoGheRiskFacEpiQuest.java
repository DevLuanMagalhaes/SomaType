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
@Table(name = "TWO_GHE_RISK_FAC_EPI_QUEST")
public class TwoGheRiskFacEpiQuest implements TwoEntity{

    @Id
    @Column(name="GHE_RISK_FAC_EPI_QUEST_ID", nullable = false)
    @GeneratedValue(generator="seqGheRiskFacEpiQuestId")
    private Long gheRiskFacEpiQuestId;
    @Column(name="GHE_FACTORS_RISK_EPI_ID", nullable = true)
    private Long gheFactorsRiskEpiId;
    @Column(name="ANSWER", nullable = false, length=1)
    private String answer;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="QUESTION_ID", referencedColumnName="TYPE_ID")
    private TwoType questionCollection;
}
