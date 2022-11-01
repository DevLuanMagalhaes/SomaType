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
@Table(name = "TWO_EMPL_IMMUNIZATION_CTRL")
@SequenceGenerator(name="seqEmplImmunizationCtrlId", sequenceName="TWO_EMPL_IMMUNIZAT_CTRL_S", allocationSize=1)
public class TwoEmplImmunizationCtrl implements TwoEntity{

    @Id
    @Column(name="EMPL_IMMUNIZATION_CTRL_ID", nullable = false)
    //@GeneratedValue(generator="seqEmplImmunizationCtrlId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emplImmunizationCtrlId;
    @Column(name="ESTABID")
    private String estabid;
    @Column(name="EMPLID")
    private String emplid;
    @Column(name="EMPL_RCD")
    private Long emplRcd;
    @Column(name="VACCINE_DATE")
    private Timestamp vaccineDate;
    @Column(name="VACCINE_REFUSAL")
    private String vaccineRefusal;
    @Column(name="VACCINE_REFUSAL_JUSTIFIC")
    private String vaccineRefusalJustific;
    @Column(name="RETURN_DATE")
    private Timestamp returnDate;
    @Column(name="LABORATORY")
    private String laboratory;
    @Column(name="LOTE_NUMBER")
    private String loteNumber;
    @Column(name="NOTE")
    private String note;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="VACCINE_ID", referencedColumnName="VACCINE_ID")
    private TwoVaccine vaccineCollection;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="VACCINE_DOSE_ID", referencedColumnName="VACCINE_DOSE_ID")
    private TwoVaccineDose vaccineDoseCollection;

}
