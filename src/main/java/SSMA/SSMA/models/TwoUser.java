package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_USER")
@SequenceGenerator(name="seqUserId", sequenceName="TWO_USER_S", allocationSize=1)
public class TwoUser implements TwoEntity{

    @Id @Column(name="USER_ID", nullable = false)
    //@GeneratedValue(generator="seqHealthCenterId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    @Column(name="CREATED_BY", length = 120)
    private Long createdBy;
    @Column(name="CREATION_DATE")
    private Timestamp creationDate;
    @Column(name="LANGUAGE_CODE", length = 3)
    private String languageCode;
    @Column(name="LAST_UPDATED_BY", length = 120)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;
    @Column(name="USER_NAME")
    private String userName;
    @Column(name="EMPLID")
    private String emplid;
    @Column(name = "BLOCKED")
    private String blocked;
    @Column(name = "AUTHENTICATE")
    private String authenticate;
    @Column(name = "CHANGE_PASSWORD_FIRST_ACCESS")
    private String changePasswordFirstAccess;
    @Column(name = "EXPIRATION_DATE")
    private Timestamp expirationDate;
    @Column(name = "LAST_ACCESS_DATE")
    private Timestamp lastAccessDate;
    @Transient
    private String encryptedUserPassword;
    @Column(name = "SYS_ADMIN")
    private String sysAdmin;


    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinTable(name = "TWO_USER_ACCESS_FUNCTION",
            joinColumns = { @JoinColumn(name="USER_ID", referencedColumnName="USER_ID")},
            inverseJoinColumns = {@JoinColumn(name="ACCESS_GROUP_ID", referencedColumnName="ACCESS_GROUP_ID")})
    private List<TwoAccessGroup> userAccessFunctionList;

    @OneToOne(fetch= FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinColumn(name="PERMISSION_GROUP_ID", referencedColumnName="PERMISSION_GROUP_ID")
    private TwoPermissionsGroups userPermissionGroup;
}
