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
@Table(name = "TWO_PERMISSIONS_GROUP_LINES")
@SequenceGenerator(name="seqPermissionGroupLineId", sequenceName="TWO_PERMISSIONS_GROUP_LINES_S", allocationSize=1)
public class TwoPermissionsGroupLines implements TwoEntity{

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="DELETE_FLAG", nullable = false, length = 1)
    private String deleteFlag;
    @Column(name="INSERT_UPDATE_FLAG", nullable = false, length = 1)
    private String insertUpdateFlag;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
    @Column(name="PAGE_ID", nullable = false)
    private Long pageId;
    @Column(name="PERMISSION_GROUP_ID", nullable = false)
    private Long permissionGroupId;
    @Id
    @Column(name="PERMISSION_GROUP_LINE_ID", nullable = false)
    //@GeneratedValue(generator="seqHealthCenterId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long permissionGroupLineId;
    @Column(name="SELECT_FLAG", nullable = false, length = 1)
    private String selectFlag;

    @Transient
    private List< TwoPermLinSpecFeatures > permLinSpecFeaturesList;
    @Transient
    private String permLinSpecFeaturesListConcat;
}
