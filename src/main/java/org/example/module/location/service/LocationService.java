package org.example.module.location.service;

import org.example.module.location.model.Location;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface LocationServiceImpl {
    List<Location> findAll();

    Optional<Location> findById(Integer locationId);
    Location insert(Location location);
    boolean update(Location location);


}
