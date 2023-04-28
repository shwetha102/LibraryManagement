package com.bitlabs.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlabs.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
