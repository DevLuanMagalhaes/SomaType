//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoCat;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryCat extends JpaRepository <TwoCat, Long>{
//
//    @Query(
//            value =" select o " +
//                    "  from TwoCat o " +
//                    "     , TwoAccessFunctionTmp a " +
//                    " where o.estabid = :estabid " +
//                    "   and (o.emplid = :emplid or :emplid is null) " +
//                    "   and (o.emplRcd = :emplRcd or :emplRcd = -1)" +
//                    "   and (o.estabid = a.estabid or :sysAdmin = 'Y' ) " +
//                    " order by o.creationDate desc "
//    )
//    public TwoCat findCat (@Param("estabid")String estabid,
//                           @Param("emplid")String emplid,
//                           @Param("emplRcd")Long emplRcd,
//                           @Param("sysAdmin")String sysAdmin);
//
//
//
//    @Query(
//            value ="select o " +
//                    "  from TwoCat o " +
//                    " where o.catId = :catId "
//    )
//    public TwoCat findCatById (@Param("catId")Long catId);
//
//    @Query(
//            value ="Select c1 " +
//                    "from TwoCat c1 " +
//                    "where c1.estabid = :estabid " +
//                    "  and c1.emplid = :emplid " +
//                    "  and c1.emplRcd = :emplRcd" +
//                    "  and (:catId = 0 or (:catId != 0 and c1.catId != :catId))" +
//                    "  and c1.catReceivedDate = (Select max(c2.catReceivedDate  ) " +
//                    "                              from TwoCat c2 " +
//                    "                              where c1.estabid = c2.estabid " +
//                    "                                and c1.emplid = c2.emplid " +
//                    "                                and c1.emplRcd = c2.emplRcd " +
//                    "                                and (:catId = 0 or (:catId != 0 and c2.catId != :catId))) " +
//                    "  and rownum = 1"
//    )
//    public TwoCat findPreviousCat (@Param("estabid")String estabid,
//                                   @Param("emplid")String emplid,
//                                   @Param("emplRcd")Long emplRcd,
//                                   @Param("catId")Long catId
//    );
//}
