package com.wagnerchr.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wagnerchr.workshopmongo.domain.User;


public interface UserRepository extends MongoRepository<User, String> {

}
