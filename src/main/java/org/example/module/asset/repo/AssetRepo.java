package org.example.module.asset_module.asset.repo;

import org.example.module.asset_module.asset.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
@Repository
@Transactional
public interface AssetRepo extends JpaRepository <Asset, Integer>{

}
