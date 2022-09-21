package org.example.module.user.repo;

import org.example.module.user.model.UserHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserHistoryRepo extends JpaRepository<UserHistory,Integer> {


}
