package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_TRANSLATE")
public class TwoTranslate implements TwoEntity{

    @Id
    @Column(name="TRANSLATE_ID", nullable = true)
    //@GeneratedValue(generator="seqTranslateId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long translateId;

    @Column(name="LANGUAGE_CODE", nullable = true, length = 3)
    private String languageCode;

    @Column(name="TABLE_NAME", nullable = true, length = 30)
    private String tableName;

    @Column(name="GENERIC_KEY", nullable = true)
    private Long genericKey;

    @Column(name="DESCR", nullable = true, length = 4000)
    private String descr;

    @Column(name="CREATED_BY", nullable = true)
    private Long createdBy;

    @Column(name="CREATION_DATE")
    @CreationTimestamp
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = true)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE")
    @UpdateTimestamp
    private Timestamp lastUpdateDate;
}
