package com.cybage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ServletSecurity(
		value = @HttpConstraint(
				rolesAllowed = {"Admin", "Manager", "Customer"}
				)
		)
public class AppController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.isUserInRole("Admin")) {
			request.getRequestDispatcher("/admin/admin-home.jsp").forward(request, response);
		}
		if(request.isUserInRole("Manager")) {
			request.getRequestDispatcher("/manager/manager-home.jsp").forward(request, response);
		}
		if(request.isUserInRole("Customer")) {
			request.getRequestDispatcher("/customer/customer-home.jsp").forward(request, response);
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}

}
