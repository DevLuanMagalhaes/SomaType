package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUser  extends JpaRepository <TwoUser, Long> {

    @Query(
            value = "select o " +
                    " from TwoUser o " +
                    " where (:userName is null or UPPER(o.userName) = UPPER(:userName))" +
                    "   and (:userId is null or o.userId = :userId)"
    )
    public TwoUser findAll (@Param("userName")String userName,
                            @Param("userId")Long userId);
}
