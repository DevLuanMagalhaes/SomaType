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
@Table(name = "TWO_MANUFACTURER")
public class TwoManufacturer implements TwoEntity{

    @Id
    @Column(name="MANUFACTURER_ID", nullable = false)
    //@GeneratedValue(generator="seqManufactureId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long manufacturerId;
    @Column(name="MANUFACTURER_NAME")
    private String manufacturerName;
    @Column(name="TAX_ID_NUMBER")
    private String taxIdNumber;
    @Column(name="ACTIVE")
    private String active;
    @Column(name="CREATED_BY")
    private Long createdBy;
    @Column(name="CREATION_DATE")
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY")
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;
}
