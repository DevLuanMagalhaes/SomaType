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
@Table(name = "TWO_INCONSISTENCY_CONTROL")
@SequenceGenerator(name="seqInconsistControlId", sequenceName="TWO_INCONSIST_CONTROL_S", allocationSize=1)
public class TwoInconsistencyControl implements TwoEntity{

    @Id
    @Column(name="INCONSIST_CONTROL_ID")
    //@GeneratedValue(generator="seqRiskEpcId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long inconsistControlId;
    @Column(name="INCONSIST_CONTROL_DESCR")
    private String inconsistControlDescr;
    @Column(name="ESTABID")
    private String estabid;
    @Transient
    private String UODescr;
    @Column(name="EMPLID")
    private String emplid;
    @Column(name="EMPL_RCD")
    private Long emplRcd;
    @Column(name="ODB_PRE_ADM_ID")
    private String odbPreAdmId;
    @Transient
    private String name;
    @Column(name="RELATED_TABLE ")
    private String relatedTable;
    @Column(name="ID_RELATED_TABLE")
    private Long idRelatedTable;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
