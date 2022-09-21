package org.example.module.user.service;

import org.example.module.user.model.AppUserHistory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface AppUserHistoryServiceImpl {
    List<AppUserHistory> findAll();

    Optional<AppUserHistory> findById(Integer userHistoryId);
    AppUserHistory insert(AppUserHistory appUserHistory);
    boolean update(AppUserHistory appUserHistory);


}
