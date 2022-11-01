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
@Table(name = "TWO_SEND_GENERIC_EMAIL_FIELDS")
@SequenceGenerator(name="seqSendGenericEmailFiedsId", sequenceName="TWO_SEND_GENER_EMAIL_FIELDS_S", allocationSize=1)
public class TwoSendGenericEmailFields implements TwoEntity{

    @Id
    @Column(name="SEND_GENERIC_EMAIL_FIEDS_ID", nullable = false)
    //@GeneratedValue(generator="seqRiskId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sendGenericEmailFiedsId;
    @Column(name="SEND_GENERIC_EMAIL_ID", nullable = false)
    private Long sendGenericEmailId;
    @Column(name="FIELD_NAME", nullable = false)
    private String fieldName;
    @Column(name="FIELD_VALUE", nullable = false)
    private String fieldValue;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
