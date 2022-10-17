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
public class TwoEpiClass implements TwoEntity{

    @Id
    @Column(name="EPI_CLASS_ID", nullable = false, length = 7)
    //@GeneratedValue(generator="seqEpiClassId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long epiClassId;
    @Column(name="EPI_CLASS_DESCR", nullable = false, length = 70)
    private String epiClassDescr;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
