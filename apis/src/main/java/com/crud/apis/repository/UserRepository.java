package com.crud.apis.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.crud.apis.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}