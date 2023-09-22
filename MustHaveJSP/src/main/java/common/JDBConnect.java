package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class JDBConnect {
	public static Connection con;
	public static Statement stmt;
	public PreparedStatement psmt;
	public static ResultSet rs;
	
	public JDBConnect() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/musthave";
			String id = "musthave";
			String pwd = "tiger";
			con = DriverManager.getConnection(url, id, pwd);
			
			System.out.println("DB 연결 성공(기본 생성자)");
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
			if (psmt != null) psmt.close();
			if (con != null) con.close();
			
			System.out.println("JDBC 자원 해제");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		JDBConnect jdbConnect = new JDBConnect();
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("Select * from member");
		
			while (rs.next()) {
				System.out.println(String.format("%s, %s, %s, %s", rs.getString("id"), rs.getString("pass"), rs.getString("name"), rs.getString("regidate")));
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		jdbConnect.close();
		
		
		
	}
	
	
}
