package com.masprogtech.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masprogtech.shop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
