package org.example.module.location.service;

import org.example.module.location.model.Location;
import org.example.module.location.repo.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LocationService implements LocationServiceImpl {

    @Autowired
    LocationRepo locationRepo;
    @Override
    public List<Location> findAll(){
        ArrayList<Location> locations = (ArrayList<Location>) locationRepo.findAll();
        return locations;
    }



    public Optional<Location> findById(Integer locationId){
        return locationRepo.findById(locationId);
    }

    public Location insert(Location location){
        return locationRepo.save(location);

    }
    public boolean update(Location location){
        try {
            locationRepo.save(location);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;

        }
    }
}
