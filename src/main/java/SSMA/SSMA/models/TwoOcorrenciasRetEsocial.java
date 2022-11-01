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
@Table(name = "TWO_OBSERVACOES_PPP")
@SequenceGenerator(name="seqOcorrenciasRetEsocialId", sequenceName="TWO_OCOR_RET_ESOCIAL_S", allocationSize=1)
public class TwoOcorrenciasRetEsocial implements TwoEntity{

    @Id
    @Column(name="OCORRENCIAS_RET_ESOCIAL_ID", nullable = false)
    //@GeneratedValue(generator="seqHealthCenterId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ocorrenciasRetEsocialId;
    @Column(name="SOA_CTRL_INT_ESOCIAL_ID")
    private Long soaCtrlIntEsocialId;
    @Column(name="CODIGO")
    private String codigo;
    @Column(name="DESCRICAO")
    private String descricao;
    @Column(name="TIPO")
    private String tipo;
    @Column(name="LOCALIZACAO")
    private String localizacao;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @Transient
    private String tipoDescr;
}
