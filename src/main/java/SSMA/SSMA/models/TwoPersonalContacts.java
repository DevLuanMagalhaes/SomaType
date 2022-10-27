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
@Table(name = "TWO_PERSONAL_CONTACTS")
public class TwoPersonalContacts implements TwoEntity {

    @Id @Column(name="PERSONAL_CONTACTS_ID")
    //@GeneratedValue(generator="seqTypeId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long personalContactsId;
    @Column(name="EMPLID")
    private String emplid;
    @Column(name="CPF")
    private String cpf;
    @Column(name="CONTACT_DESCR")
    private String contactDescr;
    @Column(name="OBSERVATION")
    private String observation;
    @Column(name="ORIGIN_SYSTEM")
    private String originSystem;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
    @Transient
    private String nameLastUpdatedBy;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="RECORD_TYPE", referencedColumnName="TYPE_ID")
    private TwoType recordTypeCollection;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="CONTACT_TYPE", referencedColumnName="TYPE_ID")
    private TwoType contactTypeCollection;
}
