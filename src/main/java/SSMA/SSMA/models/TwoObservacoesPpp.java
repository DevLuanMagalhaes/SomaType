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
public class TwoObservacoesPpp implements TwoEntity{

    @Id
    @Column(name="OBSERVACOES_PPP_ID", nullable = false)
    //@GeneratedValue(generator="seqHealthCenterId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long observacoesPppId;
    @Column(name="ESTABID", nullable = false)
    private String estabid;
    @Column(name="EMPLID", nullable = false)
    private String emplid;
    @Column(name="EMPL_RCD", nullable = false)
    private Long emplRcd;
    @Column(name="OBSERVACAO", nullable = false)
    private String observacao;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
