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
@Table(name = "TWO_BENEFITS_HISTORY")
@SequenceGenerator(name="seqCatCausativeAgentId", sequenceName="TWO_CAT_CAUSATIVE_AGENT_S", allocationSize=1)
public class TwoCatCausativeAgent implements TwoEntity{

    @Id
    @Column(name="CAT_CAUSATIVE_AGENT_ID", nullable = false)
    //@GeneratedValue(generator="seqCatCausativeAgentId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long catCausativeAgentId;

    @Column(name="CAT_ID", nullable = false)
    private Long catId;

    @Column(name="CAUSATIVE_AGENT_ID", nullable = false)
    private Long causativeAgentId;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
