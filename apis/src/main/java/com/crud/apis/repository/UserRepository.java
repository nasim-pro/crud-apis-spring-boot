package com.crud.apis.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.crud.apis.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
}