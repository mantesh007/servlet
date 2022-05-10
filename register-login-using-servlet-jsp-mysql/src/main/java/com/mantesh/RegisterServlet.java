package com.mantesh;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try {
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","Mantesh@123");
		
			String n=request.getParameter("name");
			String p=request.getParameter("pass");
			String g=request.getParameter("email");
			
			PreparedStatement ps=con.prepareStatement("insert into user(name,pass,email)" + "values(?,?,?)");
			ps.setString(1,n);
			ps.setString(2,p);
			ps.setString(3,g);
			
			int i=ps.executeUpdate();
			if(i>1)
			{
				
				out.println("<font color=red size=18> Login Failed!<br>");
				out.println("<a href=register.jsp>Try AGAIN!</a>");
			}
			else
			{
				
				
				
				RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
			
				
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			
		
	}


		
	}

