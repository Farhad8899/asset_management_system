package org.example.module.user.service;

import org.example.module.user.model.AppUserEvent;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface AppUserEventServiceImpl {
    List<AppUserEvent> findAll();

    Optional<AppUserEvent> findById(Integer eventId);
    AppUserEvent insert(AppUserEvent appUserEvent);
    boolean update(AppUserEvent appUserEvent);


}
