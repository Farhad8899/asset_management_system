package org.example.module.payroll.service;

import org.example.module.payroll.model.Payroll;
import org.example.module.payroll.repo.PayrollRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PayrollService implements PayrollServiceImpl {

    @Autowired
    PayrollRepo payRollRepo;
    @Override
    public List<Payroll> findAll(){
        ArrayList<Payroll> payrolls = (ArrayList<Payroll>) payRollRepo.findAll();
        return payrolls;
    }



    public Optional<Payroll> findById(Integer payRollId){
        return payRollRepo.findById(payRollId);
    }

    public Payroll insert(Payroll payRoll){
        return payRollRepo.save(payRoll);

    }
    public boolean update( Payroll payRoll){
        try {
            payRollRepo.save(payRoll);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;

        }
    }
}
