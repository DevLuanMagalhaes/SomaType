package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TwoCidQuery implements Serializable {

    @Id
    private Long cidId;
    @Column
    private String cidCode;
    @Column
    private String cidDescr;
    @Column
    private String classCode;
    @Column
    private String classDescr;
}
