package org.example.module.payroll.service;

import org.example.module.payroll.model.PayrollDetails;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface PayrollDetailServiceImpl {
    List<PayrollDetails> findAll();

    Optional<PayrollDetails> findById(Integer payRollDetailId);
    PayrollDetails insert(PayrollDetails payRollDetails);
    boolean update(PayrollDetails payRollDetails);


}
