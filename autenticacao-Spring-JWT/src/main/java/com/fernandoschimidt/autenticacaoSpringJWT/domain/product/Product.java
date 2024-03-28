package com.fernandoschimidt.autenticacaoSpringJWT.domain.user.product;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "product")
@Entity(name = "product")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer price;


    public Product(ProductRequestDTO data) {
        this.price = data.price();
        this.name = data.name();
    }
}