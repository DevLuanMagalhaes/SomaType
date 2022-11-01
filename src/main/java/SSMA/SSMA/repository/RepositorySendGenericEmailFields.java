package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoSendGenericEmail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorySendGenericEmailFields extends JpaRepository<TwoSendGenericEmail, Long> {
}
