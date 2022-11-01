package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_GHE_PPP_QUESTIONS")
@SequenceGenerator(name="seqGhePppQuestionsId", sequenceName="TWO_GHE_PPP_QUESTIONS_S", allocationSize=1)
public class TwoGHEPPPQuestions implements TwoEntity{

    @Id
    @Column(name="GHE_PPP_QUESTIONS_ID", nullable = false)
    @GeneratedValue(generator="seqGhePppQuestionsId")
    private Long ghePppQuestionsId;

    @Column(name="GHE_ID", nullable = true)
    private Long gheId;

    //@Column(name="QUESTION_ID", nullable = false)
    //private Long questionId;
    @Column(name="ANSWER", nullable = false, length=1)
    private String answer;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="QUESTION_ID", referencedColumnName="TYPE_ID")
    private TwoType questionCollection;
}
