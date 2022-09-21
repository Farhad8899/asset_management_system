package org.example.module.account.service;

import org.example.module.account.model.Transaction;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface TransactionServiceImpl {
    List<Transaction> findAll();

    Optional<Transaction> findById(Integer transactionId);
    Transaction insert(Transaction transaction);
    boolean update(Transaction transaction);


}
