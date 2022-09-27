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
@Table(name = "TWO_CID_BENEFITS_HISTORY")
public class TwoCidBenefitsHistory implements TwoEntity{

    @Id
    @Column(name="CID_BENEFITS_HISTORY_ID", nullable = false, length = 8)
    //@GeneratedValue(generator="seqCidBenefitsHistoryId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cidBenefitsHistoryId;

    @Column(name="BENEFITS_HISTORY_ID", nullable = false, length = 8)
    private Long benefitsHistoryId;

    //@Column(name="CID_ID", nullable = false)
    //private Long cidId;
    @Column(name="MAIN_CID", nullable = false)
    private String mainCid;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="CID_ID", referencedColumnName="TYPE_ID")
    private TwoType cidCollection;
}

