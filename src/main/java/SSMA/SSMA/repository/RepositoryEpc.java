package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoEpc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEpc extends JpaRepository <TwoEpc, Long> {

    @Query(
            value ="select o " +
                    "  from TwoEpc o " +
                    "     , TwoAccessFunctionTmp a " +
                    " where (o.epcId = :epcId or :epcId = -1) " +
                    "   and (:epcDescr is null or upper(o.epcDescr) like upper(:epcDescr)) " +
                    "   and (:estabid is null or o.estabid = :estabid)" +
                    "   and (o.estabid = a.estabid or :sysAdmin = 'Y' ) " +
                    "   and (:epcStatus is null or o.epcStatus = :epcStatus) "+
                    " order by o.epcDescr"
    )
    public TwoEpc findAllEpc (@Param("epcId")Long epcId,
                              @Param("epcDescr")String epcDescr,
                              @Param("estabid")String estabid,
                              @Param("sysAdmin")String sysAdmin,
                              @Param("epcStatus")String epcStatus);
}
