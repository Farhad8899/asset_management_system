package org.example.module.location_module.repo;

import org.example.module.location_module.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepo extends JpaRepository<Location,Integer> {


}
