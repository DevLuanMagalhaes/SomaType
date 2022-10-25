//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoAnamnesisResponse;
//import SSMA.SSMA.models.TwoAnamnesisResponseIds;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryAnamnesisResponse extends JpaRepository <TwoAnamnesisResponse, TwoAnamnesisResponseIds>{
//
//    @Query(
//            value =" select o " +
//                    "   from TwoAnamnesisResponse o " +
//                    "  where o.id.emplid = :emplid " +
//                    "    and o.id.emplRcd = :emplRcd " +
//                    "    and o.id.estabid = :estabid " +
//                    "    and o.id.employeeExamId = :employeeExamId "
//    )
//    public TwoAnamnesisResponse findAll (@Param("emplid")String emplid,
//                                         @Param("emplRcd")Long emplRcd,
//                                         @Param("estabid")String estabid,
//                                         @Param("employeeExamId")Long employeeExamId);
//}
