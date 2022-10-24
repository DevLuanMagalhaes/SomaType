package SSMA.SSMA.models;

import java.io.Serializable;
import java.sql.Timestamp;

public interface TwoEntity extends Serializable {

    public Long getCreatedBy();

    public void setCreatedBy(Long createdBy);

    public Timestamp getCreationDate();

    public void setCreationDate(Timestamp creationDate);

    public Long getLastUpdatedBy();

    public void setLastUpdatedBy(Long lastUpdatedBy);

    public Timestamp getLastUpdateDate();

    public void setLastUpdateDate(Timestamp lastUpdateDate);

}
