package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		float a = Float.parseFloat(request.getParameter("num1"));
		float b = Float.parseFloat(request.getParameter("num2"));
		String op = request.getParameter("operator");
		float c = 0;
		
		switch (op) {
		case "/":
		{
			c = a/b;
			System.out.println(a+"/"+b+" = "+c);
			break;
		}
		case "*":
		{
			c = a*b;
			System.out.println(a+"*"+b+" = "+c);
			break;
		}
		case "-":
		{
			c = a-b;
			System.out.println(a+"-"+b+" = "+c);
			break;
		}
		case "+":
		{
			c = a+b;
			System.out.println(a+"+"+b+" = "+c);
			break;
		}
		default:
			System.out.println("Incorrect input...");
			break;
		}
		
		out.print(a+"+"+b+" = "+c);
	}

}
