package org.example.module.asset_module.asset_valuation_history.controller;

import org.example.common.api_response.ApiResponse;
import org.example.module.asset_module.asset_valuation_history.model.AssetValuationHistory;
import org.example.module.asset_module.asset_valuation_history.service.AssetValuableHistoryServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/AssetValuableHistory")
public class AssetValuableHistoryController {
    @Autowired
    private AssetValuableHistoryServiceImplementation locationService;

    @GetMapping
    public ResponseEntity<ApiResponse> getAssetValuableHistory(){
        ApiResponse<List<AssetValuationHistory>> apiResponse =new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(locationService.findAll());
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{valuationId}")
    public ResponseEntity<ApiResponse> getAssetValuableHistoryById(@PathVariable("valuationId") Integer valuationId) {
        ApiResponse<Integer> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        apiResponse.setBody(valuationId);
        locationService.findById(valuationId);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<ApiResponse> addAssetValuableHistory(@RequestBody AssetValuationHistory assetValuationHistory) {
        ApiResponse<AssetValuationHistory> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        locationService.insert(assetValuationHistory);
        apiResponse.setBody(assetValuationHistory);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
    @PutMapping("/{valuationId}")
    public ResponseEntity<ApiResponse> updateAssetValuableHistory(@RequestBody AssetValuationHistory assetValuationHistory) {
        ApiResponse<AssetValuationHistory> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        locationService.update(assetValuationHistory);
        apiResponse.setBody(assetValuationHistory);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
}
