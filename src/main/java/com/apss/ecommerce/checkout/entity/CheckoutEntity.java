package com.apss.ecommerce.checkout.entity;

import com.apss.ecommerce.checkout.Enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@Entity
@Table(name = "checkout")
@NoArgsConstructor
@AllArgsConstructor
public class CheckoutEntity {

    @Id
    @GeneratedValue()
    private Long id;

    @Column
    private String code;

    @Column
    @Enumerated(EnumType.STRING)
    private Status status;
}
