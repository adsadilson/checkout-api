package br.com.apssystem.ecommerce.checkout.entity;

import br.com.apssystem.ecommerce.checkout.enums.Status;
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
