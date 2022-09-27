package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_ACCESS_FUNCTION_TMP")
public class TwoAccessFunctionTmp implements Serializable {

    @Id
    @Column(name="ID")
    private Long id;
    @Column(name="ESTABID")
    private String estabid;
    @Column(name="SETID")
    private String setid;
    @Column(name="DEPTID")
    private String deptid;
    @Column(name="SYSADMIN")
    private String sysAdmin;
}
