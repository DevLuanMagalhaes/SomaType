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
@Table(name = "TWO_ONESOURCE_CONFIG")
public class TwoOnesourceConfig implements TwoEntity {

    @Id @Column(name="ONESOURCE_CONFIG_ID", nullable = false)
    private Long onesourceConfigId;
    @Column(name="URL_ONESOURCE")
    private String urlOnesource;
    @Column(name="ENVIAR_LOTES")
    private String enviarLotes;
    @Column(name="CONSULTAR_LOTES")
    private String consultarLotes;
    @Column(name="USUARIO")
    private String usuario;
    @Column(name="SENHA")
    private String senha;
    @Column(name="VERSAO_PROCESSO_EMISSOR")
    private String versaoProcessoEmissor;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="IDENTIFICACAO_AMBIENTE", referencedColumnName="TYPE_ID")
    private TwoType identificacaoAmbienteCollection;

    @Transient
    private String decryptedPassword;
}
