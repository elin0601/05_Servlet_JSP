<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>${todo.title}</title>

	<style>
		.detail{
			while-space : pre-wrap;
		}
	</style>
</head>
<body>

	<ul>

		<li>���� : ${todo.title}</li>
		<li>�Ϸ� ���� : 
			<c:if test="${todo.complete}">O</c:if>
			<c:if test="${not todo.complete}">X</c:if>
		</li>

		<li>����� : %{todo.regDate}</li>

		<li class="detail">${todo.detail}</li>

	</ul>

</body>s
</html>