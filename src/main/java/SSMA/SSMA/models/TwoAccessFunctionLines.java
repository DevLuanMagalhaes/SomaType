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
@Table(name = "TWO_ACCESS_FUNCTION_LINES")
@SequenceGenerator(name="seqaccessFunctionLineId", sequenceName="TWO_ACCESS_FUNCTION_LINES_S", allocationSize=1)
public class TwoAccessFunctionLines implements TwoEntity{

    @Column(name="ACCESS_FUNCTION_ID", nullable = false)
    private Long accessFunctionId;

    @Id
    @Column(name="ACCESS_FUNCTION_LINE_ID", nullable = false)
    //@GeneratedValue(generator="seqaccessFunctionLineId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accessFunctionLineId;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(length = 10)
    private String deptid;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @Column(length = 5)
    private String setid;
}
