//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoCatWitness;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryCatWitness extends JpaRepository <TwoCatWitness, Long> {
//
//    @Query(
//            value ="select o from TwoCatWitness o " +
//                    "where (o.catWitnessId = :catWitnessId or :catWitnessId is null) "
//    )
//    public TwoCatWitness findCatWitness (@Param("catWitnessId")Long catWitnessId);
//}
