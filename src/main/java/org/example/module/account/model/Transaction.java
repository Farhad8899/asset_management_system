package org.example.module.transaction.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.common.BaseEntity;
import org.example.module.user.model.Account;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transaction")
@Embeddable
public class Transaction extends BaseEntity {
    private static final long serialVersionUID = -8020071572387253620L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionId;
    private Integer amount;
    @DateTimeFormat
    private Date dateTime;

    private enum PaymentStatus {
        PENDING,
        PAID
    }

    @Enumerated(EnumType.STRING)
    PaymentStatus paymentStatus;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "accountId")
    private Account account;

}
