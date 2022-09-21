package org.example.module.asset.asset.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.module.asset.asset_type.model.AssetType;
import org.example.module.location.model.Location;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "asset")
@Embeddable
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "asset_id")
    private Integer assetId;
    @Column(name = "specs")
    private String specs;
    @Column(name= "purchase_cost")
    private Double purchaseCost;

////    parent asset id call itself......
    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "parent_asset_id")
    private Asset asset;

//  For asset table relation
    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "asset_type_Id")
    private AssetType assetType;

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "asset_location_id")
    private Location location;
}
