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
@Table(name = "TWO_EMAIL_RECIPIENTS")
@SequenceGenerator(name="seqEmailRecipientsId", sequenceName="TWO_EMAIL_RECIPIENTS_S", allocationSize=1)
public class TwoEmailRecipients implements TwoEntity{

    @Id
    @Column(name="EMAIL_RECIPIENTS_ID", nullable = false)
    //@GeneratedValue(generator="seqEmailRecipientsId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailRecipientsId;
    @Column(name="GENERIC_EMAIL_ID", nullable = false)
    private Long genericEmailId;
    @Column(name="EMAIL")
    private String email;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
