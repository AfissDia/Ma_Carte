package com.dia.cartes.service;

import java.util.List;

import com.dia.cartes.model.User;

public interface UserService {

	public List<User> getAllUser();
	public void addUser(User u);
	public void updateUser(User u);
	public void deleteUser(int id);
	public User getUderById(int id);
	
}
