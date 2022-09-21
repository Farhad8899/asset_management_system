package org.example.module.asset.service;

import org.example.module.asset.model.AssetValuationHistory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface AssetValuableHistoryServiceImpl {
    List<AssetValuationHistory> findAll();

    Optional<AssetValuationHistory> findById(Integer valuationId);
    AssetValuationHistory insert(AssetValuationHistory assetValuationHistory);
    boolean update(AssetValuationHistory assetValuationHistory);


}
