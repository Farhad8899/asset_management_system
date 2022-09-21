package org.example.module.account.service;

import org.example.module.account.model.Transaction;
import org.example.module.account.repo.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionService implements TransactionServiceImpl {

    @Autowired
    TransactionRepo transactionRepo;
    @Override
    public List<Transaction> findAll(){
        ArrayList<Transaction> transactions = (ArrayList<Transaction>) transactionRepo.findAll();
        return transactions;
    }



    public Optional<Transaction> findById(Integer transactionId){
        return transactionRepo.findById(transactionId);
    }

    public Transaction insert(Transaction transaction){
        return transactionRepo.save(transaction);

    }
    public boolean update(Transaction transaction){
        try {
            transactionRepo.save(transaction);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;

        }
    }
}
