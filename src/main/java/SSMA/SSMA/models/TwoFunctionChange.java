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
@Table(name = "TWO_FUNCTION_CHANGE")
@SequenceGenerator(name="seqFunctionChangeId", sequenceName="TWO_FUNCTION_CHANGE_S", allocationSize=1)
public class TwoFunctionChange implements TwoEntity{

    @Id
    @Column(name="FUNCTION_CHANGE_ID", nullable = false)
    //@GeneratedValue(generator="seqFunctionChangeId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long functionChangeId;
    @Column(name="COMPANY", nullable = false, length = 3)
    private String company;
    @Column(name="ESTABID", nullable = false, length = 12)
    private String estabid;
    @Column(name="EMPLID", length = 30)
    private String emplid;
    @Column(name="EMPL_RCD", nullable = false)
    private Long emplRcd;
    @Column(name="FUNCTION_CHANGE_DATE", nullable = false)
    private Timestamp functionChangeDate;
    @Column(name="FUNCTION_CHANGE_SEQ", nullable = false)
    private Long functionChangeSeq;
    @Column(name="CURRENT_JOBCODE", length = 6)
    private String currentJobcode;
    @Transient
    private String currentJobDescr;
    @Column(name="CURRENT_LOCATION", length = 10)
    private String currentLocation;
    @Transient
    private String currentLocationDescr;
    @Column(name="NEXT_JOBCODE", length = 6)
    private String nextJobcode;
    @Transient
    private String nextJobDescr;
    @Column(name="NEXT_LOCATION", length = 10)
    private String nextLocation;
    @Transient
    private String nextLocationDescr;
    @Column(name="COMPETENCE_EXPECTED_DATE", nullable = false)
    private Timestamp competenceExpectedDate;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
