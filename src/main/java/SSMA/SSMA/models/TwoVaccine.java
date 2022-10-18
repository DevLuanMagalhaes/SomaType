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
@Table(name = "TWO_VACCINE")
public class TwoVaccine implements TwoEntity{

    @Id @Column(name="VACCINE_ID", nullable = false)
    //@GeneratedValue(generator="seqVaccineId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vaccineId;
    @Column(name="VACCINE_DESCR")
    private String vaccineDescr;
    @Column(name="ACTIVE")
    private String active;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @Transient
    private String usedVaccine;

    @OneToMany(orphanRemoval=true, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    @JoinColumn(name="VACCINE_ID", referencedColumnName="VACCINE_ID")
    private List<TwoVaccineDose> vaccineDoseList;

}
