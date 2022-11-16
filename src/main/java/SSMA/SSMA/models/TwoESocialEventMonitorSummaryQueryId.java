package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class TwoESocialEventMonitorSummaryQueryId implements Serializable {

   // @Id
    @Column(name="COMPANY")
    private String company;
  //  @Id
    @Column(name="EVENT_NAME")
    private String eventName;
}
