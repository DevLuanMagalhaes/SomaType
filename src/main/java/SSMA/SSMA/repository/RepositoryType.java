package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryType extends JpaRepository <TwoType, Long> {

    @Query(
            value ="select t from TwoType t " +
                    "where (:typeId is null or  t.typeId = :typeId )" +
                    "  and (:typeCode is null or t.typeCode like :typeCode)" +
                    "  and (:domainCode is null or t.domainCode like :domainCode)" +
                    "  and (:flexValue01 is null or t.flexValue01 like :flexValue01)" +
                    "  and (:flexValue02 is null or t.flexValue02 like :flexValue02)" +
                    "order by t.typeCode, t.domainCode "
    )
    public List<TwoType> findAllTypes (@Param("typeId")Long typeId,
                                       @Param("typeCode")String typeCode,
                                       @Param("domainCode")String domainCode,
                                       @Param("flexValue01")String flexValue01,
                                       @Param("flexValue02")String flexValue02);

    @Query(
            value ="select o " +
                    " from TwoType o " +
                    " where o.domainCode = :domainCode " +
                    "  and (:flexValue01 is null or o.flexValue01 like :flexValue01)" +
                    "  and (:flexValue02 is null or o.flexValue02 like :flexValue02)"
    )
    public List<TwoType> findByDomain (@Param("domainCode")String domainCode,
                                 @Param("flexValue01")String flexValue01,
                                 @Param("flexValue02")String flexValue02);

    @Query (
            value ="select t from TwoType t " +
                    "where (t.domainCode = :domainCode) " +
                    "  and (:typeCode is null or t.typeCode like :typeCode) " +
                    "  and (:flexValue01 is null or t.flexValue01 = :flexValue01) " +
                    "  and (:flexValue02 is null or t.flexValue02 = :flexValue02) " +
                    "order by t.typeCode, t.domainCode "
    )

    public List<TwoType> findByFlexValue (@Param("domainCode")String domainCode,
                                    @Param("typeCode")String typeCode,
                                    @Param("flexValue01")String flexValue01,
                                    @Param("flexValue02")String flexValue02);



}
