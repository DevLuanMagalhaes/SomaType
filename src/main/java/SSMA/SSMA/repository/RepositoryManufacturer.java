package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoManufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryManufacturer extends JpaRepository <TwoManufacturer, Long> {

    @Query(
            value ="select o " +
                    "  from TwoManufacturer o " +
                    "     , TwoAccessFunctionTmp a " +
                    " where (:manufacturerId = -1 or o.manufacturerId = :manufacturerId)  " +
                    "   and (:manufacturerName is null or o.manufacturerName like :manufacturerName)" +
                    "   and (:taxIdNumber is null or o.taxIdNumber like :taxIdNumber) "
    )
    public TwoManufacturer findAll (@Param("manufacturerId")Long manufacturerId,
                                    @Param("manufacturerName")String manufacturerName,
                                    @Param("taxIdNumber")String taxIdNumber);
}
