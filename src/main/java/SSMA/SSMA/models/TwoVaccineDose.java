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
@Table(name = "TWO_VACCINE_DOSE")
public class TwoVaccineDose implements TwoEntity{

    @Id @Column(name="VACCINE_DOSE_ID", nullable = false)
   // @GeneratedValue(generator="seqVaccineDoseId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vaccineDoseId;

    @Column(name="VACCINE_ID", nullable = false)
    private Long vaccineId;

    @Column(name="VALIDITY")
    private Long validity;

    @Column(name="ORDER_SEQUENCE")
    private Long orderSequence;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @Transient
    private String usedVaccineDose;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="VACCINE_DOSE_TYPE_ID", referencedColumnName="TYPE_ID")
    private TwoType vaccineDoseCollection;
}
