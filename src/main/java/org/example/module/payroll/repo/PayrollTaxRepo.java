package org.example.module.payroll.repo;

import org.example.module.payroll.model.PayrollTax;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayRollTaxesRepo extends JpaRepository<PayrollTax,Integer> {


}
