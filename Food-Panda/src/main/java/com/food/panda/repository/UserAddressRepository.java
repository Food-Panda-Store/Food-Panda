package com.food.panda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.panda.entity.UserAddress;

public interface UserAddressRepository extends JpaRepository<UserAddress, Long>{

}
