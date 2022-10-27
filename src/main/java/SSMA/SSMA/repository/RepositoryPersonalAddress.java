package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoPersonalAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPersonalAddress extends JpaRepository  <TwoPersonalAddress, Long>{

    @Query(
            value = "select o " +
                    "from TwoPersonalAddress o " +
                    "where o.emplid = :emplid "
    )
    public TwoPersonalAddress findPersonalAddress (@Param("emplid")String emplid);
}
