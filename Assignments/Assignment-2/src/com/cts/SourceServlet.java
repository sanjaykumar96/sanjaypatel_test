package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SourceServlet")
public class SourceServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("from sourcedoget servlet");
		String custName = req.getParameter("customerName");
		int term = Integer.parseInt(req.getParameter("term"));
		int premiumAmount = Integer.parseInt(req.getParameter("premium"));
		//passing values to form by key and parameter
        req.setAttribute("customerName", custName);
        req.setAttribute("noOfYear", term);
       req.setAttribute("amount", premiumAmount);
       System.out.println("your paid amount=="+(premiumAmount*term));
       PrintWriter pw=resp.getWriter();
       pw.write("<h1>your paid amount &nbsp;&nbsp"+(premiumAmount*term)+"<h1>");
       resp.sendRedirect("http://localhost:8080/WebApp3/login.html");
		//RequestDispatcher dispatcher=req.getRequestDispatcher("http://localhost:8080/WebApp3/login.html");
		//dispatcher.forward(req, resp); //paid amount not displayed in browser
		//dispatcher.include(req, resp);
	}

}
