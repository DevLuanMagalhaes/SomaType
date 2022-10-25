package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoInconsistencyControl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryInconsistencyControl extends JpaRepository <TwoInconsistencyControl, Long> {

    @Query(
            value = "Select ic.* " +
                    "from TwoInconsistencyControl ic " +
                    "    ,ssma_access_function af " +
                    "    ,ssma_access_group_lines gl " +
                    "    ,ssma_user_access_function ua " +
                    "where ic.estabid = af.access_function_uo " +
                    "  and af.access_function_id = gl.access_function_id " +
                    "  and gl.access_group_id = ua.access_group_id " +
                    "  and ua.user_id = :userId ",nativeQuery = true
    )
    public TwoInconsistencyControl findInconsistencyControl (@Param("userId")Long userId);
}
