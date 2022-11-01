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
@Table(name = "TWO_USER_ACCESS_FUNCTION")
@SequenceGenerator(name="seqUserAccessFunctionId", sequenceName="TWO_USER_ACCESS_FUNCTION_S", allocationSize=1)
public class TwoUserAccessFunction implements  TwoEntity{

    @Id
    @Column(name="USER_ACCESS_FUNCTION_ID", nullable = false)
    //@GeneratedValue(generator="seqRiskId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userAccessFunctionId;
    @Column(name="USER_ID", nullable = false)
    private Long userId;
    @Column(name="ACCESS_GROUP_ID", nullable = false)
    private Long accessGroupId;
    @Column(name="CREATED_BY", length = 120)
    private Long createdBy;
    @Column(name="CREATION_DATE")
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", length = 120)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;
}
