package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TwoAttestationLicensePrevious implements Serializable {

    @Id
    @Column
    private Long attestationLicenseId;
    @Column
    private String cid;
    @Column
    private Timestamp startRemoval;
    @Column
    private Long numberDays;
    @Column
    private Timestamp endRemoval;
    @Column
    private Timestamp creationDate;
}
