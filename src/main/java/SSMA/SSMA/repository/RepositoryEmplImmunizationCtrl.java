//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoEmplImmunizationCtrl;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//public interface RepositoryEmplImmunizationCtrl extends JpaRepository <TwoEmplImmunizationCtrl, Long> {
//
//
//    @Query(
//            value ="Select i from TwoEmplImmunizationCtrl i " +
//                    "where i.estabid = :estabid " +
//                    "  and i.emplid = :emplid " +
//                    "  and i.emplRcd = :emplRcd " +
//                    "order by i.vaccineDate "
//    )
//    public TwoEmplImmunizationCtrl findEmplImmunizationCtrl (@Param("estabid")String estabid,
//                                                             @Param("emplid")String emplid,
//                                                             @Param("emplRcd")Long emplRcd);
//
//
//
//    @Query(
//            value = "Select i " +
//                    "from TwoEmplImmunizationCtrl i " +
//                    "where i.estabid = :estabid " +
//                    "  and i.emplid = :emplid  " +
//                    "  and i.emplRcd = :emplRcd "+
//                    "  and i.vaccineId = :vaccineId "+
//                    "  and i.vaccineDate = (Select max(i2.vaccineDate) " +
//                    "                        from TwoEmplImmunizationCtrl i2 "+
//                    "                        where i2.estabid = i.estabid " +
//                    "                          and i2.emplid = i.emplid " +
//                    "                          and i2.emplRcd = i.emplRcd "+
//                    "                          and i2.vaccine_id = i.vaccine_id) " +
//                    "  and rownum = 1 "    ,nativeQuery = true
//   )
//    public TwoEmplImmunizationCtrl findMaxVaccineDate (@Param("estabid")String estabid,
//                                                       @Param("emplid")String emplid,
//                                                       @Param("emplRcd")Long emplRcd,
//                                                      @Param("vaccineId")Long vaccineId);
//}
