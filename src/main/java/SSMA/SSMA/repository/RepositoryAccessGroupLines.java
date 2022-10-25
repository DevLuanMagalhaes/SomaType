//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoAccessGroupLines;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryAccessGroupLines extends JpaRepository <TwoAccessGroupLines, Long>{
//
//    @Query(
//            value = "select o from TwoAccessGroupLines o " +
//                    "where o.accessGroupId = :accessGroupId "
//    )
//    public TwoAccessGroupLines findAll (@Param("accessGroupId")Long accessGroupId);
//}
