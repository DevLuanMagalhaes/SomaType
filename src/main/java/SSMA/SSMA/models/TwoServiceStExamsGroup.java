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
@Table(name = "TWO_SERVICE_ST_EXAMS_GROUP")
@SequenceGenerator(name="seqStExamsGroupId", sequenceName="TWO_SERVICE_ST_EXAMS_GROUP_S", allocationSize=1)
public class TwoServiceStExamsGroup implements TwoEntity{

    @Id
    @Column(name="ST_EXAMS_GROUP_ID"  )
    //@GeneratedValue(generator="seqRiskId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long StExamsGroupId;

    @Column(name="SERVICE_STATIONS_ID")
    private Long serviceStationsId;
    @Column(name="EXAM_GROUP_ID")
    private Long examsGroupId;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
