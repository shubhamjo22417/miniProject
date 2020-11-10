package com.cybage.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.model.Users;
import com.cybage.service.AdminService;

@ServletSecurity(
		value = @HttpConstraint(
				rolesAllowed = {"Admin"}
				)
		)
public class AdminController extends HttpServlet {

	AdminService as = new AdminService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in admin controller");
		String path = request.getPathInfo();
		if(path.equals("/listuser")) {			
			try {
				List<Users> xyz =  as.getUsers();
				request.setAttribute("user", xyz);
				request.getRequestDispatcher("/admin/admin-user.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(path.equals("/adduser")) {			
			try {
				
				Users user = new Users();
				
				user.setuName(request.getParameter("uName"));
				user.setuPassword(request.getParameter("uPassword"));
				user.setuRole(request.getParameter("uRole"));
				user.setuEmail(request.getParameter("uEmail"));
				user.setuNumber(request.getParameter("uNumber"));
				as.addUser(user);
				System.out.println(user.toString());
				response.sendRedirect("listuser");								
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(path.equals("/deleteuser")) {			
			try {
				as.deleteUser(request.getParameter("uName"));
				request.setAttribute("deletemsg", "User deleted successfully");
				response.sendRedirect("listuser");								
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(path.equals("/edituser")) {			
			try {
				Users user = as.getUser(request.getParameter("uName"));
				request.setAttribute("user", user);
				request.getRequestDispatcher("/admin/update-user.jsp").forward(request, response);								
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(path.equals("/updateuser")) {			
			try {
				Users user = new Users();
				user.setuName(request.getParameter("uName"));
				user.setuPassword(request.getParameter("uPassword"));
				user.setuRole(request.getParameter("uRole"));
				
				as.updateUser(user);
				response.sendRedirect("listuser");										
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
