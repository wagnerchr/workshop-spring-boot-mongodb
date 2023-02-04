package com.wagnerchr.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wagnerchr.workshopmongo.domain.User;
import com.wagnerchr.workshopmongo.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource { // Access Service 

	@Autowired
	private UserService service;
	
	// Find all users
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		

		return ResponseEntity.ok().body(list);
	}
}
