package org.example.module.asset_module.asset_type.controller;

import org.example.common.api_response.ApiResponse;
import org.example.module.asset_module.asset_type.model.AssetType;
import org.example.module.asset_module.asset_type.service.AssetTypeServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/assetType")
public class AssetTypeController {

    @Autowired
    private AssetTypeServiceImplementation assetTypeService;

    @GetMapping
    public ResponseEntity<ApiResponse> getAssetType(){
        ApiResponse<List<AssetType>> apiResponse =new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(assetTypeService.findAll());
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{typeId}")
    public ResponseEntity<ApiResponse> getAssetTypeById(@PathVariable Integer typeId){
        ApiResponse<Integer> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(typeId);
        assetTypeService.findById(typeId);
        return new ResponseEntity<>(apiResponse,HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<ApiResponse> addAssetType(@RequestBody AssetType assetType){
        ApiResponse<AssetType> apiResponse =new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(assetType);
        assetTypeService.insert(assetType);
        return new ResponseEntity<>(apiResponse,HttpStatus.CREATED);
    }

    @PutMapping("/{typeId}")
    public ResponseEntity<ApiResponse> updateAssetType(@RequestBody AssetType assetType){
        ApiResponse<AssetType> apiResponse =new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(assetType);
        assetTypeService.update(assetType);
        return new ResponseEntity<>(apiResponse,HttpStatus.CREATED);
    }


}
