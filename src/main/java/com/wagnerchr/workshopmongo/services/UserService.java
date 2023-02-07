package com.wagnerchr.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wagnerchr.workshopmongo.domain.User;
import com.wagnerchr.workshopmongo.dto.UserDTO;
import com.wagnerchr.workshopmongo.repositories.UserRepository;
import com.wagnerchr.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class UserService { // Access Repository
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow( () -> new ObjectNotFoundException("Objeto não encontrado") );
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
	}
	
}
