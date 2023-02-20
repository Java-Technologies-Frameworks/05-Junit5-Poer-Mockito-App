package com.jtf.junit5.dao;

public class UserDaoImpl implements UserDao {

	@Override
	public String findEmailById(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("findEmailById method called");
		return "javed@gmail.com";
	}

	@Override
	public String findNameById(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("findByName method called");
		return "Javed";
	}

}
