package com.dia.cartes.dao;

import org.springframework.data.repository.CrudRepository;

import com.dia.cartes.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
}
