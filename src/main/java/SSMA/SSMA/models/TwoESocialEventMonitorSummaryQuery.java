package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TwoESocialEventMonitorSummaryQuery implements Serializable {

    @EmbeddedId
    private TwoESocialEventMonitorSummaryQueryId id;

    @Column(name="EVENTO")
    private String evento;

    @Column(name="TOTAL_EVENTO")
    private Long totalEvento;

    @Column(name="NOVO")
    private Long novo;

    @Column(name="ERROS")
    private Long erros;

    @Column(name="PRONTO_PARA_ENVIO")
    private Long prontoParaEnvio;

    @Column(name="AGUARD_RETORNO")
    private Long aguardRetorno;

    @Column(name="RETORNO_COM_ERRO")
    private Long retornoComErro;

    @Column(name="CONCLUIDO_COM_EXITO")
    private Long concluidoComExito;

    @Column(name="CONCLUIDO_COM_ADVERTENCIA")
    private Long concluidoComAdvertencia;

    @Column(name="CANCELADO")
    private Long cancelado;
}
