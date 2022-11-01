package SSMA.SSMA.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_USER_PASSWORD")
@SequenceGenerator(name="seqUserId", sequenceName="TWO_USER_S", allocationSize=1)
public class TwoUserPassWord implements Serializable {

    @Id
    @Column(name="userId")
    Long userId;

    @Column(name="ENCRYPTED_USER_PASSWORD")
    private String encryptedUserPassword;

    @Column(name="CHANGE_PASSWORD_FIRST_ACCESS")
    private String changePasswordFirstAccess;
}
