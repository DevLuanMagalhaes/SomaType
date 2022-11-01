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
@Table(name = "TWO_PERSONAL_ADDRESS")
@SequenceGenerator(name="seqPersonalAddressId", sequenceName="TWO_PERSONAL_ADDRESS_S", allocationSize=1)
public class TwoPersonalAddress implements TwoEntity{

    @Id @Column(name="PERSONAL_ADDRESS_ID")
    //@GeneratedValue(generator="seqTypeId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long personalAddressId;
    @Column(name="EMPLID")
    private String emplid;
    @Column(name="ADDRESS_TYPE")
    private String addressType;
    @Column(name="ADDRESS")
    private String address;
    @Column(name="ADDR_NUMBER")
    private String addrNumber;
    @Column(name="NEIGHBORHOOD")
    private String neighborhood;
    @Column(name="CITY")
    private String city;
    @Column(name="STATE")
    private String state;
    @Column(name="COUNTRY")
    private String country;
    @Column(name="ZIP_CODE")
    private String zipCode;
    @Column(name="ORIGIN_SYSTEM")
    private String originSystem;
    @Column(name="COMMENTS")
    private String comments;
    @Column(name="ADDRESS_COMPLEMENT")
    private String addressComplement;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
    @Transient
    private String nameLastUpdatedBy;

    @Transient
    private PsAddressType addressTypeCollection;
}
