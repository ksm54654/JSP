<%@ page import="java.util.ArrayList" %>
<%@ page import="java.io.Serializable" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session 영역</title>
</head>
<body>
	
	<%
	ArrayList<?> lists = (ArrayList<?>)session.getAttribute("lists");
	if(lists != null){
		out.print("<h2>페이지 이동 후 session 영역의 속성 읽기</h2>");
		for (Object str : lists)
			if(str instanceof String)
				out.print(str + "<br />");
	}
	else 
		out.print("<h1>Get out!</h1>" + "<br />");
	
// 	try{
// 		ArrayList<String> lists1 = (ArrayList<String>)session.getAttribute("lists");
// 		for (String str : lists1)
// 			out.print(str + "<br />");
// 	} catch (Exception e) {
// 		out.print("<h1>Get out!</h1>");
// 	}
	%>

</body>
</html>