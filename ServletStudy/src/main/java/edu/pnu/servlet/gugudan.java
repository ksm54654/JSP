package edu.pnu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/gugudan")
public class gugudan extends HttpServlet {

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		
		res.setContentType("text/html; charset = utf-8");
		PrintWriter out = res.getWriter();
		
		out.println("<h1>2단입니다.</h1>");
	
		int num = 2;
		out.println("<ul>");
		for(int i = 1; i < 10; i++) {
			out.println("<li>");
			out.println(num + " * " + i + " = " + (num * i));
			out.println("</li>");
		}
		out.println("</ul>");
	}
}
