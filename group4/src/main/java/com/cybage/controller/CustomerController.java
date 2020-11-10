package com.cybage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.Sport;

import com.cybage.service.CustomerServices;

@ServletSecurity(
		value = @HttpConstraint(
				rolesAllowed = {"Customer"}
				)
		)
public class CustomerController extends HttpServlet {
	
	CustomerServices as = new CustomerServices();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getPathInfo();
		System.out.println("inside customer controller do get method");
		
		if(path.equals("/listsport")) {			
			try {
				List<Sport> sport =  as.getSports();
				request.setAttribute("sport", sport);
				request.getRequestDispatcher("/customer/customer-sport-list.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

 	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
