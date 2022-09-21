package org.example.module.payroll.service;

import org.example.module.payroll.model.Payroll;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface PayrollServiceImpl {
    List<Payroll> findAll();

    Optional<Payroll> findById(Integer payRollId);
    Payroll insert(Payroll payRoll);
    boolean update(Payroll payRoll);


}
