package edu.kh.jsp.controller.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/todo-search")
public class TodoSearchServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		List<String> titleList = new ArrayList<String>();
		
		File file = new File("/io_test/TodoList.dat");
		
		try {
			if(file.exists()) {
				ois = new ObjectInputStream( new FileInputStream(file));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
