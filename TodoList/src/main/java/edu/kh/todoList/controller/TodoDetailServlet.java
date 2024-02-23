package edu.kh.todoList.controller;

import java.io.IOException;

import edu.kh.todoList.model.dto.Todo;
import edu.kh.todoList.model.service.TodoListService;
import edu.kh.todoList.model.service.TodoListServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/todo/detail")
public class TodoDetailServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		TodoListService service = null;
		
		try {
			service = new TodoListServiceImpl();
			
			// 쿼리스트링으로 전달 받은 index(파라미터) 얻어오기
			int index = Integer.parseInt(req.getParameter("index")); 
			
			// index 번째 Todo를 조회하는 서비스 호출 후 결과 반환 받기
			Todo todo = service.todoDetailView(index);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
