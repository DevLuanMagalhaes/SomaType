package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoGenericLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryGenericLog extends JpaRepository <TwoGenericLog, Long>{
}
