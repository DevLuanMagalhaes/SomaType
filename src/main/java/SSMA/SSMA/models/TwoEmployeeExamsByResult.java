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
public class TwoEmployeeExamsByResult implements Serializable {

    @Id
    private Long examsResultsId;
    @Column
    private String estabid;
    @Column
    private String emplid;
    @Column
    private Timestamp inclusionDate;
    @Column
    private Long examId;
}
