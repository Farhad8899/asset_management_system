package org.example.module.transaction.controller;

import org.example.common.ApiResponse;
import org.example.module.transaction.model.Transaction;
import org.example.module.transaction.service.TransactionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/transactions")
public class TransactionController {
    @Autowired
    private TransactionServiceImpl transactionService;

    @GetMapping
    public ResponseEntity<ApiResponse> getTransaction(){
        ApiResponse<List<Transaction>> apiResponse =new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(transactionService.findAll());
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{transactionId}")
    public ResponseEntity<ApiResponse> getTransactionById(@PathVariable("transactionId") Integer transactionId) {
        ApiResponse<Integer> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        apiResponse.setBody(transactionId);
        transactionService.findById(transactionId);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<ApiResponse> addTransaction(@RequestBody Transaction transaction) {
        ApiResponse<Transaction> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        transactionService.insert(transaction);
        apiResponse.setBody(transaction);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
    @PutMapping("/{transactionId}")
    public ResponseEntity<ApiResponse> updateTransaction(@RequestBody Transaction transaction) {
        ApiResponse<Transaction> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        transactionService.update(transaction);
        apiResponse.setBody(transaction);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }


}
