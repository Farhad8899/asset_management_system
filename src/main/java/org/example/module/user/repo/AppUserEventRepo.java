package org.example.module.user.repo;

import org.example.module.user.model.UserEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepo extends JpaRepository<UserEvent,Integer> {


}
