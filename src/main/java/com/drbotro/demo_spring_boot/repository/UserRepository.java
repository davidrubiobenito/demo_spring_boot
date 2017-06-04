package com.drbotro.demo_spring_boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.drbotro.demo_spring_boot.modelo.User;

public interface UserRepository extends CrudRepository<User, Long>{

	User findByUsername(String name);
}
