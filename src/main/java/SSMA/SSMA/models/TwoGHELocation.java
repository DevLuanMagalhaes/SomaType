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
@Table(name = "TWO_GHE_LOCATION")
@SequenceGenerator(name="seqGHELocationId", sequenceName="TWO_GHE_LOCATION_S", allocationSize=1)
public class TwoGHELocation implements TwoEntity{

    @Id
    @Column(name="GHE_LOCATION_ID", nullable = false)
    //@GeneratedValue(generator="seqGHELocationId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gheLocationId;
    @Column(name="GHE_ID", nullable = false)
    private Long gheId;
    @Column(name="LOCATION", nullable = false, length = 10)
    private String location;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
    @Transient
    private String locationDescr;

    @Transient
    private String workEnviromentDescrWorkplace;

}
