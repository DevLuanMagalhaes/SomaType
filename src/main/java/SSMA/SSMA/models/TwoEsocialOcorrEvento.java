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
@Table(name = "TWO_ESOCIAL_OCORR_EVENTO")
public class TwoEsocialOcorrEvento implements TwoEntity{

    @Id
    @Column(name = "ESOCIAL_OCORR_EVENTO_ID")
    //@GeneratedValue(generator="seqEsocialOcorrEventoId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long esocialOcorrEventoId;
    @Column(name = "ESOCIAL_EVENT_CATALOG_ID")
    private Long esocialEventCatalogId;
    @Column(name = "CODIGO_OCORRENCIA")
    private String codigoOcorrencia;
    @Column(name = "DESCRICAO_OCORRENCIA")
    private String descricaoOcorrencia;
    @Column(name = "PRIORITARIO")
    private String prioritario;

    @Column(name = "CREATION_DATE")
    private Timestamp creationDate;
    @Column(name = "LAST_UPDATED_BY")
    private Long lastUpdatedBy;
    @Column(name = "LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;
    @Column(name = "CREATED_BY")
    private Long createdBy;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="MONITOR_STATUS_ID", referencedColumnName="TYPE_ID")
    private TwoType monitorStatusCollection;
}
