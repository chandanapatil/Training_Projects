package com.phase3.dao;

import com.phase3.entity.User;

public interface UserDAO {
	
	public boolean searchUser(int id);
	public boolean updateUser(User user);
	public boolean addUser(User user);
	public User getUser(int id);
}
