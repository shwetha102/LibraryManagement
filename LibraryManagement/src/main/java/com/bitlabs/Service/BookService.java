package com.bitlabs.Service;


import com.bitlabs.Entity.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlabs.Repo.ChildrenRepository;
import com.bitlabs.Repo.FictionRepository;
import com.bitlabs.Repo.NonFictionRepository;
import com.bitlabs.Repo.YouthRepository;

@Service
public class BookService {

	@Autowired
	private ChildrenRepository childrenRepo;
	
	@Autowired
	private FictionRepository  fictionRepo;
	@Autowired
	private NonFictionRepository nonFictionRepo;
	@Autowired
	private YouthRepository youthRepo;
	
	public List<ChildrenBook> getAllChildBook(){
		return this.childrenRepo.findAll();
	}
	
	public List<FictionBook> getAllFictionBook(){
		
		return this.fictionRepo.findAll();
	}
	public List<NonFictionBook> getAllNonFictionBook(){
		return this.nonFictionRepo.findAll();
	}
	
	public List<YouthBook> getAllYouthBook(){
		return this.youthRepo.findAll();
	}
}

