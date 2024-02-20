package edu.kh.servlet.controller2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ExampleServletP1 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String primumPizza = req.getParameter("primumPizza");
		String pizza = req.getParameter("pizza");
		
		String[] toppingOption = req.getParameterValues("topping");
		String[] otherOption = req.getParameterValues("opt");
		
		String orderName = req.getParameter("orderName");
		String orderAddress = req.getParameter("orderAddress");
		String orderRequest = req.getParameter("orderRequest");
		
		System.out.println("피자먹고싶네");
		
		int price = 0;
	
		switch (primumPizza) {
		case "브리스킷 바비Q" : price += 29000;
			break;
		case "치즈 크레이프 샌드" : price += 29000;
			break;
		case "블랙타이거 슈림프" : price += 30000;
			break;
		case "와일드 와일드 웨스트 스테이크" : price += 28000;
			break;
		case "베시트 콰트로" : price += 29500;
			break;

		}
		
		
		switch (pizza) {
		case "페퍼로니" :price += 18500;
			break;

		case "포페이토" : price += 20500;
			break;

		case "우리 고구마" : price += 23500;
			break;

		case "뉴욕 오리진" :price += 22500;
			break;

		case "치즈" : price += 16500;
			break;

		}
		
		
		if(toppingOption != null) {
			for(String topping : toppingOption ) {
				
				switch(topping) {
				case "새우" : price += 3000; break;
				case "치즈" : price += 2000; break;
				case "야채" : price += 1000; break;
				
				}
			}
		}
		
		if(otherOption != null) {
			for(String opt : otherOption) {
				
				switch(opt) {
				case "콜라" : price += 2500; break;
				case "피클" : price += 2500; break;
				case "고구마 엣지" : price += 3000; break;
				case "치즈 엣지" : price += 3000; break;
				}
			}
		}
		
		resp.setContentType("text/html; charse=utf-8");
		
		PrintWriter out = resp.getWriter();
		StringBuilder sb = new StringBuilder();
		
		sb.append("<!DOCTYPE html>");
		sb.append("<html>");
		sb.append("  <head>");
		sb.append("   <title>");
		sb.append("<h3> ORDERLIST(주문 내역) </h3>");
		sb.append("   </title>");
		sb.append("  </head>");	
		
		sb.append("  <body>");		
		sb.append(String.format("<h3>주문자명 : %s</h3>", orderName));
		sb.append(String.format("<h3>주소 : %s</h3>", orderAddress));
		sb.append(String.format("<h3>요청사항 : %s</h3>", orderRequest));
		
		sb.append(String.format("<li>피자 : %s</li>", primumPizza));
		sb.append(String.format("<li>피자 : %s</li>", pizza));
		
		if(toppingOption != null) {			
			sb.append("추가 토핑 선택 : ");
			for(String topping : toppingOption ) 
				sb.append(topping + ", ");
		}
		
		if(otherOption != null) {
			sb.append("다른 옵션 선택 : ");
			for(String opt : otherOption) 
				sb.append(opt + ", ");
		}
		sb.append(String.format("<h3>금액 : %d 원</h3>", price));
		
		sb.append("  </body>");
			
		sb.append("</html>");
		
		out.print(sb.toString());
			
		
	}

}
