package SSMA.SSMA.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TWO_PERM_LIN_SPEC_FEATURES")
public class TwoPermLinSpecFeatures implements TwoEntity{

    @Id
    @Column(name="PERM_LIN_SPEC_FEATURES_ID", nullable = false)
    //@GeneratedValue(generator="seqHealthCenterId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long permLinSpecFeaturesId;
    @Column(name="PERMISSION_GROUP_LINE_ID", nullable = false)
    private Long permissionGroupLineId;
    @Column(name="CREATED_BY", nullable = false)
    private Long createdBy;
    @Column(name="CREATION_DATE", nullable = false)
    private Timestamp creationDate;
    @Column(name="LAST_UPDATED_BY", nullable = false)
    private Long lastUpdatedBy;
    @Column(name="LAST_UPDATE_DATE", nullable = false)
    private Timestamp lastUpdateDate;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="SPECIFIC_FEATURES", referencedColumnName="TYPE_ID")
    private TwoType specificFeaturesCollection;
}
