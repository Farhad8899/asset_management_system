package org.example.module.account.service;

import org.example.module.account.model.Account;
import org.example.module.account.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService implements AccountServiceImpl {

    @Autowired
    AccountRepo accountRepo;
    @Override
    public List<Account> findAll(){
        ArrayList<Account> accounts = (ArrayList<Account>) accountRepo.findAll();
        return accounts;
    }



    public Optional<Account> findById(Integer accountId){
        return accountRepo.findById(accountId);
    }

    public Account insert(Account account){
        return accountRepo.save(account);

    }
    public boolean update(Account account){
        try {
            accountRepo.save(account);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;

        }
    }
}
