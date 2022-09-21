package org.example.module.asset.service;

import org.example.module.asset.model.AssetValuationHistory;
import org.example.module.asset.repo.AssetValuableHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AssetValuableHistoryService implements AssetValuableHistoryServiceImpl {

    @Autowired
    AssetValuableHistoryRepo assetValuableHistoryRepo;
    @Override
    public List<AssetValuationHistory> findAll(){
        ArrayList<AssetValuationHistory> assetValuableHistories = (ArrayList<AssetValuationHistory>) assetValuableHistoryRepo.findAll();
        return assetValuableHistories;
    }



    public Optional<AssetValuationHistory> findById(Integer valuationId){
        return assetValuableHistoryRepo.findById(valuationId);
    }

    public AssetValuationHistory insert(AssetValuationHistory assetValuationHistory){
        return assetValuableHistoryRepo.save(assetValuationHistory);

    }
    public boolean update(AssetValuationHistory assetValuationHistory){
        try {
            assetValuableHistoryRepo.save(assetValuationHistory);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;

        }
    }
}
