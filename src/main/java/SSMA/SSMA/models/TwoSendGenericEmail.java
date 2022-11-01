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
@Table(name = "TWO_SEND_GENERIC_EMAIL")
@SequenceGenerator(name="seqSendGenericEmailId", sequenceName="TWO_SEND_GENERIC_EMAIL_S", allocationSize=1)
public class TwoSendGenericEmail implements TwoEntity{

    @Id @Column(name="SEND_GENERIC_EMAIL_ID", nullable = false)
    //@GeneratedValue(generator="seqRiskId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sendGenericEmailId;
    @Column(name="ESTABID")
    private String estabid;
    @Column(name="INSTANCE_ID")
    private Long instanceId;
    @Column(name="SEND_EMAIL")
    private String sendEmail;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="GENERIC_EMAIL_TYPE_ID", referencedColumnName="TYPE_ID")
    private TwoType genericEmailTypeCollection;
}
