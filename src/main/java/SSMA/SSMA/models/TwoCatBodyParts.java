package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_CAT_BODY_PARTS")
@SequenceGenerator(name="seqCatBodyPartsId", sequenceName="TWO_CAT_BODY_PARTS_S", allocationSize=1)
public class TwoCatBodyParts implements TwoEntity{

    @Id
    @Column(name="CAT_BODY_PARTS_ID", nullable = false)
    //@GeneratedValue(generator="seqCatBodyPartsId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long catBodyPartsId;

    @Column(name="BODY_PARTY_ID", nullable = false)
    private Long bodyPartyId;

    @Column(name="LATERALITY_ID", nullable = false)
    private Long lateralityId;

    @Column(name="CAT_ID", nullable = true)
    private Long catId;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    @CreationTimestamp
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    @UpdateTimestamp
    private Timestamp lastUpdateDate;
}
