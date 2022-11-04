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
public class TwoCountUserPermissionGroup implements Serializable {

    @Id
    @Column(name="COUNT_USER_PERM_GROUP")
    private String countUserPermGroup;
}
