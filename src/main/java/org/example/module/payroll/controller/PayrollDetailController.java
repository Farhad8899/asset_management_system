package org.example.module.payroll.controller;

import org.example.common.ApiResponse;
import org.example.module.payroll.model.PayrollDetails;
import org.example.module.payroll.service.PayRollDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/payRollDetails")
public class PayRollDetailsController {
    @Autowired
    private PayRollDetailsServiceImpl payRollDetailsService;

    @GetMapping
    public ResponseEntity<ApiResponse> getPayRollDetailType(){
        ApiResponse<List<PayrollDetails>> apiResponse =new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(payRollDetailsService.findAll());
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{payRollDetailId}")
    public ResponseEntity<ApiResponse> getPayRollDetailById(@PathVariable("payRollDetailId") Integer payRollDetailId) {
        ApiResponse<Integer> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        apiResponse.setBody(payRollDetailId);
        payRollDetailsService.findById(payRollDetailId);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<ApiResponse> addPayRollDetail(@RequestBody PayrollDetails payRollDetails) {
        ApiResponse<PayrollDetails> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        payRollDetailsService.insert(payRollDetails);
        apiResponse.setBody(payRollDetails);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
    @PutMapping("/{payRollDetailId}")
    public ResponseEntity<ApiResponse> updatePayRollDetail(@RequestBody PayrollDetails payRollDetails) {
        ApiResponse<PayrollDetails> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        payRollDetailsService.update(payRollDetails);
        apiResponse.setBody(payRollDetails);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
}
