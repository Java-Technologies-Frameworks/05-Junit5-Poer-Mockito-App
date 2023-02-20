package com.jtf.junit5.service;

import com.jtf.junit5.dao.UserDao;

public class UserService {

	private UserDao userDao;
	
	public UserService() {
		
	}
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public String getNameByUserId(Integer id) {
		String name = userDao.findNameById(id); 
		return name;
	}
	
	public String getEmailByUserId(Integer id) {
		String email = userDao.findEmailById(id);
		return email;
	}
}
