package org.example.module.payroll.service;

import org.example.module.payroll.model.Tax;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface TaxServiceImpl {
    List<Tax> findAll();

    Optional<Tax> findById(Integer taxId);
    Tax insert(Tax tax);
    boolean update(Tax tax);


}
