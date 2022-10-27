package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoOcorrenciasRetEsocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryOcorrenciasRetEsocial extends JpaRepository <TwoOcorrenciasRetEsocial, Long>{

    @Query(
            value = "Select o " +
                    "from TwoOcorrenciasRetEsocial o " +
                    "where o.soaCtrlIntEsocialId = :soaCtrlIntEsocialId " +
                    "order by o.creationDate desc "
    )
    public TwoOcorrenciasRetEsocial findOcorrenciasRetEsocial (@Param("soaCtrlIntEsocialId")Long soaCtrlIntEsocialId);
}
