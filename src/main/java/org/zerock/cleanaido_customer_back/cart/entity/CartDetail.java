package org.zerock.cleanaido_customer_back.cart.entity;

import jakarta.persistence.*;
import lombok.*;
import org.zerock.cleanaido_customer_back.product.entity.Product;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
public class CartDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdno;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cart cart;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    private int quantity;

}
