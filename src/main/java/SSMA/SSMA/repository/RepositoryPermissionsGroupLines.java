package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoPermissionsGroupLines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPermissionsGroupLines extends JpaRepository <TwoPermissionsGroupLines, Long> {

    @Query (
            value = "select o from TwoPermissionsGroupLines o " +
                    "where o.permissionGroupId = :permissionGroupId " +
                    "order by o.permissionGroupLineId"
    )
    public TwoPermissionsGroupLines findAllPermGroupLines (@Param("permissionGroupId")Long permissionGroupId);
}
