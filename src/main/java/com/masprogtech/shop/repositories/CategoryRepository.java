package com.masprogtech.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masprogtech.shop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
