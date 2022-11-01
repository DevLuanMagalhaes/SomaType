package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoServiceStExamsGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryServiceStExamsGroup extends JpaRepository <TwoServiceStExamsGroup, Long> {

    @Query(
            value = "select o " +
                    "  from TwoServiceStExamsGroup o " +
                    " order by o.creationDate desc "
    )
    public TwoServiceStExamsGroup findServiceStExamsGroup ();
}
