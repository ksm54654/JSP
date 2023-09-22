<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
public int add(int num1, int num2) {
	return num1 + num2;
}


%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트 요소</title>
</head>
<body>
<%

String num1 = request.getParameter("num1");
String num2 = request.getParameter("num2");
int snum1;
int snum2;
snum1 = Integer.parseInt(num1);
snum2 = Integer.parseInt(num2);

int result = add(snum1, snum2);

%>
덧셈 결과 : <%= result %> <br />
</body>
</html>