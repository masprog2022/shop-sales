package com.masprogtech.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masprogtech.shop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
