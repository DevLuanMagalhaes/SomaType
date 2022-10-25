package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoHealthProfessionEstab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryHealthProfessionEstab extends JpaRepository <TwoHealthProfessionEstab, Long>{
}
