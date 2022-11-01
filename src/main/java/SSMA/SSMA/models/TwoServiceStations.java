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
@Table(name = "TWO_SERVICE_STATIONS")
@SequenceGenerator(name="seqServiceStationId", sequenceName="TWO_SERVICE_STATIONS_S", allocationSize=1)
public class TwoServiceStations implements TwoEntity{

    @Id @Column(name="SERVICE_STATIONS_ID"  )
    //@GeneratedValue(generator="seqRiskId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceStationsId;
    @Column(name="DESCRIPTION")
    private String description;
    @Column(name="ESTABID")
    private String estabid;
    @Column(name="ADDRESS")
    private String address;
    @Column(name="DISTRICT")
    private String district;
    @Column(name="CITY")
    private String city;
    @Column(name="STATE")
    private String state;
    @Column(name="CEP")
    private String cep;
    @Column(name="CNPJ")
    private String cnpj;
    @Column(name="TELEPHONE")
    private String telephone;
    @Column(name="STATUS")
    private String status;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinTable(name = "SSMA_SERVICE_ST_EXAMS_GROUP",
            joinColumns = { @JoinColumn(name="SERVICE_STATIONS_ID", referencedColumnName="SERVICE_STATIONS_ID")},
            inverseJoinColumns = {@JoinColumn(name="EXAM_GROUP_ID", referencedColumnName="TYPE_ID")})
    private List<TwoType> examsGroupList;

    @Column(name="CODE", nullable = false)
    private Long code;
}
