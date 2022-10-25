//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoGHE;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.sql.Timestamp;
//
//@Repository
//public interface RepositoryGHE extends JpaRepository <TwoGHE, Long>{
//
//    @Query(
//            value = "Select t " +
//                    " from TwoGHE t " +
//                    "where ((:gheCode is not null and t.gheCode like :gheCode) or  (:gheCode is null)) " +
//                    "  and ((:gheName is not null and t.gheName  like :gheName ) or  (:gheName  is null)) " +
//                    "  and ((:estabid is not null and t.estabid = :estabid) or (:estabid is null)) "+
//                    "  and ((:status is not null and t.status like :status) or (:status is null)) "+
//                    "  and ((:gheId = 0) or (t.gheId = :gheId)) "+
//                    "order by t.gheCode, t.effectiveDate, t.gheId"
//    )
//    public TwoGHE findAllGHE (@Param("gheCode")Long gheCode,
//                              @Param("gheName")String gheName,
//                              @Param("estabid")String estabid,
//                              @Param("status")String status,
//                              @Param("gheId")Long gheId);
//
//    @Query(
//            value = "Select max(t.effectiveDate) " +
//                    "from TwoGHE t " +
//                    "where t.gheCode = :gheCode "
//    )
//    public TwoGHE findMaxEffectiveDateGHE (@Param("gheCode")Long gheCode);
//
//    @Query(
//            value ="Select p " +
//                    "from TwoGHE p " +
//                    "where p.gheCode = :gheCode " +
//                    "  and p.effectiveDate = (Select max(m.effectiveDate) " +
//                    "                         from TwoGHE m" +
//                    "                         where m.gheCode = :gheCode " +
//                    "                           and m.effectiveDate < :effectiveDate ) "
//    )
//    public TwoGHE findPreviousGHE (@Param("gheCode")Long gheCode,
//                                   @Param("effectiveDate") Timestamp effectiveDate);
//
//    @Query(
//            value = "Select t " +
//                    " from TwoGHE t " +
//                    "where ((:estabid is not null and t.estabid = :estabid) or (:estabid is null)) "+
//                    "  and ((:status is not null and t.status like :status) or (:status is null)) "+
//                    "order by t.gheCode, t.effectiveDate, t.gheId"
//    )
//    public TwoGHE findIdsGHEByEstabidAndStatus (@Param("estabid")String estabid,
//                                                @Param("status")String status);
//
//    @Query(
//            value = "Select p " +
//                    "from TwoGHE p " +
//                    "where p.gheId = :gheId "
//    )
//    public TwoGHE findGHEById (@Param("gheId")Long gheId);
//}
