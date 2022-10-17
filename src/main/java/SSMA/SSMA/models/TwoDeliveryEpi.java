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
@Table(name = "TWO_DELIVERY_EPI")
public class TwoDeliveryEpi implements TwoEntity{

    @Id @Column(name="DELIVERY_EPI_ID", nullable = false)
    //@GeneratedValue(generator="seqDeliveryId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deliveryEpiId;

    @Column(name="EMPLID")
    private String emplid;

    @Column(name="ESTABID")
    private String estabid;

    @Column(name="DELIVERY_DATE")
    private Timestamp deliveryDate;

    @Column(name="DELIVERY_QUANTITY")
    private Long deliveryQuantity;

    @Column(name="CREATED_BY", length = 120)
    private Long createdBy;

    @Column(name="CREATION_DATE")
    private Timestamp creationDate;

    @Column(name="LAST_UPDATED_BY", length = 120)
    private Long lastUpdatedBy;

    @Column(name="LAST_UPDATE_DATE")
    private Timestamp lastUpdateDate;

    @Transient
    private String name;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="EPI_ID", referencedColumnName="EPI_ID")
    private TwoEpi epiCollection;
}
