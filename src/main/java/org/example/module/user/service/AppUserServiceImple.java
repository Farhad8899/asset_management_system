package org.example.module.user.service;

import org.example.module.user.model.AppUser;
import org.example.module.user.repo.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    AppUserRepo appUserRepo;
    @Override
    public List<AppUser> findAll(){
        ArrayList<AppUser> appUsers = (ArrayList<AppUser>) appUserRepo.findAll();
        return appUsers;
    }



    public Optional<AppUser> findById(Integer userId){
        return appUserRepo.findById(userId);
    }

    public AppUser insert(AppUser appUser){
        return appUserRepo.save(appUser);

    }
    public boolean update(AppUser appUser){
        try {
            appUserRepo.save(appUser);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;

        }
    }
}
