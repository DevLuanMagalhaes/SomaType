//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoConsClinExamesProp;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryConsClinExamesProp extends JpaRepository <TwoConsClinExamesProp, Long>{
//
//    @Query(
//            value ="Select c from TwoConsClinExamesProp c " +
//                    "where c.consClinExamesPropId = :consClinExamesPropId "
//    )
//    public TwoConsClinExamesProp findAllConsClinExamesProp (@Param("consClinExamesPropId")Long consClinExamesPropId);
//}
