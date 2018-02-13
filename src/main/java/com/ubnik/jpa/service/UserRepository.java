package com.ubnik.jpa.service;

import com.ubnik.jpa.jpapractice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
