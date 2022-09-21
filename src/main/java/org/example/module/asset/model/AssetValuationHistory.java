package org.example.module.asset_module.asset_valuation_history.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.module.asset_module.asset.model.Asset;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "assetEvaluationHistory")
public class AssetValuationHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "valuation_id")
    private Integer valuationId;
    @Column(name = "valuation_date")
    private Date valuationDate;

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "asset_Id")
    private Asset assetId;

}
