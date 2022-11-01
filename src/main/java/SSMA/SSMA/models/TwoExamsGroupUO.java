package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_EXAMS_GROUP_UO")
@SequenceGenerator(name="seqExamsGroupUOId", sequenceName="TWO_EXAMS_GROUP_UO_S", allocationSize=1)
public class TwoExamsGroupUO implements Serializable {

    @Id @Column(name="EXAM_GROUP_UO_ID", nullable = false)
    //@GeneratedValue(generator="seqExamsGroupUOId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long examGroupUOId;

    @Column(name="estabid", nullable = false, length = 12)
    private String estabid;

    @Column(name="EXAM_ID", nullable = false, length = 6, insertable = false, updatable = false )
    private Long examIdRO; // Read Only

    @Column(name="UNIT_VALUE", length = 7)
    private Double unitValue;

    @Column(name="YEAR_QUANTITY", nullable = false, length = 1)
    private String yearQuantity;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="EXAM_GROUP_ID", referencedColumnName="TYPE_ID")
    private TwoType typeCollection;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="EXAM_ID", referencedColumnName="EXAM_ID")
    private TwoExams examCollection;
}
