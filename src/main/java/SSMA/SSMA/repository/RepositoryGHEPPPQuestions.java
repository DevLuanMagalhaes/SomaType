package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoGHEPPPQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryGHEPPPQuestions extends JpaRepository <TwoGHEPPPQuestions, Long>{

    @Query(
            value =  "Select q from TwoGHEPPPQuestions q " +
                    "where q.gheId = :gheId " +
                    "order by q.ghePppQuestionsId "
    )
    public TwoGHEPPPQuestions findAllGHEPPPQuestions (@Param("gheId")Long gheId);
}
