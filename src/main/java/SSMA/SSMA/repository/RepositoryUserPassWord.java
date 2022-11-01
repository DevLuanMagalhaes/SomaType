package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoUserPassWord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepositoryUserPassWord extends JpaRepository <TwoUserPassWord, Long> {

    @Query(
            value = "select o from TwoUserPassWord o " +
                    " where o.userId = :userId ", nativeQuery = true
    )
    public      Optional<TwoUserPassWord> findById (@Param("userId")Long userId);
}
