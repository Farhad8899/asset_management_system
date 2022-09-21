package org.example.module.asset_module.asset.controller;

import org.example.common.api_response.ApiResponse;
import org.example.module.asset_module.asset.model.Asset;
import org.example.module.asset_module.asset.service.AssetServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/asset")
public class AssetController {

    @Autowired
    private AssetServiceImplementation assetService;

    @GetMapping
    public ResponseEntity<ApiResponse> getAsset(){
        ApiResponse<List<Asset>> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        apiResponse.setBody(assetService.findAll());
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{asset_id}")
    public ResponseEntity<ApiResponse> getAssetById(@PathVariable("asset_id") Integer asset_id){
        ApiResponse<Integer> apiResponse=new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(asset_id);
        assetService.findById(asset_id);
        return new ResponseEntity<>(apiResponse,HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<ApiResponse> addAsset(@RequestBody Asset asset){
        ApiResponse<Asset> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("Created");
        assetService.insert(asset);
        apiResponse.setBody(asset);
        return new ResponseEntity<>(apiResponse,HttpStatus.CREATED);
    }

    @PutMapping("/{asset_id}")
    public ResponseEntity<ApiResponse>  updateAsset(@RequestBody Asset asset){
        ApiResponse<Asset> apiResponse  =new ApiResponse<>();
        apiResponse.setMessage("Created");
        assetService.update(asset);
        apiResponse.setBody(asset);
        return new ResponseEntity<>(apiResponse,HttpStatus.CREATED);
    }
}
