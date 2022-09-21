package org.example.module.user.repo;

import org.example.module.user.model.Tax;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxRepo extends JpaRepository<Tax,Integer> {


}
