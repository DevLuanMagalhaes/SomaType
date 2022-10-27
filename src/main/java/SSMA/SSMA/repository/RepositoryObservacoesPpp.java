package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoObservacoesPpp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RepositoryObservacoesPpp extends JpaRepository <TwoObservacoesPpp, Long> {

    @Query(
            value = "select o from TwoObservacoesPpp o " +
                    "where o.estabid = :estabid " +
                    "  and o.emplid = :emplid " +
                    "  and o.emplRcd = :emplRcd "
    )
    public TwoObservacoesPpp findObservacoesPpp (@Param("estabid")String estabid,
                                                 @Param("emplid")String emplid,
                                                 @Param("emplRcd")Long emplRcd);
}
