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
@Table(name = "TWO_RISK")
public class TwoRisk implements TwoEntity{

    @Id
    @Column(name="RISK_ID", nullable = false)
    //@GeneratedValue(generator="seqRiskId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long riskId;

    @Column(name="RISK_CODE", nullable = false, length = 10)
    private String riskCode;

    @Column(name="RISK_DESCR", nullable = false, length = 50)
    private String riskDescr;

    @Column(name="PPP_CODE", length = 1)
    private String pppCode;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
