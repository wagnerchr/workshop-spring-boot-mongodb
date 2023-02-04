package com.wagnerchr.workshopmongo.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wagnerchr.workshopmongo.domain.User;
import com.wagnerchr.workshopmongo.repositories.UserRepository;

@Service
public class UserService { // Access Repository
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
