package com.shoppy.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppy.product.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
