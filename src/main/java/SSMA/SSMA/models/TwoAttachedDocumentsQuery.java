package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TwoAttachedDocumentsQuery implements Serializable {


    @Id
    @Column(name="ATTACH_ID", nullable = false)
    private Long attachId;

    @Column(name="DOCUMENT_ID", nullable = false)
    private Long documentId;

    @Column(name="LANGUAGE_CODE", length=3)
    private String languageCode;

    @Column(name="FILE_NAME", length=3)
    private String fileName;
}
