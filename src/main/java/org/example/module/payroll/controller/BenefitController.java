package org.example.module.user.controller;

import org.example.common.ApiResponse;
import org.example.module.user.model.BenefitType;
import org.example.module.user.service.BenefitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/benefits")
public class BenefitController {
    @Autowired
    private BenefitServiceImpl benefitService;

    @GetMapping
    public ResponseEntity<ApiResponse> getBenefitType(){
        ApiResponse<List<BenefitType>> apiResponse =new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(benefitService.findAll());
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{benefitId}")
    public ResponseEntity<ApiResponse> getBenefitTypeById(@PathVariable("benefitId") Integer benefitId) {
        ApiResponse<Integer> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        apiResponse.setBody(benefitId);
        benefitService.findById(benefitId);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<ApiResponse> addBenefitType(@RequestBody BenefitType benefitType) {
        ApiResponse<BenefitType> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        benefitService.insert(benefitType);
        apiResponse.setBody(benefitType);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
    @PutMapping("/{benefitId}")
    public ResponseEntity<ApiResponse> updateBenefitType(@RequestBody BenefitType benefitType) {
        ApiResponse<BenefitType> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        benefitService.update(benefitType);
        apiResponse.setBody(benefitType);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }


}
