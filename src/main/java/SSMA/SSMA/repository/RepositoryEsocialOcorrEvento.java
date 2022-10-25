//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoEsocialOcorrEvento;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryEsocialOcorrEvento extends JpaRepository <TwoEsocialOcorrEvento, Long>{
//
//    @Query(
//            value ="select o " +
//                    "  from TwoEsocialOcorrEvento o " +
//                    " where o.esocialEventCatalogId = :esocialEventCatalogId "
//    )
//    public TwoEsocialOcorrEvento findAllEsocialOcorrEvento (@Param("esocialEventCatalogId")Long esocialEventCatalogId);
//}
