package org.example.module.user.repo;

import org.example.module.user.model.PayRoll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayRollRepo extends JpaRepository<PayRoll,Integer> {


}
