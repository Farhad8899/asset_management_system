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
@Table(name = "payRollTaxes")
@Embeddable
public class PayRollTaxes extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer payRollTaxesId;
    private Integer amount;

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "payRollDetailId")
    private PayRollDetails payRollDetails;
}
