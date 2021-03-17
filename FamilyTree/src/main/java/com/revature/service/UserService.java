package com.revature.service;

import com.revature.pojo.User;

public interface UserService {
	
	public User createUser(User user) ;
	
	public User updateUser(User user);

	public boolean removeUser(User user);

}
