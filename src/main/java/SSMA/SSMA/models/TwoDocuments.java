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
@Table(name = "TWO_DOCUMENTS")
@SequenceGenerator(name="seqDocumentId", sequenceName="TWO_DOCUMENTS_S", allocationSize=1)
public class TwoDocuments implements TwoEntity{

    @Id
    @Column(name="DOCUMENT_ID", nullable = false)
    //@GeneratedValue(generator="seqDocumentId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long documentId;

    @Column(name="MODULE", nullable = false)
    private Long module;

    @Column(name="PROCESS", nullable = false)
    private Long process;

    @Column(name="SUBPROCESS", nullable = false)
    private Long subprocess;

    @Column(name="ITEM", nullable = false, length = 100)
    private String item;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
    /*
    @JoinColumn(name="MODULE", referencedColumnName="TYPE_CODE")
    private SsmaType moduleType;
     */
}
