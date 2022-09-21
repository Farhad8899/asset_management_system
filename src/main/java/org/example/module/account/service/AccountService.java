package org.example.module.account.service;

import org.example.module.account.model.Account;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface AccountServiceImpl {
    List<Account> findAll();

    Optional<Account> findById(Integer accountId);
    Account insert(Account account);
    boolean update(Account account);


}
