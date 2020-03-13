package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TargetServlet")
public class TargetServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("from target ser");
		String customerName = (String) req.getAttribute("customerName");
		Integer term = (Integer) req.getAttribute("noOfYear");
		Integer premiumAmount = (Integer) req.getAttribute("amount");
		double sumAssured=(premiumAmount*term)+(premiumAmount*term)*.20;
		System.out.println("ammount after maturity=="+sumAssured);
		 PrintWriter pw=resp.getWriter();
	       pw.write("<h1>your maturity amount &nbsp;&nbsp"+(sumAssured)+"<h1>");
	}
}
