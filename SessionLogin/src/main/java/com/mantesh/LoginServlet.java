package com.mantesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet  
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		req.getRequestDispatcher("link.html").include(req, res);
		
		String name=req.getParameter("name");  
        String password=req.getParameter("password");  
        
        if(password.equals("admin123"))
        {
        	out.print("welcome" + name);
        	HttpSession session=req.getSession();
        	session.setAttribute(name, name);
        }
        else
        {
        	out.print("Sorry username or password is wrong");
        	req.getRequestDispatcher("login.html").include(req, res);  
        }
        out.close();
        
		
	}
}
