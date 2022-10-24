package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoEsocialEventCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEsocialEventCatalog extends JpaRepository <TwoEsocialEventCatalog, Long>  {

    @Query(
            value ="select o " +
                    "  from TwoEsocialEventCatalog o " +
                    " where o.messageOriginCollection.typeId = :messageOriginId " +
                    " order by o.messageCode"
    )
    public TwoEsocialEventCatalog findAllEsocialEventCatalog (@Param("messageOriginId")Long messageOriginId);

    @Query(
            value ="select o " +
                    "  from TwoEsocialEventCatalog o " +
                    " where upper(o.messageCode) = upper(:messageCode) " +
                    " order by o.messageCode "
    )
    public TwoEsocialEventCatalog findEsocialEventCatalogByCode (@Param("messageCode")String messageCode);
}
