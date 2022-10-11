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
@Table(name = "TWO_CONFIG")
public class TwoConfig implements Serializable {

    @Id
    @Column(name="CONFIG_ID", nullable = false)
    private Long configId;

    @Column(name="CONFIG_NAME", length = 120)
    private String configName;

    @Column(name="CONFIG_VALUE")
    private String configValue;
}
