<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String type = request.getParameter("col");
	
	int col = 3;
	if(type != null) col = Integer.parseInt(type);
	if(col == 0) col = 3;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gugudan Type2 (JSP)</title>
</head>
<body>
	<h2>구구단 타입 2</h2>
	<ul>
	<%
	for (int i = 2; i <= 9; i+= col) {
		for (int k = 1; k <=9; k++) {
			for (int j = 0; j < col; j++) { 
				if(9 < i + j ) break; 
				out.print(String.format("%d * %d = %d	", i + j, k, (i+j)*k));
				out.print("\t");
			}
			out.print("<br>");
		}
		out.print("<br>");
	}
	%>
				 
	
<%-- 	<% for (int i = 2; i <=9; i++) { %> --%>
<%-- 		<% for (int j = 1; j <=9; j++) { %> --%>
<%-- 			<%= i %> * <%= j %> = <%= i * j %> --%>
<%-- 			<% out.print("<br/>"); %> --%>
<%-- 		<% } %> --%>
<%-- 	<% } %> --%>
	</ul>
</body>
</html>