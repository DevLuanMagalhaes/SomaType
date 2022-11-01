package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_WORKPLACE")
@SequenceGenerator(name="seqWorkplaceId", sequenceName="TWO_WORKPLACE_S", allocationSize=1)
public class TwoWorkplace implements TwoEntity{


    @Id
    @Column(name="WORKPLACE_ID", nullable = false)
    @GeneratedValue(generator="seqWorkplaceId")
    private Long workplaceId;
    @Column(name="ESTABID")
    private String estabid;
    @Column(name="DT_VALID_FROM")
    private Timestamp dtValidFrom;
    @Column(name="WORKPLACE_CODE")
    private String workplaceCode;
    @Column(name="WORKPLACE_NAME")
    private String workplaceName;
    @Column(name="WORKPLACE_DESCR")
    private String workplaceDescr;
    @Column(name="ESTAB_REG_NUMBER")
    private String estabRegNumber;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @Column(name="SOA_CTRL_INT_ESOCIAL_ID", nullable = false)
    private Long soaCtrlIntEsocialId;
    @Transient
    private List<TwoSoaCtrlIntEsocial> soaCtrlIntEsocialCollection;

    @Column(name="LOTACAO_TRIBUTARIA")
    private String lotacaoTributaria;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="WORKPLACE_STATUS", referencedColumnName="TYPE_ID")
    private TwoType workplaceStatusCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="WORKPLACE_TYPE_ID", referencedColumnName="TYPE_ID")
    private TwoType workplaceTypeCollection;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="ESTAB_TYPE_ID", referencedColumnName="TYPE_ID")
    private TwoType estabTypeCollection;
}
