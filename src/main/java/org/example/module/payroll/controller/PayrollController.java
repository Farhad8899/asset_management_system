package org.example.module.user.controller;

import org.example.common.ApiResponse;
import org.example.module.user.model.PayRoll;
import org.example.module.user.service.PayRollServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/payRolls")
public class PayRollController {
    @Autowired
    private PayRollServiceImpl payRollService;

    @GetMapping
    public ResponseEntity<ApiResponse> getPayRollType(){
        ApiResponse<List<PayRoll>> apiResponse =new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(payRollService.findAll());
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{payRollId}")
    public ResponseEntity<ApiResponse> getPayRollById(@PathVariable("payRollId") Integer payRollId) {
        ApiResponse<Integer> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        apiResponse.setBody(payRollId);
        payRollService.findById(payRollId);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<ApiResponse> addPayRoll(@RequestBody PayRoll payRoll) {
        ApiResponse<PayRoll> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        payRollService.insert(payRoll);
        apiResponse.setBody(payRoll);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
    @PutMapping("/{payRollId}")
    public ResponseEntity<ApiResponse> updatePayRoll(@RequestBody PayRoll payRoll) {
        ApiResponse<PayRoll> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        payRollService.update(payRoll);
        apiResponse.setBody(payRoll);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
}
