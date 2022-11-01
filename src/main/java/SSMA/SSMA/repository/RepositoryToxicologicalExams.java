package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoToxicologicalExams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryToxicologicalExams extends JpaRepository <TwoToxicologicalExams, Long> {

    @Query(
            value = "select t " +
                    "  from TwoToxicologicalExams t " +
                    " where t.estabid = :estabid " +
                    "   and (:emplid is not null and t.emplid = :estabid or :emplid is null ) " +
                    "   and (:emplRcd > 0 and t.emplRcd = :emplRcd or :emplRcd = 0) " +
                    "   and (:odbPreAdmId is not null and t.odbPreAdmId = :odbPreAdmId or :odbPreAdmId is null) " +
                    " order by t.examDate "
    )
    public TwoToxicologicalExams findToxicologicalExams (@Param("estabid")String estabid,
                                                         @Param("emplid")String emplid,
                                                         @Param("emplRcd")Long emplRcd,
                                                         @Param("odbPreAdmId")String odbPreAdmId);

    @Query(
            value = "select t " +
                    "  from TwoToxicologicalExams t " +
                    " where t.toxicologicalExamsId = :toxicologicalExamsId "
    )
    public TwoToxicologicalExams findToxicologicalExamsById(@Param("toxicologicalExamsId")Long toxicologicalExamsId);
}
