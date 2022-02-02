package com.dia.cartes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dia.cartes.dao.UserRepository;
import com.dia.cartes.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository repo;
	@Override
	public List<User> getAllUser() {
		List<User> lst= new ArrayList<User>();
		for(User user : repo.findAll()) {
			lst.add(user);
		}
		return lst;
	}

	@Override
	public void addUser(User u) {
		repo.save(u);	
	}
	@Override
	public void updateUser(User u) {
		repo.save(u);
	}

	@Override
	public void deleteUser(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public User getUderById(int id) {
		return repo.findById(id).get();
	}

}
