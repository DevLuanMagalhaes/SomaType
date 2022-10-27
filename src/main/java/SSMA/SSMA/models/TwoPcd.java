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
@Table(name = "TWO_PCD")
public class TwoPcd implements TwoEntity{

    @Id
    @Column(name="PCD_ID", nullable = false)
    //@GeneratedValue(generator="seqHealthCenterId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pcdId;
    @Column(name="ESTABID", nullable = false, length = 12)
    private String estabid;
    @Column(name="EMPLID", length = 11)
    private String emplid;
    @Column(name="EMPL_RCD")
    private Long emplRcd;
    @Column(name="ODB_PRE_ADM_ID", length = 8)
    private String odbPreAdmId;
    @Column(name="EXAME_OCUPACIONAL_ID", nullable = false)
    private Long exameOcupacionalId;
    @Column(name="VALUATION_DATE", nullable = false)
    private Timestamp valuationDate;
    @Column(name="PHYSICAL_CHANGES_DESCR", length = 500)
    private String physicalChangesDescr;
    @Column(name="FUNCTIONAL_LIMITATIONS_DESCR", length = 500)
    private String functionalLimitationsDescr;
    @Column(name="NOTE", length = 500)
    private String note;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
    @Transient
    private String disabilityCategoryPsf;
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="PCD_IND", referencedColumnName="TYPE_ID")
    private TwoType pcdIndCollection;
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="DISABILITY_ORIGIN_ID", referencedColumnName="TYPE_ID")
    private TwoType disabilityOriginCollection;
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="DISABILITY_CATEGORY_ID", referencedColumnName="TYPE_ID")
    private TwoType disabilityCategoryCollection;
    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="DISABILITY_ID", referencedColumnName="TYPE_ID")
    private TwoType disabilityCollection;
    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="PPP_SITUATION_ID", referencedColumnName="TYPE_ID")
    private TwoType pppSituationCollection;
}
