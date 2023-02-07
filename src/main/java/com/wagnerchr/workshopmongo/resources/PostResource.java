package com.wagnerchr.workshopmongo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wagnerchr.workshopmongo.domain.Post;
import com.wagnerchr.workshopmongo.services.PostService;

@RestController
@RequestMapping(value="/posts")
public class PostResource { // Access Service 

	@Autowired
	private PostService service;
	
	// Find by Id
	@GetMapping(value="/{id}")
	public ResponseEntity<Post> findById(@PathVariable String id) {
		Post obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}		
}
