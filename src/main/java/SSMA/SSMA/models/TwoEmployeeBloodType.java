package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TwoEmployeeBloodType implements Serializable {

    @Id
    @Column(name="BLOOD_TYPE_ID", nullable = false)
    private Long bloodTypeId;
    @Transient
    private TwoType bloodTypeCollection;
}
