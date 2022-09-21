package org.example.module.payroll.service;

import org.example.module.payroll.model.PayrollDetails;
import org.example.module.payroll.repo.PayrollDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PayrollDetailService implements PayrollDetailServiceImpl {

    @Autowired
    PayrollDetailRepo payRollDetailRepo;
    @Override
    public List<PayrollDetails> findAll(){
        ArrayList<PayrollDetails> payRollDetails = (ArrayList<PayrollDetails>) payRollDetailRepo.findAll();
        return payRollDetails;
    }



    public Optional<PayrollDetails> findById(Integer payRollDetailId){
        return payRollDetailRepo.findById(payRollDetailId);
    }

    public PayrollDetails insert(PayrollDetails payRollDetails){
        return payRollDetailRepo.save(payRollDetails);

    }
    public boolean update( PayrollDetails payRollDetails){
        try {
            payRollDetailRepo.save(payRollDetails);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;

        }
    }
}
