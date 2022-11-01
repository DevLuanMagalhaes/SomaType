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
@Table(name = "TWO_CARGA_2240_CTRL")
@SequenceGenerator(name="seqcarga2240ctrl", sequenceName="TWO_CARGA_2240_CTRL_S", allocationSize=1)
public class TwoCarga2240Ctrl implements TwoEntity{

    @Id
    @Column(name="CARGA_ID", nullable = false, length = 30)
    //@GeneratedValue(generator="seqcarga2240ctrl")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cargaId;

    @Column(name="GHE_ID", nullable = false, length = 30)
    private Long gheId;

    @Column(name="GHE_CODE", length = 100)
    private Long gheCode;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @Column(name="STATUS", nullable = false, length = 1)
    private String status;

    @Column(name="MSG")
    private String msg;
}
