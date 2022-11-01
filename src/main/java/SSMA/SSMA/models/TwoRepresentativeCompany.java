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
@Table(name = "TWO_REPRESENTATIVE_COMPANY")
@SequenceGenerator(name="seqRepresentativeCompanyId", sequenceName="TWO_REPRESENTATIVE_COMPANY_S", allocationSize=1)
public class TwoRepresentativeCompany implements TwoEntity{

    @Id
    @Column(name="REPRESENTATIVE_COMPANY_ID", nullable = false, length = 7)
    //@GeneratedValue(generator="seqTypeId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long representativeCompanyId;
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
