package org.example.module.user.repo;

import org.example.module.user.model.BenefitType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BenefitRepo extends JpaRepository<BenefitType,Integer> {


}
