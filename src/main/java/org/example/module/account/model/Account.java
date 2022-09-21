package org.example.module.user.model;

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
@Table(name = "account")
@Embeddable
public class Account extends BaseEntity {
    private static final long serialVersionUID = -8020071572387253620L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;
    private Integer balance;

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "userId")
    private User user;

}
