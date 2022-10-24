package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PS_ESTAB")
public class PsEstabQuery implements Serializable {

    @Id
    @Column(name="ROWNUM", length=3)
    private String rownum;

    @Column(name="UO", length=12)
    private String UO;
    @Column(name="UO_DESCR", length=30)
    private String UODescr;
    @Transient
    private String businessUnit;
    @Column(name="COUNTRY", length=3)
    private String country;
    @Column(name="COMPANY", length=3)
    private String company;
    @Transient
    private String companyDescr;
    @Column
    private String address1;
    @Column
    private String address2;
    @Column
    private String address3;
    @Column
    private String address4;
    @Column
    private String city;
    @Column
    private String num1;
    @Column
    private String state;
    @Column
    private String postal;
    @Column(name="ESTAB_ID_BRA")
    private String estabIdBra;
    @Column(name="ESTAB_ID_BRA_COMPANY")
    private String estabIdBraCompany;
    @Column
    private String companyName;
}
