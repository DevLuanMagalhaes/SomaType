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
@Table(name = "TWO_CAT_LESION_NATURE")
@SequenceGenerator(name="seqCatLesionNatureId", sequenceName="TWO_CAT_LESION_NATURE_S", allocationSize=1)
public class TwoCatLesionNature implements TwoEntity {

    @Id
    @Column(name = "CAT_LESION_NATURE_ID", nullable = false)
    //@GeneratedValue(generator="seqCatLesionNatureId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long catLesionNatureId;

    @Column(name = "LESION_NATURE_ID", nullable = false)
    private Long lesionNatureId;

    @Column(name = "CAT_ID", nullable = false)
    private Long catId;

    @Column(name = "CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name = "CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name = "LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

}