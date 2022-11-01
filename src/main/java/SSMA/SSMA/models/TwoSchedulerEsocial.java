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
@Table(name = "TWO_SCHEDULER_ESOCIAL")
@SequenceGenerator(name="seqSchedulerEsocialId", sequenceName="TWO_SCHEDULER_ESOCIAL_S", allocationSize=1)
public class TwoSchedulerEsocial implements TwoEntity{

    @Id @Column(name="SCHEDULER_ESOCIAL_ID")
    //@GeneratedValue(generator="seqRiskId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long schedulerEsocialId;
    @Column(name="COMPANY")
    private String company;
    @Column(name="INTERRUPTED")
    private String interrupted;
    @Column(name="SCHEDULER_START_DATE")
    private Timestamp schedulerStartDate;
    @Column(name="TIME_UNIT")
    private Long timeUnit;
    @Column(name="LAST_RUN", nullable = false)
    private Timestamp lastRun;
    @Column(name="NEXT_RUN", nullable = false)
    private Timestamp nextRun;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="EVENT_ID", referencedColumnName="TYPE_ID")
    private TwoType eventCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="SCHEDULED_PROCEDURE_ID", referencedColumnName="TYPE_ID")
    private TwoType scheduledProcedureCollection;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="UNIT_TYPE_ID", referencedColumnName="TYPE_ID")
    private TwoType unitTypeCollection;
}
