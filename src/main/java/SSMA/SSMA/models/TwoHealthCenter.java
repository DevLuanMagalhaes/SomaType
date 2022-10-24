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
@Table(name = "TWO_HEALTH_CENTER")
public class TwoHealthCenter implements TwoEntity{

    @Id
    @Column(name="HEALTH_CENTER_ID", nullable = false)
    //@GeneratedValue(generator="seqHealthCenterId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long healthCenterId;
    @Column(name="CODE", length = 35)
    private String code;
    @Column(name="DESCR", nullable = false, length = 110)
    private String descr;
    @Column(name="COUNTRY", nullable = false, length = 3)
    private String country;
    @Transient
    private String countryDescr;
    @Column(name="STATE", nullable = false, length = 3)
    private String state;
    @Transient
    private String stateDescr;
    @Column(name="COD_CITY", nullable = false, length = 3)
    private String codCity;
    @Transient
    private String cityDescr;
    @Column(name="ADDRESS", nullable = false, length = 250)
    private String address;
    @Column(name="NEIGHBORHOOD", nullable = false, length = 110)
    private String neighborhood;
    @Column(name="PHONE", nullable = false, length = 50)
    private String phone;
    @Column(name="EMAIL", nullable = false, length = 100)
    private String email;
    @Column(name="ESTABID", nullable = false, length = 12)
    private String estabid;
    @Column(name="CNES_CODE", nullable = false, length = 35)
    private String cnesCode;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
