package edu.kh.jsp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/search")
public class SearchServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<String> nameList = new ArrayList<String>();
		nameList.add("김이름");
		nameList.add("이이름");
		nameList.add("박이름");
		nameList.add("정이름");
		nameList.add("성이름");
		nameList.add("장이름");
		nameList.add("최이름");
		nameList.add("손이름");
		nameList.add("백이름");
		nameList.add("강이름");
		
		// List에 입력 받은 이름(파라미터)가 존재하는지 확인
		
		String inputName = req.getParameter("inputName");
		
		if(nameList.contains(inputName)) {
			
			String searchMessage = String.format("%s은/는 %d 번째 인덱스에 존재 합니다", inputName, nameList.indexOf(inputName));
			
			// forward 시 resquest 가 유지된다.
			req.setAttribute("searchMessage", searchMessage);
			
			String path = "/WEB-INF/views/practice/search_result.jsp";
			
			req.getRequestDispatcher(path).forward(req, resp);
			
		} else {
			
			String serchMessage = inputName + "은/는 존재하지 않습니다";
			
			HttpSession session = req.getSession();
			session.setAttribute("searchMessage", serchMessage);
			
			// "/error" redirect
			resp.sendRedirect("/error"); // redirect는 무조건 GET 방식
		}
	}

}
