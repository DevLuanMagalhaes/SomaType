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
@Table(name = "TWO_ESOCIAL_EVENT_CATALOG")
public class TwoEsocialEventCatalog implements TwoEntity{

    @Id
    @Column(name = "ESOCIAL_EVENT_CATALOG_ID")
    //@GeneratedValue(generator="seqEsocialEventCatalogId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long esocialEventCatalogId;
    @Column(name = "MESSAGE_CODE")
    private String messageCode;
    @Column(name = "MESSAGE_TITLE")
    private String messageTitle;
    @Column(name = "MESSAGE_DESCR")
    private String messageDescr;
    @Column(name = "CREATION_DATE")
    private Timestamp creationDate;
    @Column(name = "LAST_UPDATED_BY")
    private Long lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;
    @Column(name = "CREATED_BY")
    private Long createdBy;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="MESSAGE_ORIGIN_ID", referencedColumnName="TYPE_ID")
    private TwoType messageOriginCollection;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="MONITOR_STATUS_ID", referencedColumnName="TYPE_ID")
    private TwoType monitorStatusCollection;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="PARENT_TAG_ID", referencedColumnName="TYPE_ID")
    private TwoType parentTagCollection;

    @OneToMany(orphanRemoval=true, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    @JoinColumn(name="ESOCIAL_EVENT_CATALOG_ID", referencedColumnName="ESOCIAL_EVENT_CATALOG_ID")
    private List<TwoEsocialOcorrEvento> ocorrEventoList;
}
