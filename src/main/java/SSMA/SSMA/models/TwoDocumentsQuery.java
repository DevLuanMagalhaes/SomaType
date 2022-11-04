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
public class TwoDocumentsQuery implements Serializable {

    @Id
    @Column(name="DOCUMENT_ID", nullable = false)
    private Long documentId;

    @Column(name="MODULE", nullable = false)
    private Long module;

    @Column(name="MODULE_DESCR", length=4000)
    private String moduleDescr;

    @Column(name="PROCESS", nullable = false)
    private Long process;

    @Column(name="PROCESS_DESCR", length=4000)
    private String processDescr;

    @Column(name="SUBPROCESS", nullable = false)
    private Long subprocess;

    @Column(name="SUBPROCESS_DESCR", length=4000)
    private String subprocessDescr;

    @Column(name="ITEM", length=4000)
    private String item;
}
