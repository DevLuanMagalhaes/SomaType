package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoVaccineDose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryVaccineDose extends JpaRepository <TwoVaccineDose, Long> {

    @Query(
            value ="select o from TwoVaccineDose o " +
                    "where o.vaccineId = :vaccineId " +
                    "order by o.orderSequence"
    )
    public TwoVaccineDose findVaccineDose (@Param("vaccineId")Long vaccineId);

    @Query(
            value ="Select e1ç " +
                    "from (Select d.vaccine_dose_id, d.vaccine_id, d.vaccine_dose_type_id, d.validity, d.order_sequence  " +
                    "      from TwoVaccineDose d " +
                    "          ,(Select i.vaccine_date " +
                    "            ,v.vaccine_id " +
                    "            ,v.vaccine_descr " +
                    "            ,d.vaccine_dose_type_id " +
                    "            ,(Select descr " +
                    "              from TwoTranslate l " +
                    "              where l.language_code = 'PTB' " +
                    "                and l.generic_key = d.vaccine_dose_type_id) dose " +
                    "            ,d.order_sequence " +
                    "      from TwoVaccineDose d " +
                    "          ,TwoVaccine v " +
                    "          ,TwoEmplImmunizationCtrl i " +
                    "      where d.vaccine_dose_id = i.vaccine_dose_id " +
                    "        and v.vaccine_id = i.vaccine_id " +
                    "        and i.estabid = :estabid " +
                    "        and i.emplid = :emplid " +
                    "        and i.empl_rcd = :emplRcd " +
                    "        and i.vaccine_id = :vaccineId " +
                    "        and i.vaccine_date = (Select max(i2.vaccine_date) " +
                    "                              from TwoEmplImmunizationCtrl i2 " +
                    "                              where i2.estabid = i.estabid " +
                    "                                and i2.emplid = i.emplid " +
                    "                                and i2.empl_rcd = i.empl_rcd " +
                    "                                and i2.vaccine_id = i.vaccine_id)) e " +
                    "      where d.vaccine_id = e.vaccine_id " +
                    "        and d.order_sequence > e.order_sequence " +
                    "      order by d.order_sequence) e1 " +
                    "where rownum = 1",nativeQuery = true
    )
    public TwoVaccineDose findEmployeeNextVaccineDose (@Param("estabid")String estabid,
                                                       @Param("emplid")String emplid,
                                                       @Param("emplRcd")Long emplRcd,
                                                       @Param("vaccineId")Long vaccineId);
}
