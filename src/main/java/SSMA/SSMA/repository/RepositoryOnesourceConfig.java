package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoOnesourceConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryOnesourceConfig extends JpaRepository< TwoOnesourceConfig, Long> {

}
