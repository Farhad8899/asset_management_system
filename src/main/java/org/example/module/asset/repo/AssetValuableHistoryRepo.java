package org.example.module.asset_module.asset_valuation_history.repo;

import org.example.module.asset_module.asset_valuation_history.model.AssetValuationHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetValuableHistoryRepo extends JpaRepository<AssetValuationHistory,Integer> {


}
