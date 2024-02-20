package edu.kh.servlet.controller2;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ExampleServletP1 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pirimumPizza = req.getParameter("pirimumPizza");
		String pizza = req.getParameter("pizza");
		
		String[]  topping = req.getParameterValues("topping");
		String[]  opt = req.getParameterValues("opt");
		
		String orderName = req.getParameter("orderName");
		String orderAddress = req.getParameter("orderAddress");
		String orderRequest = req.getParameter("orderRequest");
		
		System.out.println("피자먹고싶네");
		
		int price = 0;
	
		
		
		
	}

}
