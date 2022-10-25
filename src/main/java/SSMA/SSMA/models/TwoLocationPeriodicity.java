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
@Table(name = "TWO_LOCATION_PERIODICITY")
public class TwoLocationPeriodicity implements TwoEntity {

    @Id
    @Column(name = "LOCATION_PERIOD_ID", nullable = false)
    //@GeneratedValue(generator="seqHealthCenterId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long locationPeriodId;
    @Column(name = "EXAMS_PERIODICITY_ID", nullable = false)
    private Long examsPeriodicityId;
    @Column(name = "LOCATION", nullable = false)
    private String location;
    @Transient
    private String locationDescr;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToMany(orphanRemoval=true, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    @JoinColumn(name="LOCATION_PERIOD_ID", referencedColumnName="LOCATION_PERIOD_ID")
    private List<TwoExamsByLocation> examsByLocationList;
}