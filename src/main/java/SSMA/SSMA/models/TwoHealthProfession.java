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
@Table(name = "TWO_HEALTH_PROFESSION")
@SequenceGenerator(name="seqHealthProfessionId", sequenceName="TWO_HEALTH_PROFESSION_S", allocationSize=1)
public class TwoHealthProfession implements TwoEntity{

    @Id
    @Column(name="HEALTH_PROFESSION_ID", nullable = false, length = 7)
    //@GeneratedValue(generator="seqRiskEpcId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long healthProfessionId;
    @Column(name="EMPLID")
    private String emplid;
    @Column(name="EMPL_RCD")
    private Long emplRcd;
    @Column(name="STATUS")
    private String status;
    @Column(name="CLASS_ORGANIZATION_ID")
    private Long classOrganizationId;
    @Column(name="TYPE_RECORD_ID")
    private Long typeRecordId;
    @Column(name="CLASS_COUNCIL_NUMBER")
    private String classCouncilNumber;
    @Column(name="CLASS_COUNCIL_UF")
    private String classCouncilUf;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
    @Transient
    private String name;
    @Transient
    private String classOrganizationDescr;
    @Column(name="ESTABID")
    private String estabid;
    @Transient
    private String uoDescr;
}
