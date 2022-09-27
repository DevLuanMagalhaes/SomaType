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
@Table(name = "TWO_ATTACHED_DOCUMENTS")
public class TwoAttachedDocuments implements TwoEntity{

    @Id
    @Column(name="ATTACH_ID", nullable = false)
    //@GeneratedValue(generator="seqAttachId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long attachId;

    @Column(name="DOCUMENT_ID", nullable = false)
    private Long documentId;

    @Column(name="LANGUAGE_CODE", nullable = false, length = 3)
    private String languageCode;

    @Column(name="FILE_NAME", nullable = false, length = 260)
    private String fileName;

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;

    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
}
