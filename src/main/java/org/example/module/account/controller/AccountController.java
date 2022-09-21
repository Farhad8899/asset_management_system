package org.example.module.user.controller;

import org.example.common.ApiResponse;
import org.example.module.user.model.Account;
import org.example.module.user.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/accounts")
public class AccountController {
    @Autowired
    private AccountServiceImpl accountService;

    @GetMapping
    public ResponseEntity<ApiResponse> getAccount(){
        ApiResponse<List<Account>> apiResponse =new ApiResponse<>();
        apiResponse.setMessage("Created");
        apiResponse.setBody(accountService.findAll());
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/{accountId}")
    public ResponseEntity<ApiResponse> getAccountById(@PathVariable("accountId") Integer accountId) {
        ApiResponse<Integer> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        apiResponse.setBody(accountId);
        accountService.findById(accountId);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<ApiResponse> addAccount(@RequestBody Account account) {
        ApiResponse<Account> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        accountService.insert(account);
        apiResponse.setBody(account);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }
    @PutMapping("/{accountId}")
    public ResponseEntity<ApiResponse> updateAccount(@RequestBody Account account) {
        ApiResponse<Account> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("created");
        accountService.update(account);
        apiResponse.setBody(account);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }


}
