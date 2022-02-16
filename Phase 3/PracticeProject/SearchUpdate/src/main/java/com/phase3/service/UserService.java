package com.phase3.service;

import com.phase3.entity.User;

public interface UserService {
	
	public boolean searchUser(String string);
	public boolean updateUser(User user);
	public boolean addUser(User user);
	public User getUser(int id);
	boolean searchUser(int id);
}
