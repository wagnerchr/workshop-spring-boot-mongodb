package com.wagnerchr.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wagnerchr.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
