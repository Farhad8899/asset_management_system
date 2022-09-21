package org.example.module.asset_module.asset_assignment_history.controller;

import org.example.common.api_response.ApiResponse;
import org.example.module.asset_module.asset_assignment_history.model.AssetAssignmentHistory;
import org.example.module.asset_module.asset_assignment_history.service.AssetAssignmentHistoryServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/AssetAssignmentHistory")
public class AssetAssignmentHistoryController {
    @Autowired
    private AssetAssignmentHistoryServiceImplementation locationService;

    @GetMapping
    public ResponseEntity<ApiResponse> getAssetAssignHistory(){
        ApiResponse<List<AssetAssignmentHistory>> apiResponse =new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(locationService.findAll());
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{assetAssignmentHistoryId}")
    public ResponseEntity<ApiResponse> getAssetAssignHistoryById(@PathVariable("assetAssignmentHistoryId") Integer assetAssignmentHistoryId) {
        ApiResponse<Integer> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        apiResponse.setBody(assetAssignmentHistoryId);
        locationService.findById(assetAssignmentHistoryId);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<ApiResponse> addAssetAssignHistory(@RequestBody AssetAssignmentHistory assetAssignmentHistory) {
        ApiResponse<AssetAssignmentHistory> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        locationService.insert(assetAssignmentHistory);
        apiResponse.setBody(assetAssignmentHistory);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
    @PutMapping("/{assetAssignmentHistoryId}")
    public ResponseEntity<ApiResponse> updateAssetAssignHistory(@RequestBody AssetAssignmentHistory assetAssignmentHistory) {
        ApiResponse<AssetAssignmentHistory> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        locationService.update(assetAssignmentHistory);
        apiResponse.setBody(assetAssignmentHistory);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }


}
