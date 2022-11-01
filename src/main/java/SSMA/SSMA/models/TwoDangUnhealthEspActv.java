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
@Table(name = "TWO_DANG_UNHEALTH_ESP_ACTV")
@SequenceGenerator(name="seqActvDangUnhealthEspId", sequenceName="TWO_ACTV_DANG_UNHEAL_ESP_S", allocationSize=1)
public class TwoDangUnhealthEspActv implements TwoEntity{

    @Id
    @Column(name="ACTV_DANG_UNHEALTH_ESP_ID", nullable = false)
    //@GeneratedValue(generator="seqActvDangUnhealthEspId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long actvDangUnhealthEspId;

    @Column(name="ACTIVITIES_CODE", nullable = false, length = 6)
    private String activitiesCode;

    @Column(name="ACTIVITIES_DESCR", nullable = false, length = 3000)
    private String activitiesDescr;

    @Column(name="ACTIVE", length = 1)
    private String active;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="ACTIVITIES_GROUP_ID", referencedColumnName="TYPE_ID")
    private TwoType activitiesGroupCollection;
}
