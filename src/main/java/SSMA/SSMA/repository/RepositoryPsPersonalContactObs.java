package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoPsPersonalContactObs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPsPersonalContactObs extends JpaRepository <TwoPsPersonalContactObs, String> {

    @Query(
            value = "select o " +
                    "from TwoPsPersonalContactObs o " +
                    "where o.pk.emplid = :emplid" +
                    "  and o.pk.contactType = :contactType" +
                    "  and o.pk.recordType = :recordType"
    )
    public TwoPsPersonalContactObs findSsmaPsPersonalContactObs (@Param("emplid")String emplid,
                                                                 @Param("contactType")String contactType,
                                                                 @Param("recordType")String recordType);
    
}
