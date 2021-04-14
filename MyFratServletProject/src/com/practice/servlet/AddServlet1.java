package com.practice.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet1 extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) {
		String userName=request.getParameter("uid");
		String password=request.getParameter("pid");
		System.out.println("userName");
		System.out.println("Password");
	}

}
