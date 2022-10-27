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
@Table(name = "PS_ADDRESS_TYPE")
public class PsAddressType implements Serializable {

    @Id
    @Column(name="rownum")
    Long rowNum;

    @Column(name="ADDRTYPEESOCIAL")
    private String addrTypeEsocial;

    @Column(name="ADDRTYPEPS")
    private String addrTypePS;

    @Column(name="ADDRESS_TYPE_CODE")
    private String addressTypeCode;

    @Column(name="ADDRESS_TYPE_DESCR")
    private String addressTypeDescr;
}
