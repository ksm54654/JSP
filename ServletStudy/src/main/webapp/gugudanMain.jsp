<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gugudan Main</title>
</head>
<body>

<%

String type = request.getParameter("sel");
String val = request.getParameter("val");

if (type.equals("gugudanType1")) {
	// 	response.sendRedirect("gugudan1.jsp?dan=" + val);
	request.getRequestDispatcher("gugudan1.jsp?dan=" + val).forward(request, response);
}
else {
	// 	response.sendRedirect("gugudan2.jsp?col=" + val);
	request.getRequestDispatcher("gugudan2.jsp?col=" + val).forward(request, response);
}

// int num = Integer.parseInt(snum);

%>

<%-- 	if(s.equals("gugudanType1")){ %> --%>
<%-- 		<h3><%= num %>단입니다.</h3> --%>
<!-- 		<ul> -->
<%-- 			<% for (int i = 1; i <= 9; i++) { %> --%>
<%-- 				<li><%= num %> * <%= i %> = <%= num * i %></li> --%>
<%-- 			<% } %> --%>
<!-- 		</ul> -->
<%-- 	<% } else if(s.equals("gugudanType2")){%> --%>
<!-- 			<h2>구구단 타입 2</h2> -->
<!-- 			<ul> -->
<%-- 			<% --%>
<!--  			for (int i = 2; i <= 9; i += num) { -->
<!--  				for (int k = 1; k <= 9; k++) { -->
<!--  					for (int j = 0; j < num; j++) { -->
<!--  				if (9 < i + j) -->
<!--  					break; -->
<!-- 				out.print(String.format("%d * %d = %d	", i + j, k, (i + j) * k)); -->
<!--  				out.print("\t"); -->
<!--  					} -->
<!--  					out.print("<br>"); -->
<!--  				} -->
<!--  				out.print("<br>"); -->
<!--  			} -->
<!--  		} -->
<%-- 		%> --%>
<!-- 			</ul> -->
</body>
</html>