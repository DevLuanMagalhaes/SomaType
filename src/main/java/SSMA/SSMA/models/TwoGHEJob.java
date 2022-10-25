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
@Table(name = "TWO_GHE_JOB")
public class TwoGHEJob implements TwoEntity{

    @Id
    @Column(name="GHE_JOB_ID", nullable = false)
    //@GeneratedValue(generator="seqGHEJobId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gheJobId;

    @Column(name="GHE_ID", nullable = false)
    private Long gheId;

    @Column(name="JOBCODE", nullable = false, length = 6)
    private String jobCode;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
