package org.example.module.payroll.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.common.BaseEntity;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "payRollDetails")
@Embeddable
public class PayRollDetails extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer payRollDetailId;
    private Integer amount;

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "benefitId")
    private BenefitType benefitType;
}
