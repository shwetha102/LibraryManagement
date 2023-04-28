package com.bitlabs.Service;


import com.bitlabs.Entity.*;
import com.bitlabs.Repo.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public List<User> getAllUsers(){
		return this.userRepo.findAll();
	}
}
