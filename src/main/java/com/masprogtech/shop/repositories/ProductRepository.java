package com.masprogtech.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masprogtech.shop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
