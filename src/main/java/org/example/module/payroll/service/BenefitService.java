package org.example.module.payroll.service;

import org.example.module.payroll.model.BenefitType;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface BenefitServiceImpl {
    List<BenefitType> findAll();

    Optional<BenefitType> findById(Integer benefitId);
    BenefitType insert(BenefitType benefitType);
    boolean update(BenefitType benefitType);


}
