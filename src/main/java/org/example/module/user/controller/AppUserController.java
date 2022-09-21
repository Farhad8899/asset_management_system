package org.example.module.user.controller;

import org.example.common.ApiResponse;
import org.example.module.user.model.User;
import org.example.module.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class UserController {
    @Autowired
    private UserServiceImpl locationService;

    @GetMapping
    public ResponseEntity<ApiResponse> getEmployee(){
        ApiResponse<List<User>> apiResponse =new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(locationService.findAll());
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<ApiResponse> getEmployeeById(@PathVariable("employeeId") Integer employeeId) {
        ApiResponse<Integer> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        apiResponse.setBody(employeeId);
        locationService.findById(employeeId);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<ApiResponse> addEmployee(@RequestBody User user) {
        ApiResponse<User> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        locationService.insert(user);
        apiResponse.setBody(user);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
    @PutMapping("/{employeeId}")
    public ResponseEntity<ApiResponse> updateEmployee(@RequestBody User user) {
        ApiResponse<User> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        locationService.update(user);
        apiResponse.setBody(user);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }


}
