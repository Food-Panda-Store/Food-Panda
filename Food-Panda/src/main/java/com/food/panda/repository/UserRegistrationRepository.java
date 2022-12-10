package com.food.panda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.food.panda.entity.UserRegistration;

public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Long>{
	@Query("select u from UserRegistration u where u.UserRegistrationEmail =:UserRegistrationEmail")
	public UserRegistration getUserRegistrationByUserRegistrationEmail(@Param("UserRegistrationEmail")String UserRegistrationEmail);

}
