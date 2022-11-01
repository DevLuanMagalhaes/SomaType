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
@Table(name = "TWO_ACCESS_FUNCTION")
@SequenceGenerator(name="seqaccessFunctionId", sequenceName="TWO_ACCESS_FUNCTION_S", allocationSize=1)
public class TwoAccessFunction implements TwoEntity{

    @Id
    @Column(name="ACCESS_FUNCTION_ID", nullable = false, length = 30)
    //@GeneratedValue(generator="seqaccessFunctionId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accessFunctionId;

    @Column(name="ACCESS_FUNCTION_NAME", nullable = false, length = 30)
    private String accessFunctionName;

    @Column(name="ACCESS_FUNCTION_UO", length = 100)
    private String accessFunctionUO;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @Column(name="STATUS", nullable = false, length = 1)
    private String accessFunctionStatus;

    @Column(name="ESOCIAL_FLAG", nullable = false, length = 1)
    private String esocialFlag;

    @Column(name="ESOCIAL_DATE")
    private Timestamp esocialDate;

}
