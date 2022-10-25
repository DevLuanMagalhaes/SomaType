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
@Table(name = "TWO_GHE_DANG_UNHEAL_ESP_ACT")
public class TwoGheDangUnhealEspAct implements TwoEntity{

    @Id
    @Column(name="GHE_DANG_UNHEAL_ESP_ACT_ID", nullable = false)
    //@GeneratedValue(generator="seqGheDangUnhealEspActId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gheDangUnhealEspActId;
    @Column(name="GHE_ID", nullable = false)
    private Long gheId;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="ACTV_DANG_UNHEALTH_ESP_ID", referencedColumnName="ACTV_DANG_UNHEALTH_ESP_ID")
    private TwoDangUnhealthEspActv actvDangUnhealthEspCollection;
}
