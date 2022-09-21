package org.example.module.user.service;

import org.example.module.user.repo.AppUserHistoryRepo;
import org.example.module.user.model.AppUserHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AppUserHistoryServiceImpl implements AppUserHistoryService {

    @Autowired
    AppUserHistoryRepo appUserHistoryRepo;
    @Override
    public List<AppUserHistory> findAll(){
        ArrayList<AppUserHistory> userHistories = (ArrayList<AppUserHistory>) appUserHistoryRepo.findAll();
        return userHistories;
    }



    public Optional<AppUserHistory> findById(Integer userHistoryId){
        return appUserHistoryRepo.findById(userHistoryId);
    }

    public AppUserHistory insert(AppUserHistory appUserHistory){
        return appUserHistoryRepo.save(appUserHistory);

    }
    public boolean update(AppUserHistory appUserHistory){
        try {
            appUserHistoryRepo.save(appUserHistory);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;

        }
    }
}
