package com.food.panda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.panda.entity.UserRegistration;

public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Long>{

}
