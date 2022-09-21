package org.example.module.asset_module.asset_assignment_history.repo;

import org.example.module.asset_module.asset_assignment_history.model.AssetAssignmentHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetAssignmentHistoryRepo extends JpaRepository<AssetAssignmentHistory,Integer> {


}
