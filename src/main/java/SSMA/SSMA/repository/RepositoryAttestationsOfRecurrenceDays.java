package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoAttestationsOfRecurrenceDays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface RepositoryAttestationsOfRecurrenceDays extends JpaRepository <TwoAttestationsOfRecurrenceDays, Long>{

    @Query(
            value = "SELECT 1 line " +
                    "             , NVL(sum(sal.number_days),0) numberDays " +
                    "          FROM two_attestation_license sal " +
                    "             , two_type st " +
                    "         WHERE sal.diagnosis_main_cid_id = st.type_id " +
                    "           AND sal.end_removal >= to_date(:startRemoval,'dd/mm/yyyy') - 60 " +
                    "           AND sal.estabid = :estabid " +
                    "           AND sal.emplid = :emplid " +
                    "           AND sal.empl_rcd = :emplRcd " +
                    "           AND st.domain_code = 'CID_10' " +
                    "           AND substr(st.type_code,1,3) = substr(:cidCode,1,3) ", nativeQuery = true
    )
    public TwoAttestationsOfRecurrenceDays findAttestationsRecurrenceDays(@Param("startRemoval")Timestamp startRemoval,
                                                                          @Param("estabid")String estabid,
                                                                          @Param("emplid")String emplid,
                                                                          @Param("emplRcd")Long emplRcd,
                                                                          @Param("cidCode")String cidCode);
}
