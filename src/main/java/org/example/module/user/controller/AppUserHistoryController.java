package org.example.module.user.controller;

import org.example.common.ApiResponse;
import org.example.module.user.service.UserHistoryServiceImpl;
import org.example.module.user.model.UserHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employeeHistory")
public class UserHistoryController {
    @Autowired
    private UserHistoryServiceImpl locationService;

    @GetMapping
    public ResponseEntity<ApiResponse> getEmployeeHistory(){
        ApiResponse<List<UserHistory>> apiResponse =new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(locationService.findAll());
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{employeeHistoryId}")
    public ResponseEntity<ApiResponse> getEmployeeHistoryById(@PathVariable("employeeHistoryId") Integer employeeHistoryId) {
        ApiResponse<Integer> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        apiResponse.setBody(employeeHistoryId);
        locationService.findById(employeeHistoryId);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<ApiResponse> addEmployeeHistory(@RequestBody UserHistory userHistory) {
        ApiResponse<UserHistory> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        apiResponse.setBody(userHistory);
        locationService.insert(userHistory);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
    @PutMapping("/{employeeHistoryId}")
    public ResponseEntity<ApiResponse> updateEmployeeHistory(@RequestBody UserHistory userHistory) {
        ApiResponse<UserHistory> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        apiResponse.setBody(userHistory);
        locationService.update(userHistory);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }


}
