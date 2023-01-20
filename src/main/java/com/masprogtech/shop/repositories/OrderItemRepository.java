package com.masprogtech.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masprogtech.shop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
