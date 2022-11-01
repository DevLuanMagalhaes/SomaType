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
@Table(name = "TWO_HEALTH_PROFESSION_ESTAB")
@SequenceGenerator(name="seqHealthProfessionEstabId", sequenceName="TWO_HEALTH_PROFESSION_ESTAB_S", allocationSize=1)
public class TwoHealthProfessionEstab implements TwoEntity{

    @Id
    @Column(name="HEALTH_PROFESSION_ESTAB_ID")
    //@GeneratedValue(generator="seqRiskEpcId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long healthProfessionEstabId;
    @Column(name="HEALTH_PROFESSION_ID")
    private Long healthProfessionId;
    @Column(name="ESTABID")
    private String estabid;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
