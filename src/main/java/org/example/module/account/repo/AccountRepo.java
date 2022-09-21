package org.example.module.user.repo;

import org.example.module.user.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account,Integer> {


}
