//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoCatLesionNature;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryCatLesionNature extends JpaRepository<TwoCatLesionNature, Long> {
//
//    @Query(
//            value ="select o from TwoCatLesionNature o " +
//                    "where (o.catId = :catId or :catId is null) "
//    )
//    public TwoCatLesionNature findCatLesionNature (@Param("catId")Long catId);
//}
