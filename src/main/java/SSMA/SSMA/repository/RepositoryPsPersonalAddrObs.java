package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoPsPersonalAddrObs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPsPersonalAddrObs extends JpaRepository <TwoPsPersonalAddrObs, String> {

    @Query(
            value = "select o " +
                    "from TwoPsPersonalAddrObs o " +
                    "where o.emplid = :emplid "
    )
    public TwoPsPersonalAddrObs findSsmaPsPersonalAddrObs (@Param("emplid") String emplid);
}
