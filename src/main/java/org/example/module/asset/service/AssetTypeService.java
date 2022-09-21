package org.example.module.asset.service;

import org.example.module.asset.model.AssetType;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface AssetTypeServiceImpl {
    List<AssetType>findAll();
    Optional<AssetType> findById(Integer typeId);

    AssetType insert(AssetType assetType);
    boolean update(AssetType assetType);
}
