//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoAudiometer;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryAudiometer extends JpaRepository <TwoAudiometer, Long>{
//
//    @Query(
//            value = "select t from TwoAudiometer t " +
//                    "where (t.code like :code or :code is null) " +
//                    "  and (t.descr like :descr or :descr is null) " +
//                    "order by t.code "
//    )
//    public TwoAudiometer findAllAudiometers (@Param("code")String code,
//                                             @Param("descr")String descr);
//
//}
//
