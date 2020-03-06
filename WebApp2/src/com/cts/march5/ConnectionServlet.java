package com.cts.march5;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;


public class ConnectionServlet extends HttpServlet {
	String user, password, url, driver;
	Connection conn;

	@Override
	public void init(ServletConfig config) throws ServletException {
		user = config.getInitParameter("userName");
		password = config.getInitParameter("password");
		url = config.getInitParameter("url");
		driver = config.getInitParameter("driver");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(url, user, password);
			System.out.println(conn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		if (req.getMethod().equals("GET")) {
			doGet(req, resp);
		} else {
			doPost(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String n = req.getParameter("un");
		String p = req.getParameter("ln");
		String o = req.getParameter("pwd");
		String e = req.getParameter("userEmail");
		String c = req.getParameter("userCountry");
		
		try{  
			
			  
			PreparedStatement ps=(PreparedStatement) conn.prepareStatement(  
			"insert into registeruser values(?,?,?,?,?)");  
			  
			ps.setString(1,n);  
			ps.setString(2,p);  
			ps.setString(3,o);  
			ps.setString(4,e);
			ps.setString(5,c); 
			          
			int i=ps.executeUpdate();  
			if(i>0)  
			System.out.println("You are successfully registered...");  
			      
			          
			}catch (Exception e2) {System.out.println(e2);}  
			          
			out.close();  
			}  
	

}
