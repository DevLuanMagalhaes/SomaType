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
@Table(name = "TWO_EPC")
public class TwoEpc implements TwoEntity{

    @Id
    @Column(name="EPC_ID", nullable = false, length = 7)
    @GeneratedValue(generator="seqEpcId")
    private Long epcId;

    @Column(name="EPC_DESCR", nullable = false, length = 70)
    private String epcDescr;

    @Column(name="ESTABID", length = 12)
    private String estabid;

    @Transient
    private String estabDescr;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @Column(name="STATUS", nullable = false, length = 1)
    private String epcStatus;

}
