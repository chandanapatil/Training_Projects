package com.phase3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phase3.dao.UserDAO;
import com.phase3.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDAO userDAO;
	

	@Override
	public boolean searchUser(int id) {
		if(userDAO.searchUser(id)) {
			return true;
		}
		return false;
		
	}

	@Override
	public boolean updateUser(User user) {
		if(userDAO.updateUser(user)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean addUser(User user) {
		if(userDAO.addUser(user)) {
			return true;
		}
		return false;
	}

	@Override
	public User getUser(int id) {
		return userDAO.getUser(id);
	}

	@Override
	public boolean searchUser(String string) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
