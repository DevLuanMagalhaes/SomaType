package SSMA.SSMA.repository;

import SSMA.SSMA.models.TwoDynamicAnamnesisQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDynamicAnamnesisQuery extends JpaRepository<TwoDynamicAnamnesisQuery,Long> {


@Query(
        value =  "select tab.anamnesisId " +
                "     , tab.anamnesisName " +
                "     , tab.anamnesisNameCount " +
                "     , tab.estabid " +
                "     , tab.anamnesisItemRatedId " +
                "     , tab.itemRatedSequence " +
                "     , tab.itemRatedDescr " +
                "     , tab.itemRatedCount " +
                "     , tab.itemRatedExplan " +
                "     , tab.itemRatedCommentFlag " +
                "     , tab.anamnesisItemResponseId " +
                "     , tab.itemRespSequence " +
                "     , tab.itemRespDescr " +
                "     , tab.itemRespNotation " +
                "     , tab.itemRespCommentFlag " +
                "     , tab.itemRespSexCriterion " +
                "     , tab.itemRespCriterionAgeOf " +
                "     , tab.itemRespCriterionAgeTo " +
                "     , tab.itemRespConceptId " +
                "  from (select sa.anamnesis_id anamnesisId " +
                "             , sa.name anamnesisName " +
                "             , count(*) over (partition by sa.name) anamnesisNameCount " +
                "             , sae.estabid " +
                "             , sair.anamnesis_item_rated_id anamnesisItemRatedId " +
                "             , sair.sequence itemRatedSequence " +
                "             , sairt.descr itemRatedDescr " +
                "             , count(*) over (partition by sa.name||sairt.descr) itemRatedCount " +
                "             , sairt.explanatory_text itemRatedExplan " +
                "             , sair.comment_flag itemRatedCommentFlag " +
                "             , saires.anamnesis_item_response_id anamnesisItemResponseId " +
                "             , saires.sequence itemRespSequence " +
                "             , sairest.descr itemRespDescr " +
                "             , saires.notation itemRespNotation " +
                "             , saires.comment_flag itemRespCommentFlag " +
                "             , saires.sex_criterion itemRespSexCriterion " +
                "             , saires.criterion_age_of itemRespCriterionAgeOf " +
                "             , saires.criterion_age_to itemRespCriterionAgeTo " +
                "             , saires.concept_id itemRespConceptId " +
                "             , sae.order_seq orderSeq "+
                "          from two_anamnesis sa " +
                "             , two_anamnesis_estab sae " +
                "             , two_anamnesis_item_rated sair " +
                "             , two_anamnesis_item_rated_tl sairt " +
                "             , two_anamnesis_item_response saires " +
                "             , two_anamnesis_item_respons_tl sairest " +
                "         where sa.anamnesis_id = sae.anamnesis_id  " +
                "           and sae.anamnesis_id = sair.anamnesis_id " +
                "           and sair.anamnesis_item_rated_id = sairt.anamnesis_item_rated_id " +
                "           and sair.visible = 'Y' " +
                "           and sairt.language_code = :languageCode " +
                "           and sairt.anamnesis_item_rated_id = saires.anamnesis_item_rated_id " +
                "           and saires.anamnesis_item_response_id = sairest.anamnesis_item_response_id " +
                "           and saires.visible = 'Y' " +
                "           and sae.status = 'A' " +
                "           and sairest.language_code = :languageCode " +
                "           and sae.estabid =:estabid " +
                "           and :type = 'NEW' " +
                "           and ( (:sexCriterion is not null " +
                "           and   ((saires.sex_criterion != 'A' and saires.sex_criterion = :sexCriterion) or (saires.sex_criterion = 'A'))) " +
                "            or   (:sexCriterion is null)) " +
                "           and nvl(:age,0) between nvl(saires.criterion_age_of,0) and nvl(saires.criterion_age_to,999) " +
                "         union " +
                "        select sa.anamnesis_id anamnesisId " +
                "             , sa.name anamnesisName " +
                "             , count(*) over (partition by sa.name) anamnesisNameCount " +
                "             , sae.estabid " +
                "             , sair.anamnesis_item_rated_id anamnesisItemRatedId " +
                "             , sair.sequence itemRatedSequence " +
                "             , sairt.descr itemRatedDescr " +
                "             , count(*) over (partition by sa.name||sairt.descr) itemRatedCount " +
                "             , sairt.explanatory_text itemRatedExplan " +
                "             , sair.comment_flag itemRatedCommentFlag " +
                "             , saires.anamnesis_item_response_id anamnesisItemResponseId " +
                "             , saires.sequence itemRespSequence " +
                "             , sairest.descr itemRespDescr " +
                "             , saires.notation itemRespNotation " +
                "             , saires.comment_flag itemRespCommentFlag " +
                "             , saires.sex_criterion itemRespSexCriterion " +
                "             , saires.criterion_age_of itemRespCriterionAgeOf " +
                "             , saires.criterion_age_to itemRespCriterionAgeTo " +
                "             , saires.concept_id itemRespConceptId " +
                "             , sae.order_seq orderSeq " +
                "          from two_anamnesis sa " +
                "             , two_anamnesis_estab sae " +
                "             , two_anamnesis_item_rated sair " +
                "             , two_anamnesis_item_rated_tl sairt " +
                "             , two_anamnesis_item_response saires " +
                "             , two_anamnesis_item_respons_tl sairest " +
                "             , two_anamnesis_estab_historic saeh " +
                "         where sa.anamnesis_id = sae.anamnesis_id  " +
                "           and sae.anamnesis_id = sair.anamnesis_id " +
                "           and sair.anamnesis_item_rated_id = sairt.anamnesis_item_rated_id " +
                "           and sairt.language_code = #languageCode " +
                "           and sairt.anamnesis_item_rated_id = saires.anamnesis_item_rated_id " +
                "           and saires.anamnesis_item_response_id = sairest.anamnesis_item_response_id " +
                "           and sairest.language_code = :languageCode " +
                "           and sae.estabid = saeh.estabid " +
                "           and sa.anamnesis_id = saeh.anamnesis_id " +
                "           and saeh.employee_exam_id = :employeeExamId " +
                "           and :type = 'OLD' " +
                "           and ( (:sexCriterion is not null " +
                "           and   ((saires.sex_criterion != 'A' and saires.sex_criterion = :sexCriterion) or (saires.sex_criterion = 'A'))) " +
                "            or   (:sexCriterion is null)) ) tab " +
                "  order by tab.orderSeq, tab.anamnesisName,  tab.itemRatedSequence , tab.itemRespSequence ", nativeQuery = true
)
   public TwoDynamicAnamnesisQuery findall (@Param("languageCode")String languageCode,
                                            @Param("estabid")String estabid,
                                            @Param("sexCriterion")String sexCriterion,
                                            @Param("employeeExamId")Long employeeExamId);

}

