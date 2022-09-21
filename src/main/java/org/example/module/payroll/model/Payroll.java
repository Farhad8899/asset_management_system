package org.example.module.payroll.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.common.BaseEntity;
import org.example.module.user.model.User;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "payRoll")
@Embeddable
public class PayRoll extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer payRollId;
    private Date date;

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "userId")
    private User user;
}
