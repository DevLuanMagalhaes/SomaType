//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoExamsResults;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryExamsResults extends JpaRepository <TwoExamsResults, Long> {
//
//    @Query(
//            value ="Select r " +
//                    "  from TwoExamsResults r " +
//                    "where r.complementaryExamsId = :complementaryExamsId " +
//                    "order by r.examsResultsId "
//    )
//    public TwoExamsResults findAllExamsResults (@Param("complementaryExamsId")Long complementaryExamsId);
//
//    @Query(
//            value ="Select r " +
//                    "  from TwoExamsResults r " +
//                    "where r.examsResultsId = :examsResultsId "
//    )
//    public TwoExamsResults findAllExamsResultsById (@Param("examsResultsId")Long examsResultsId);
//}
//
