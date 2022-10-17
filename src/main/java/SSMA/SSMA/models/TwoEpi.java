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
@Table(name = "TWO_EPI")
public class TwoEpi implements TwoEntity{

    @Id @Column(name="EPI_ID", nullable = false, length = 7)
    //GeneratedValue(generator="seqEpiId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long epiId;

    @Column(name="EPI_CA", nullable = false, length = 20)
    private String epiCa;

    @Column(name="EPI_DESCR", nullable = false, length = 70)
    private String epiDescr;

    @Column(name="ESTABID", nullable = false, length = 12)
    private String estabid;

    @Transient
    private String estabDescr;

    @Column(name="VALID_TO_DATE", nullable = false)
    private Timestamp validToDate;

    @Column(name="STATUS", nullable = false, length = 1)
    private String status;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="EPI_CLASS_ID", referencedColumnName="EPI_CLASS_ID")
    private TwoEpiClass epiClass;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="MANUFACTURER_ID", referencedColumnName="MANUFACTURER_ID")
    private TwoManufacturer manufacturer;
}
