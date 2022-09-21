package org.example.module.payroll.service;

import org.example.module.payroll.model.PayrollTax;
import org.example.module.payroll.repo.PayrollTaxRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PayrollTaxServiceImpl implements PayRollTaxesService {

    @Autowired
    PayrollTaxRepo payrollTaxRepo;
    @Override
    public List<PayrollTax> findAll(){
        ArrayList<PayrollTax> payRollTaxes = (ArrayList<PayrollTax>) payrollTaxRepo.findAll();
        return payRollTaxes;
    }



    public Optional<PayrollTax> findById(Integer payRollTaxesId){
        return payrollTaxRepo.findById(payRollTaxesId);
    }

    public PayrollTax insert(PayrollTax payRollTax){
        return payrollTaxRepo.save(payRollTax);

    }
    public boolean update( PayrollTax payRollTax){
        try {
            payrollTaxRepo.save(payRollTax);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;

        }
    }
}
