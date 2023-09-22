<%@ page import="java.sql.Connection" %>
<%@ page import="common.JDBCConnect" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%
// JDBCConnect jdbc = new JDBCConnect();
// Connection con = jdbc.getConnection();
// jdbc.writeMemberToTalbe(con, out);
%>
<br>
<%
String driver = application.getInitParameter("H2Driver");
String url = application.getInitParameter("H2URL");
String id = application.getInitParameter("H2Id");
String pwd = application.getInitParameter("H2Pwd");

// String driver = application.getInitParameter("MySQLDriver");
// String url = application.getInitParameter("MySQLURL");
// String id = application.getInitParameter("MySQLId");
// String pwd = application.getInitParameter("MySQLPwd");
JDBCConnect jdbc1 = new JDBCConnect(driver, url, id, pwd);
Connection con1 = jdbc1.getConnection();
// jdbc1.writeMemberToTalbe(con1, out);
%>
</body>
</html>