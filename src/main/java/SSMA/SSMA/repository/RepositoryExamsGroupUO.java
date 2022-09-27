package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoExamsGroupUO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryExamsGroupUO extends JpaRepository <TwoExamsGroupUO, Long>{

    @Query(
            value ="select o " +
                    " from TwoExamsGroupUO o " +
                    "where (:estabid is null or o.estabid = :estabid) " +
                    "  and (:examId is null or o.examIdRO = :examId) "
    )
    public TwoExamsGroupUO findExamsGroupUO (@Param("estabid")String estabid,
                                             @Param("examId")Long examId);

    @Query(
            value = "select o from TwoExamsGroupUO o " +
                    "where (o.examIdRO = :examId) "
    )
    public TwoExamsGroupUO findExamsGroupUOByExamId (@Param("examId")Long examId);

    @Query(
            value = "select o from TwoExamsGroupUO o " +
                    "where (o.examGroupUOId = :examGroupUOId) "
    )
    public TwoExamsGroupUO findExamsGroupUOById (@Param("examGroupUOId")Long examGroupUOId);
}
