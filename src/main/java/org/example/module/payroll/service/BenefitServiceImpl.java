package org.example.module.payroll.service;

import org.example.module.payroll.model.BenefitType;
import org.example.module.payroll.repo.BenefitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BenefitService implements  BenefitServiceImpl {

    @Autowired
    BenefitRepo benefitRepo;
    @Override
    public List<BenefitType> findAll(){
        ArrayList<BenefitType> benefitTypes = (ArrayList<BenefitType>) benefitRepo.findAll();
        return benefitTypes;
    }



    public Optional<BenefitType> findById(Integer benefitId){
        return benefitRepo.findById(benefitId);
    }

    public BenefitType insert(BenefitType benefitType){
        return benefitRepo.save(benefitType);

    }
    public boolean update( BenefitType benefitType){
        try {
            benefitRepo.save(benefitType);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;

        }
    }
}
