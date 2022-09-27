package SSMA.SSMA.models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TwoAnamnesisResponseIds implements Serializable {

    private String emplid;

    private Long emplRcd;

    private String estabid;

    private Long employeeExamId;

    private String flexField;
}
