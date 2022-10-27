package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_PERSONAL_CONTACTS_OBS")
public class TwoPsPersonalContactObs implements TwoEntity{

    @EmbeddedId
    private TwoPsPersonalContactObsPk pk;
    @Column(name="COMMENTS", nullable = false)
    private String comments;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY")
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;
}
