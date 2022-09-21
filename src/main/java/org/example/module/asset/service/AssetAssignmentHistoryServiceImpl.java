package org.example.module.asset.service;

import org.example.module.asset.model.AssetAssignmentHistory;
import org.example.module.asset.repo.AssetAssignmentHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AssetAssignmentHistoryService implements AssetAssignmentHistoryServiceImpl {

    @Autowired
    AssetAssignmentHistoryRepo assetAssignmentHistoryRepo;
    @Override
    public List<AssetAssignmentHistory> findAll(){
        ArrayList<AssetAssignmentHistory> assetAssignmentHistories = (ArrayList<AssetAssignmentHistory>) assetAssignmentHistoryRepo.findAll();
        return assetAssignmentHistories;
    }



    public Optional<AssetAssignmentHistory> findById(Integer assignId){
        return assetAssignmentHistoryRepo.findById(assignId);
    }

    public AssetAssignmentHistory insert(AssetAssignmentHistory assetAssignmentHistory){
        return assetAssignmentHistoryRepo.save(assetAssignmentHistory);

    }
    public boolean update(AssetAssignmentHistory assetAssignmentHistory){
        try {
            assetAssignmentHistoryRepo.save(assetAssignmentHistory);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;

        }
    }
}
