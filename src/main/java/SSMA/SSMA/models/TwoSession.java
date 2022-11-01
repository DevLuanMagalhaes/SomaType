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
@Table(name = "TWO_SESSION")
public class TwoSession implements Serializable {

    @Id
    @Column(name="SESSION_ID")
    private Long sessionId;

    @Column(name="USER_ID")
    private Long userId;
}
