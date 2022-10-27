package SSMA.SSMA.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TwoPsPersonalContactObsPk implements Serializable {

    @Column(name="EMPLID")
    private String emplid;

    @Column(name="CONTACT_TYPE")
    private String contactType;

    @Column(name="RECORD_TYPE")
    private String recordType;
}
