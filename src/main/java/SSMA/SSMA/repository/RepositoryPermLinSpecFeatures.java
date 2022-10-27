package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoPermLinSpecFeatures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPermLinSpecFeatures extends JpaRepository <TwoPermLinSpecFeatures, Long>{

    @Query(
            value = " select distinct f " +
                    " from TwoPermLinSpecFeatures f " +
                    "    ,TwoPermissionsGroupLines l " +
                    "    ,TwoUser u " +
                    "  where f.permissionGroupLineId = l.permissionGroupLineId " +
                    "  and l.permissionGroupId = u.userPermissionGroup.permissionGroupId " +
                    "  and (u.userId = :userId or :userId = 0) " +
                    "  and l.pageId = :pageId " +
                    "  and (f.specificFeaturesCollection.typeId = :specificFeatureTypeid or :specificFeatureTypeid = 0)"
    )
    public TwoPermLinSpecFeatures findPermLinSpecFeatures (@Param("userId")Long userId,
                                                           @Param("pageId")Long pageId,
                                                           @Param("specificFeatureTypeid")Long specificFeatureTypeid);

    @Query(
            value = "select distinct f " +
                    "from TwoPermLinSpecFeatures f " +
                    "where f.permissionGroupLineId = :permissionGroupLineId "
    )
    public TwoPermLinSpecFeatures findPermLinSpecFeaturesByGroupLine (@Param("permissionGroupLineId")Long permissionGroupLineId);
}
