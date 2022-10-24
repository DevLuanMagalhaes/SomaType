package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PS_PERSON_NAME_QUERY")
public class PsPersonNameQuery implements Serializable {

    @Id
    private Long rownum;
    @Column
    private String emplid;
    @Column
    private String name;
    @Column
    private String motherName;
    @Column
    private String emailid;
    @Column
    private String emplRcd;
    @Column
    private String company;
    @Column
    private String estabid;
    @Column
    private Timestamp hireDt;
    @Column
    private Timestamp terminationDt;
    @Column
    private Timestamp lastHireDt;
    @Column
    private String sex;
    @Column
    private String maritalStatus;
    @Column
    private Timestamp birthdate;
    @Column
    private Long age;
    @Column
    private String hrStatus;
    @Column
    private String hrStatusDescr;
    @Column
    private String jobcode;
    @Transient
    private String jobDescr;
    @Column
    private String location;
    @Transient
    private String locationDescr;
    @Column
    private String cpf;
    @Column
    private String status;
    @Column
    private String pis;
    @Column
    private String rg;
    @Column
    private Timestamp dataAdmissaoUo;
    @Column
    private String cbo;
    @Column
    private String centroCustoDescr;
    @Column
    private String uoContabil;
    @Column
    private String regEsocialBra;
}
