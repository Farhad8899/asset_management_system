package org.example.module.asset.service;

import org.example.module.asset.model.AssetAssignmentHistory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface AssetAssignmentHistoryServiceImpl {
    List<AssetAssignmentHistory> findAll();

    Optional<AssetAssignmentHistory> findById(Integer assignId);
    AssetAssignmentHistory insert(AssetAssignmentHistory assetAssignmentHistory);
    boolean update(AssetAssignmentHistory assetAssignmentHistory);


}
