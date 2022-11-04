package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoCountUserPermissionGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCountUserPermissionGroup
extends JpaRepository <TwoCountUserPermissionGroup, String >{

    @Query(
            value = "Select * " +
                    "from (Select count(1) COUNT_USER_PERM_GROUP" +
                    "      from two_user " +
                    "      where permission_group_id = :permissionGroupId)",nativeQuery = true
    )
    public TwoCountUserPermissionGroup countUserPermGroup (@Param("permissionGroupId")Long permissionGroupId);
}
