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
@Table(name = "TWO_GHE_RISK_FACTORS_EPC")
@SequenceGenerator(name="seqRiskEpcId", sequenceName="TWO_GHE_RISK_FACTORS_EPC_S", allocationSize=1)
public class TwoGHERiskFactorsEPC implements TwoEntity{

    @Id
    @Column(name="GHE_FACTORS_RISK_EPC_ID", nullable = false, length = 6)
    //@GeneratedValue(generator="seqRiskEpcId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gheFactorsRiskEpcId;
    @Column(name="GHE_FACTORS_RISK_ID", nullable = false, length = 6)
    private Long gheFactorsRiskId;
    @Column(name="EPC_ID", nullable = false, length = 6)
    private Long epcId;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
