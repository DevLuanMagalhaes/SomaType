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
@Table(name = "TWO_ACCESS_GROUP")
public class TwoAccessGroupLines implements TwoEntity{

    @Id @Column(name="ACCESS_GROUP_LINE_ID", nullable = false)
    //@GeneratedValue(generator="setAccessGroupLinesId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accessGroupLineId;
    @Column(name="ACCESS_GROUP_ID")
    private Long accessGroupId;
    @Column(name="CREATED_BY")
    private Long createdBy;
    @Column(name="CREATION_DATE")
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY")
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="ACCESS_FUNCTION_ID", referencedColumnName="ACCESS_FUNCTION_ID")
    private TwoAccessFunction accessFunction;
}
