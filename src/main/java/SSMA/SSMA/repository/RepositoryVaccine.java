package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoVaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryVaccine extends JpaRepository<TwoVaccine, Long> {

    @Query(
            value ="Select o from TwoVaccine o " +
                    "where ((:vaccineId > 0 and o.vaccineId = :vaccineId) or :vaccineId = 0)" +
                    "  and ((:vaccineDescr is not null and upper(o.vaccineDescr) like upper(:vaccineDescr)) or :vaccineDescr is null)"
    )
    public TwoVaccine findVaccine (@Param("vaccineId")Long vaccineId,
                                   @Param("vaccineDescr")String vaccineDescr);
}
