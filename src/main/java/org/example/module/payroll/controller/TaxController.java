package org.example.module.user.controller;

import org.example.common.ApiResponse;
import org.example.module.user.model.Tax;
import org.example.module.user.service.TaxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/taxes")
public class TaxController {
    @Autowired
    private TaxServiceImpl taxService;

    @GetMapping
    public ResponseEntity<ApiResponse> getTaxType(){
        ApiResponse<List<Tax>> apiResponse =new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(taxService.findAll());
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{taxId}")
    public ResponseEntity<ApiResponse> getTaxById(@PathVariable("taxId") Integer taxId) {
        ApiResponse<Integer> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        apiResponse.setBody(taxId);
        taxService.findById(taxId);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<ApiResponse> addTax(@RequestBody Tax tax) {
        ApiResponse<Tax> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        taxService.insert(tax);
        apiResponse.setBody(tax);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
    @PutMapping("/{taxId}")
    public ResponseEntity<ApiResponse> updateTax(@RequestBody Tax tax) {
        ApiResponse<Tax> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        taxService.update(tax);
        apiResponse.setBody(tax);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
}
