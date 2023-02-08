package com.wagnerchr.workshopmongo.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wagnerchr.workshopmongo.domain.Post;
import com.wagnerchr.workshopmongo.repositories.PostRepository;
import com.wagnerchr.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class PostService { // Access Repository
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow( () -> new ObjectNotFoundException("Objeto não encontrado") );
	}
	
	public List<Post> findByTitle(String text) {
		//return repo.findByTitleContainingIgnoreCase(text);
		return repo.searchTitle(text);
	}  
	
	public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
		maxDate = new Date(maxDate.getTime() + 24 * 60  * 60 * 1000);
		return repo.fullSearch(text, minDate, maxDate);
	}
}
