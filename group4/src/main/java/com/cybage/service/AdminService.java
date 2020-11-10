package com.cybage.service;

import java.util.List;

import com.cybage.dao.AdminDao;
import com.cybage.model.Users;

public class AdminService {
	AdminDao adminDao = new AdminDao();
	public List<Users> getUsers() throws Exception{
		return adminDao.getUsers();
	}
	public int addUser(Users user) throws Exception{
		return adminDao.addUser(user);
	}
	public int deleteUser(String uName) throws Exception {
		 return adminDao.deleteUser(uName);
	}
	public Users getUser(String uName) throws Exception {
		return adminDao.getUser(uName);
		
	}
	public int updateUser(Users user) throws Exception{
		return adminDao.updateUser(user);		
	}

}
