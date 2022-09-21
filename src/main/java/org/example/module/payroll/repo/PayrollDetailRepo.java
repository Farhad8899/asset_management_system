package org.example.module.payroll.repo;

import org.example.module.payroll.model.PayrollDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayRollDetailsRepo extends JpaRepository<PayrollDetails,Integer> {


}
