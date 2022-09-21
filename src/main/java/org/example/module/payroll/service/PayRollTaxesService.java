package org.example.module.payroll.service;

import org.example.module.payroll.model.PayrollTax;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface PayRollTaxesServiceImpl {
    List<PayrollTax> findAll();

    Optional<PayrollTax> findById(Integer payRollTaxesId);
    PayrollTax insert(PayrollTax payRollTax);
    boolean update(PayrollTax payRollTax);


}
