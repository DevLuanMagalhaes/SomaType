package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoEmailRecipients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEmailRecipients extends JpaRepository <TwoEmailRecipients, Long>{
}
