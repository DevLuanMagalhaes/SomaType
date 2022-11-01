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
@Table(name = "TWO_ENVIRONMENTAL_RESPONS")
@SequenceGenerator(name="seqEnvironmentalResponsId", sequenceName="TWO_ENVIRONMENTAL_RESPONS_S", allocationSize=1)
public class TwoEnvironmentalRespons implements TwoEntity{

    @Id
    @Column(name="ENVIRONMENTAL_RESPONS_ID", nullable = false, length = 7)
    //@GeneratedValue(generator="seqEnvironmentalResponsId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long environmentalResponsId;
    @Column(name="EMPLID")
    private String emplid;
    @Column(name="EMPL_RCD")
    private Long emplRcd;
    @Column(name="ESTABID")
    private String estabid;
    @Transient
    private PsEstabQuery estabidCollection;
    @Column(name="START_DATE")
    private Timestamp startDate;
    @Column(name="END_DATE")
    private Timestamp endDate;
    @Column(name="ACTIVE")
    private String active;
    @Column(name="NIT")
    private String nit;
    @Column(name="CLASS_COUNCIL_UF")
    private String classCouncilUf;
    @Transient
    private TwoType classCouncilUfCollection;
    @Column(name="CLASS_COUNCIL_NUMBER")
    private String classCouncilNumber;
    @Column(name="RECORD_TYPE")
    private String recordType;
    @Transient
    private TwoType recordTypeCollection;
    @Column(name="RESPONSIBLE_ESTABID")
    private String responsibleEstabid;
    @Transient
    private PsEstabQuery responsibleEstabidCollection;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @Transient
    private PsPersonNameQuery personDataCollection;
}
