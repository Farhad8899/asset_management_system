package org.example.module.user.service;

import org.example.module.user.model.AppUserEvent;
import org.example.module.user.repo.AppUserEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AppUserEventServiceImpl implements AppUserEventService {

    @Autowired
    AppUserEventRepo appUserEventRepo;
    @Override
    public List<AppUserEvent> findAll(){
        ArrayList<AppUserEvent> appUserEvents = (ArrayList<AppUserEvent>) appUserEventRepo.findAll();
        return appUserEvents;
    }



    public Optional<AppUserEvent> findById(Integer eventId){
        return appUserEventRepo.findById(eventId);
    }

    public AppUserEvent insert(AppUserEvent appUserEvent){
        return appUserEventRepo.save(appUserEvent);

    }
    public boolean update(AppUserEvent appUserEvent){
        try {
            appUserEventRepo.save(appUserEvent);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;

        }
    }
}
