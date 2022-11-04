package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoCheckUoEsocialStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCheckUoEsocialStatus extends JpaRepository <TwoCheckUoEsocialStatus, String >{

    @Query(
            value = "SELECT DISTINCT ESOCIAL_FLAG, \n" +
                    "       ESOCIAL_DATE \n" +
                    "  FROM TWO_ACCESS_FUNCTION\n" +
                    " WHERE access_function_uo = :UO ", nativeQuery = true
    )
    public TwoCheckUoEsocialStatus CheckEsocialUo (@Param("UO")String UO);
}
