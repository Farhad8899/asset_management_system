package org.example.module.asset.service;


import org.example.module.asset.model.Asset;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public interface AssetServiceImpl {
    List<Asset> findAll();

    Optional<Asset> findById(Integer asset_id);

    Asset insert(Asset a);

    boolean update(Asset a);

}
