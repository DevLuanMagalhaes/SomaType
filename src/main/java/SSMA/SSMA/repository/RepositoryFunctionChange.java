package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoFunctionChange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface RepositoryFunctionChange extends JpaRepository  <TwoFunctionChange, Long>{

    @Query(
            value = "Select f from TwoFunctionChange f " +
                    "where f.estabid = :estabid " +
                    "  and f.emplid = :emplid " +
                    "order by f.functionChangeDate, f.functionChangeSeq "
    )
    public TwoFunctionChange findAllFunctionChange (@Param("estabid")String estabid,
                                                    @Param("emplid")String emplid);

    @Query(
            value = "Select f from TwoFunctionChange f " +
                    "where f.estabid = :estabid " +
                    "  and f.emplid = :emplid " +
                    "  and f.functionChangeDate = (Select max(f2.functionChangeDate) " +
                    "                              from TwoFunctionChange f2 "+
                    "                              where f2.estabid = f.estabid "+
                    "                                and f2.emplid = f.emplid) "+
                    "  and f.functionChangeSeq = (Select max(f3.functionChangeSeq) " +
                    "                             from TwoFunctionChange f3 "+
                    "                             where f3.estabid = f.estabid "+
                    "                               and f3.emplid = f.emplid "+
                    "                               and f3.functionChangeDate = f.functionChangeDate) "
    )
    public TwoFunctionChange findMaxFunctionChange (@Param("estabid")String estabid,
                                                    @Param("emplid")String emplid);

    @Query(
            value = "Select f " +
                    "from TwoFunctionChange f " +
                    "where f.functionChangeId = (Select max(m.functionChangeId) " +
                    "                            from TwoFunctionChange m " +
                    "                            where m.estabid = :estabid " +
                    "                              and m.emplid = :emplid " +
                    "                              and m.competenceExpectedDate = :competenceExpectedDate) "
    )
    public TwoFunctionChange findFunctionChangeByCompetenceDate (@Param("estabid")String estabid,
                                                                 @Param("emplid")String emplid,
                                                                 @Param("competenceExpectedDate")Timestamp competenceExpectedDate);
}
