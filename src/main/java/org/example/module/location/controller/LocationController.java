package org.example.module.location_module.controller;

import org.example.common.api_response.ApiResponse;
import org.example.module.location_module.model.Location;
import org.example.module.location_module.service.LocationServiceImplemantion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/location")
public class LocationController {
    @Autowired
    private LocationServiceImplemantion locationService;

    @GetMapping
    public ResponseEntity<ApiResponse> getLocation(){
        ApiResponse<List<Location>> apiResponse =new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(locationService.findAll());
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{locationId}")
    public ResponseEntity<ApiResponse> getLocationById(@PathVariable("locationId") Integer locationId) {
        ApiResponse<Integer> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        apiResponse.setBody(locationId);
        locationService.findById(locationId);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<ApiResponse> addLocation(@RequestBody Location location) {
        ApiResponse<Location> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        locationService.insert(location);
        apiResponse.setBody(location);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
    @PutMapping("/{locationId}")
    public ResponseEntity<ApiResponse> updateLocation(@RequestBody Location location) {
        ApiResponse<Location> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        locationService.update(location);
        apiResponse.setBody(location);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }


}
