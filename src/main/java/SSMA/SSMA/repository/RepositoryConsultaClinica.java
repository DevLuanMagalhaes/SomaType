package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoConsultaClinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryConsultaClinica extends JpaRepository <TwoConsultaClinica, Long>{

    @Query(
            value ="Select c from TwoConsultaClinica c " +
                    "where c.estabid = :estabid " +
                    "  and (:emplid is null or c.emplid = :emplid) " +
                    "order by c.emplid, c.emplRcd, c.dataAvaliacao, c.consultaClinicaSeq"
    )
    public TwoConsultaClinica findAllConsultaClinica (@Param("estabid")String estabid,
                                                      @Param("emplid")String emplid);
}


