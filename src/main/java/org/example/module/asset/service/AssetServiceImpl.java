package org.example.module.asset.service;

import org.example.module.asset.model.Asset;
import org.example.module.asset.repo.AssetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AssetService implements AssetServiceImpl {

    @Autowired
    AssetRepo assetRepo;

    @Override
    public List<Asset> findAll() {
        ArrayList<Asset> assets = (ArrayList<Asset>) assetRepo.findAll();
        return assets;
    }

    public Optional<Asset> findById(Integer asset_id) {
        return assetRepo.findById(asset_id);

    }

    @Override
    public Asset insert(Asset a) {
        return assetRepo.save(a);
    }


    @Override
    public boolean update(Asset a) {
        try {
            assetRepo.save(a);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}

