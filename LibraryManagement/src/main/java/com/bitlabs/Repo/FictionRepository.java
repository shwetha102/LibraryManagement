package com.bitlabs.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlabs.Entity.*;

public interface FictionRepository extends JpaRepository<FictionBook, Integer> {

}
