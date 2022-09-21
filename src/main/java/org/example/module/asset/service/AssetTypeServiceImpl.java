package org.example.module.asset.service;

import org.example.module.asset.repo.AssetTypeRepo;
import org.example.module.asset.model.AssetType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AssetTypeService implements AssetTypeServiceImpl {
    @Autowired
    AssetTypeRepo assetTypeRepo;

    @Override
    public List<AssetType> findAll(){
        ArrayList<AssetType> assetTypes =(ArrayList<AssetType>) assetTypeRepo.findAll();
        return  assetTypes;
    }
    @Override
    public Optional<AssetType> findById(Integer typeId){
        return assetTypeRepo.findById(typeId);
    }
    @Override
    public AssetType insert(@RequestBody AssetType assetType){
        return assetTypeRepo.save(assetType);
    }
    @Override
    public boolean update(AssetType assetType){
        try {
            assetTypeRepo.save(assetType);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }


}
