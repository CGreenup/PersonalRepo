package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {
	//To have functionality I need to override the service method (bad practice) or at least one "do" method
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String URI = request.getRequestURI();
		System.out.println(URI);
		
		//Responses come with a method to create a Print Writer to write the body of the response
		PrintWriter pw = response.getWriter();
		pw.print("<h1>Hello from that Jenkin's tested doGet method!</h1>");
		
		return;
	}
	
}
