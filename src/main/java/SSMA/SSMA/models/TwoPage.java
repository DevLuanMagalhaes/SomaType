package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_PAGE")
public class TwoPage  implements TwoEntity{

    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="IMAGE_NAME", length = 100)
    private String imageName;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
    @Column(name="PAGE_CODE", length = 40)
    private String pageCode;
    @Id
    @Column(name="PAGE_ID", nullable = false)
    private Long pageId;
    @Column(name="PAGE_LINK", length = 400)
    private String pageLink;
    @Column(name="PAGE_NAME", length = 40)
    private String pageName;
}
