package org.example.module.asset_module.asset_type.repo;

import org.example.module.asset_module.asset_type.model.AssetType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface AssetTypeRepo extends JpaRepository<AssetType,Integer> {

}
