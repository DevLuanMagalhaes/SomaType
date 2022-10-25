//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoAccessGroup;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryAccessGroup extends JpaRepository <TwoAccessGroup, Long>{
//
//    @Query(
//            value = "select o from TwoAccessGroup o where (:groupName is null or UPPER(o.name) like UPPER(:groupName)) "
//    )
//
//    public TwoAccessGroup findAll (@Param("groupName")String groupName);
//}
