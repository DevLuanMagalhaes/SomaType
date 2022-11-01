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
@Table(name = " TW0_MEDICAL_COORDINATOR")
@SequenceGenerator(name="seqMedicalCoordinatorId", sequenceName="TWO_MEDICAL_COORDINATOR_S", allocationSize=1)
public class TwoMedicalCoordinator implements TwoEntity{

    @Id
    @Column(name="MEDICAL_COORDINATOR_ID", nullable = false, length = 7)
    //@GeneratedValue(generator="seqHealthCenterId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long medicalCoordinatorId;
    @Column(name="HEALTH_PROFESSION_ID")
    private Long healthProfessionId;
    @Transient
    private TwoHealthProfession healthProfessionCollection;
    @Column(name="START_DATE")
    private Timestamp startDate;
    @Column(name="END_DATE")
    private Timestamp endDate;
    @Column(name="RESPONSIBLE_ESTABID")
    private String responsibleEstabid;
    @Transient
    private PsEstabQuery responsibleEstabidCollection;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
