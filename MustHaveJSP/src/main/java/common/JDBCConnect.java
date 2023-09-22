package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.jsp.JspWriter;

public class JDBCConnect {

	// H2
	//	driver = "org.h2.Driver";
	//	url = "jdbc:h2:tcp://localhost/~/telephone";
	//	id = "scott";
	//	pwd = "tiger";
	
	public Connection con;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs;
	    
	private String driver;
	private String url;
	private String id;
	private String pwd;
	
	
	public JDBCConnect() {
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/musthave";
		id = "musthave";
		pwd = "tiger";
	}
	
	public JDBCConnect(String driver, String url, String id, String pwd) {
		this.driver = driver;
		this.url = url;
		this.id = id;
		this.pwd = pwd;
	}
	
	public JDBCConnect(ServletContext app) {
		driver = app.getInitParameter("MySQLDriver");
		url = app.getInitParameter("MySQLURL");
		id = app.getInitParameter("MySQLId");
		pwd = app.getInitParameter("MySQLPwd");
	}
	
//	public Connection getConnection() throws Exception{
//		Class.forName(driver);
//		return DriverManager.getConnection(url, id, pwd); 
//	}
	
	public Connection getConnection() {
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, id, pwd);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void closeConnection(Connection con) {
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	public void printMember(Connection con) throws Exception {
//		
//		
//	}
	
//	public void writeMemberToTalbe(Connection con, JspWriter out) {
//		Statement st = null;
//		ResultSet rs = null;
//		
//		try {
//			out.write("<table>");
//			out.write("<tr>");
//			out.write("<td>CID</td><td>NAME</td><td>CLASSIFICATION</td><td>ADDRESS</td><td>RECTAL</td><td>BIRTHDAY</td>");
////			out.write("<td>id</td><td>pass</td><td>name</td><td>regidate</td>");
//			out.write("</tr>");
//			
//			st = con.createStatement();
//			rs = st.executeQuery("Select * from contact");
////			rs = st.executeQuery("Select * from member");
//			
//			while(rs.next()) {
//				out.write("<tr>");
//				out.write("<td>");	out.write(rs.getString("CID"));				out.write("</td>");
//				out.write("<td>");	out.write(rs.getString("NAME"));			out.write("</td>");
//				out.write("<td>");	out.write(rs.getString("CLASSIFICATION"));	out.write("</td>");
//				out.write("<td>");	out.write(rs.getString("ADDRESS"));			out.write("</td>");
//				out.write("<td>");	out.write(rs.getString("RECTAL"));			out.write("</td>");
//				out.write("<td>");	out.write(rs.getString("BIRTHDAY"));		out.write("</td>");
//				
////				out.write("<td>");	out.write(rs.getString("id"));			out.write("</td>");
////				out.write("<td>");	out.write(rs.getString("pass"));		out.write("</td>");
////				out.write("<td>");	out.write(rs.getString("name"));		out.write("</td>");
////				out.write("<td>");	out.write(rs.getString("regidate"));	out.write("</td>");
//			}
//			out.write("</table>");
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (rs != null) rs.close();
//				if (st != null) st.close();
////				if (psmt != null) psmt.close();
//				if (con != null) con.close();
//				
//				System.out.println("JDBC 자원 해제");
//			}
//			catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	public static void main(String[] args) {
//		JDBCConnect jdbcConnect = new JDBCConnect();
//		Connection con = jdbcConnect.getConnection();
//		
//		jdbcConnect.printMember(con);
//		jdbcConnect.printBoard(con);
//		con.close();
//	}


}
