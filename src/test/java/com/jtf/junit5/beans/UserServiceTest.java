package com.jtf.junit5.beans;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.powermock.api.mockito.PowerMockito;

import com.jtf.junit5.dao.UserDao;
import com.jtf.junit5.service.UserService;

public class UserServiceTest {

	@Test
	public void testGetNameByUserId() {
		//create a dummy or mock object
		UserDao mockUserDao = PowerMockito.mock(UserDao.class);
		// define the behavior for my mock object // when i am passing 101 give me "Javed".
		PowerMockito.when(mockUserDao.findNameById(101)).thenReturn("Javed"); // it will not call the real data base 
		// dummy or mock object I am injecting here using constructor injection. Now my private UserDao userDao; holds mock Object not real obj.
		UserService userService = new UserService(mockUserDao);
		// when we call getNameByUserId by passing 101 . Inside getNameByUserId(101) my userDao hold mock object. from mock it will give Javed
		String name =userService.getNameByUserId(101); // return "Javed"
		assertEquals("Javed", name); //expected "Javed" will match with actual mock object returned value "Javed"		
	}
	
	@Test
	public void testGetEmailByUserId() {
		UserDao mockUserDao = PowerMockito.mock(UserDao.class);
		PowerMockito.when(mockUserDao.findEmailById(101)).thenReturn("javed91@gmail.com");
		UserService userService = new UserService(mockUserDao);
		String emailId =userService.getEmailByUserId(101);
		assertEquals("javed91@gmail.com", emailId);
	}
}
