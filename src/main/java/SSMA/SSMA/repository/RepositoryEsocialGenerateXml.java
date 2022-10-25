//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoEsocialGenerateXml;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryEsocialGenerateXml extends JpaRepository <TwoEsocialGenerateXml, Long>{
//
//    @Query(
//            value ="select o " +
//                    "  from TwoEsocialGenerateXml o " +
//                    " where 1=1  " +
//                    " and o.status = 'PROCESSANDO' " +
//                    " and  o.createdBy = :userId "
//    )
//    public TwoEsocialGenerateXml findAllInProcess (@Param("userId")Long userId);
//}
