package com.dantasdevops.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dantasdevops.Course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

	
}
