package com.example.springBootProject.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.springBootProject.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
