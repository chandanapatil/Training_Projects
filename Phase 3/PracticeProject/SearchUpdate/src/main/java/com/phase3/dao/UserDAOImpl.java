package com.phase3.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phase3.entity.User;
import com.phase3.repository.UserRepository;

@Service
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	private UserRepository repo;
	

	@Override
	public boolean searchUser(int id) {
		Optional<User> user = repo.findById(id);
		if(user.isPresent()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		repo.save(user);
		return true;
	}

	@Override
	public boolean addUser(User user) {
		repo.save(user);
		return true;
	}

	@Override
	public User getUser(int id) {
		return repo.findById(id).get();
	}

}
