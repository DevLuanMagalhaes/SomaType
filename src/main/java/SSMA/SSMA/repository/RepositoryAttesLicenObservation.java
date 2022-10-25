//package SSMA.SSMA.repository;
//
//import SSMA.SSMA.models.TwoAttesLicenObservation;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface RepositoryAttesLicenObservation extends JpaRepository <TwoAttesLicenObservation, Long> {
//
//    @Query(
//            value =" select o from TwoAttesLicenObservation o where o.attestationLicenseId = :attestationLicenseId ")
//
//    public TwoAttesLicenObservation findAll (@Param("attestationLicenseId")Long attestationLicenseId);
//}
