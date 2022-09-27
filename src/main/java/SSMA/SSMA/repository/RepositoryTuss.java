package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoTuss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTuss extends JpaRepository <TwoTuss, String> {

    @Query(
            value = "select o from TwoTuss o " +
                    "where (o.tussCode = :ATussCode or :ATussCode is null) " +
                    "and (upper(o.tussDescr) like :ATussDescr or :ATussDescr is null) " +
                    " order by o.tussDescr"
    )
    public TwoTuss findAll (@Param("ATussCode")String ATussCode,
                            @Param("ATussDescr")String ATussDescr);
}
