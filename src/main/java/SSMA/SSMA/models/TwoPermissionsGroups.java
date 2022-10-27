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
@Table(name = "TWO_PERMISSIONS_GROUPS")
public class TwoPermissionsGroups implements TwoEntity{

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="GROUP_NAME", length = 40)
    private String groupName;
    @Column(name="GROUP_STATUS", length = 1)
    private String groupStatus;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
    @Id
    @Column(name="PERMISSION_GROUP_ID", nullable = false)
    //@GeneratedValue(generator="seqHealthCenterId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long permissionGroupId;
}
