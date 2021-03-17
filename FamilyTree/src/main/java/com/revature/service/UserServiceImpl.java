package com.revature.service;

import com.revature.dao.UserDao;
import com.revature.pojo.User;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao;

	public UserServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}



	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User createUser(User user) {
		
		userDao.createUser(user);
		return user;
	}

	public User updateUser(User user) {
		
		userDao.updateUser(user);
		return null;
	}

	public boolean removeUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
