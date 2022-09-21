package org.example.module.user.service;

import org.example.module.user.model.AppUser;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface AppUserServiceImpl {
    List<AppUser> findAll();

    Optional<AppUser> findById(Integer userId);
    AppUser insert(AppUser appUser);
    boolean update(AppUser appUser);


}
