package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoPermissionsGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPermissionsGroups extends JpaRepository <TwoPermissionsGroups, Long> {

    @Query(
            value = "select o " +
                    "from TwoPermissionsGroups o " +
                    "where o.permissionGroupId like :permissionGroupId" +
                    "  and upper(o.groupName) like upper(:groupName) " +
                    "order by o.groupName"
    )
    public TwoPermissionsGroups findAllPermissionGroup (@Param("permissionGroupId")Long permissionGroupId,
                                                        @Param("groupName")String groupName);
}
