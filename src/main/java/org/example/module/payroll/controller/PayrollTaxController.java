package org.example.module.payroll.controller;

import org.example.common.ApiResponse;
import org.example.module.payroll.model.PayrollTax;
import org.example.module.payroll.service.PayRollTaxesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/payRollTaxes")
public class PayRollTaxesController {
    @Autowired
    private PayRollTaxesServiceImpl payRollTaxesService;

    @GetMapping
    public ResponseEntity<ApiResponse> getPayRollTaxesType(){
        ApiResponse<List<PayrollTax>> apiResponse =new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(payRollTaxesService.findAll());
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{payRollTaxesId}")
    public ResponseEntity<ApiResponse> getPayRollTaxesById(@PathVariable("payRollTaxesId") Integer payRollTaxesId) {
        ApiResponse<Integer> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        apiResponse.setBody(payRollTaxesId);
        payRollTaxesService.findById(payRollTaxesId);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<ApiResponse> addPayRollTaxes(@RequestBody PayrollTax payRollTax) {
        ApiResponse<PayrollTax> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        payRollTaxesService.insert(payRollTax);
        apiResponse.setBody(payRollTax);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
    @PutMapping("/{payRollId}")
    public ResponseEntity<ApiResponse> updatePayRollTaxes(@RequestBody PayrollTax payRollTax) {
        ApiResponse<PayrollTax> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        payRollTaxesService.update(payRollTax);
        apiResponse.setBody(payRollTax);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
}
