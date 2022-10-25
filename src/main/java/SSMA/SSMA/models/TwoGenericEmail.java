package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_GENERIC_EMAIL")
public class TwoGenericEmail implements TwoEntity{

    @Id @Column(name="GENERIC_EMAIL_ID", nullable = false)
    //@GeneratedValue(generator="seqGenericEmailId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long genericEmailId;
    @Column(name="ESTABID")
    private String estabid;
    @Column(name="GENERIC_EMAIL_SUBJECT")
    private String genericEmailSubject;
    @Column(name="GENERIC_EMAIL_TEXT")
    private String genericEmailText;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="GENERIC_EMAIL_TYPE_ID", referencedColumnName="TYPE_ID")
    private TwoType genericEmailTypeCollection;

    @OneToMany(orphanRemoval=true, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    @JoinColumn(name="GENERIC_EMAIL_ID", referencedColumnName="GENERIC_EMAIL_ID")
    private List<TwoEmailRecipients> emailRecipientsList;
}
