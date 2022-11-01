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
@SequenceGenerator(name="seqAccessGroupId", sequenceName="TWO_ACCESS_GROUP_S", allocationSize=1)
public class TwoAccessGroup implements TwoEntity{

    @Id
    @Column(name="ACCESS_GROUP_ID", nullable = false)
    //@GeneratedValue(generator="seqAccessGroupId")
    private Long accessGroupId;

    @Column(name="NAME")
    private String name;

    @Column(name="STATUS")
    private String status;

    @Column(name="CREATED_BY")
    private Long createdBy;

    @Column(name="CREATION_DATE")
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY")
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;
}
