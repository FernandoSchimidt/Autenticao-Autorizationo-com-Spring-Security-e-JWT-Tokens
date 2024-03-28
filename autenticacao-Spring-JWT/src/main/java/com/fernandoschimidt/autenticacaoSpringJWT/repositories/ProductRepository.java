package com.fernandoschimidt.autenticacaoSpringJWT.repositories;

import com.fernandoschimidt.autenticacaoSpringJWT.domain.user.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
