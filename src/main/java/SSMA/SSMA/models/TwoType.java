package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Map;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_TYPE")
@SequenceGenerator(name="seqTypeId", sequenceName="TWO_TYPE_S", allocationSize=1)
public class TwoType implements TwoEntity{

    @Id
    @Column(name="TYPE_ID", nullable = false)
    //@GeneratedValue(generator="seqTypeId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long typeId;

    @Column(name="TYPE_CODE", nullable = false, length = 40)
    private String typeCode;

    @Column(name="DOMAIN_CODE", nullable = false, length = 30)
    private String domainCode;

    @Column(name="FLEX_VALUE_01", nullable = true, length = 200)
    private String flexValue01;

    @Column(name="FLEX_VALUE_02", nullable = true, length = 200)
    private String flexValue02;

    //@Column(name = "IS_NEW", nullable = false)
    @Transient
    private Boolean isNew;

    //@Column(name = "UPDATEd" , nullable = false)
    @Transient
    private Boolean updated;

    @Column(name="CREATED_BY", nullable = true)
    private Long createdBy;

    @Column(name="CREATION_DATE")
    @CreationTimestamp
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = true)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE")
    @UpdateTimestamp()
    private Timestamp lastUpdateDate;

    @Column(name="TABLE_NAME", nullable = true, length = 30)
    private String tableName;

    @OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="TABLE_NAME", referencedColumnName = "TABLE_NAME")
//    private List<TwoTranslate> translate;
    @MapKey(name="languageCode")
    private Map<String, TwoTranslate> translate;


//    @Transient
//    private List<TwoTranslate> translate;


}
