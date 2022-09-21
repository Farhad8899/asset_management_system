package org.example.module.payroll.service;

import org.example.module.payroll.model.Tax;
import org.example.module.payroll.repo.TaxRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaxServiceImpl implements TaxService {

    @Autowired
    TaxRepo taxRepo;
    @Override
    public List<Tax> findAll(){
        ArrayList<Tax> taxes = (ArrayList<Tax>) taxRepo.findAll();
        return taxes;
    }



    public Optional<Tax> findById(Integer taxId){
        return taxRepo.findById(taxId);
    }

    public Tax insert(Tax tax){
        return taxRepo.save(tax);

    }
    public boolean update( Tax tax){
        try {
            taxRepo.save(tax);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;

        }
    }
}
