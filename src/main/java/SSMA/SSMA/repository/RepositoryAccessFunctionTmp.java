package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoAccessFunctionTmp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAccessFunctionTmp extends JpaRepository <TwoAccessFunctionTmp, Long>{
}
