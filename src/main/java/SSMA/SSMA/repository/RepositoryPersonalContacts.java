package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoPersonalContacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPersonalContacts extends JpaRepository <TwoPersonalContacts, Long >{

    @Query(
            value = "select o " +
                    "from TwoPersonalContacts o " +
                    "where o.emplid = :emplid "
    )
    public TwoPersonalContacts findPersonalContacts (@Param("emplid")String emplid);
}
