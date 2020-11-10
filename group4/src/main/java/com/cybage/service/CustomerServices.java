package com.cybage.service;

import java.util.List;

import com.cybage.dao.CustomerDao;
import com.cybage.model.Sport;
import com.cybage.model.Users;

public class CustomerServices
{
	
	CustomerDao custDao = new CustomerDao(); 
	public List<Sport> getSports() throws Exception{
		System.out.println(" in cust service");
		return custDao.getSports();
	}
}
