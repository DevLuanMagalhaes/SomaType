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
@Table(name = "TWO_ESOCIAL_GENERATE_XML")
public class TwoEsocialGenerateXml implements TwoEntity{

    @Id
    @Column(name="ESOCIAL_EXECUTION_ID")
    //@GeneratedValue(generator="seqEsocialExecutionId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long esocialExecutionId;
    @Column(name="ESOCIAL_ID")
    private Long esocialId;
    /* @Column(name="PARAMETER01")
     private String parameter01;
     @Column(name="PARAMETER02")
     private String parameter02;
     @Column(name="PARAMETER03")
     private String parameter03;
     @Column(name="PARAMETER04")
     private String parameter04;
     @Column(name="PARAMETER05")
     private String parameter05;
     @Column(name="PARAMETER06")
     private String parameter06;*/
    @Column(name="STATUS")
    private String status;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;
    @Transient
    private String createdByName;
}
