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
@Table(name ="TWO_CAT_WITNESS")
public class TwoCatWitness implements TwoEntity{

    @Id
    @Column(name="CAT_WITNESS_ID", nullable = false, length = 10)
    @GeneratedValue(generator="seqCatWitnessId")
    private Long catWitnessId;

    @Column(name="CAT_ID", nullable = true, length = 10)
    private Long catId;

    @Column(name="NAME", nullable = true, length = 70)
    private String name;

    @Column(name="ADDRESS", nullable = true, length = 80)
    private String address;

    @Column(name="DISTRICT", nullable = true, length = 20)
    private String district;

    @Column(name="POSTAL_CODE", nullable = true, length = 11)
    private Long postalCode;

    @Column(name="CITY", nullable = true, length = 40)
    private String city;

    @Column(name="STATE", nullable = true, length = 15)
    private String state;

    @Column(name="PHONE", nullable = true, length = 11)
    private Long phone;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
