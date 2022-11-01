package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoUserAccessFunction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUserAccessFunction extends JpaRepository<TwoUserAccessFunction, Long> {

    @Query(
            value = "select o from TwoUserAccessFunction o " +
                    " where (o.accessGroupId = :accessGroupId or :accessGroupId is null)"
    )
    public TwoUserAccessFunction findAll (@Param("accessGroupId")Long accessGroupId);
}
