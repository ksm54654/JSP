package fileupload;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;


import common.JDBCConnect2;

public class MyfileDAO extends JDBCConnect2 {
	public int insertFile(MyfileDTO dto) {
		
		Connection con = getConnection();
		if(con == null) return 0;
		
		PreparedStatement psmt = null;
		
		int applyResult = 0;
		try {
			String query = "insert into myfile (name, title, cate, ofile, sfile) "
					+ "values (?, ?, ?, ?, ?)";
			
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getTitle());
			psmt.setString(3, dto.getCate());
			psmt.setString(4, dto.getOfile());
			psmt.setString(5, dto.getSfile());
			
			applyResult = psmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("INSERT 중 예외 발생");
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return applyResult;
	}
	
	public List<MyfileDTO> myFileList(){
		
		List<MyfileDTO> fileList = new Vector<MyfileDTO>();

		Connection con = getConnection();
		if(con == null) return fileList;
		
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		
		String query = "select * from myfile order by idx desc";
		try {
			psmt = con.prepareStatement(query);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				MyfileDTO dto = new MyfileDTO();
				dto.setIdx(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setCate(rs.getString(4));
				dto.setOfile(rs.getString(5));
				dto.setSfile(rs.getString(6));
				dto.setPostdate(rs.getString(7));
				
				fileList.add(dto);
			}
		}
		catch (Exception e) {
			System.out.println("SELECT 시 예외 발생");
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (rs != null)
					rs.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return fileList;
	}
	
	public static void main(String[] args) {
		// 1. 데이터 입력 객체를 만들고
		MyfileDAO dao = new MyfileDAO();

		//------------------------------------------------------------
		// 2. DTO객체를 생성해서 입력한다.		
//		dao.insertFile(new MyfileDTO("a1", "b", "c", "d", "e"));
//		dao.insertFile(new MyfileDTO("a2", "b", "c", "d", "e"));
//		dao.insertFile(new MyfileDTO("a3", "b", "c", "d", "e"));
		
		//------------------------------------------------------------
//		// 2. 데이터 입력 객체를 만들고
//		MyfileDAO dao = new MyfileDAO();
//		
//		// 2. 입력할 DTO객체를 만들고
//		MyfileDTO dto = new MyfileDTO();
//		
//		// 3. 입력할 내용을 DTO 객체에 설정하고
//		dto.setName("name");
//		dto.setTitle("1");
//		dto.setCate("1");
//		dto.setOfile("1");
//		dto.setSfile("1.1");
//
//		// 4. 데이터 입력한다.		
//		dao.insertFile(dto);
		//------------------------------------------------------------
		
		// 2. 데이터베이스 데이터를 읽어서 출력해 본다. ==> 메소드 myFileList를 테스트하기 위함.
		List<MyfileDTO> list = dao.myFileList();
		for (MyfileDTO dto : list) {
			System.out.println(dto);
		}
		System.out.println("Done");
	}
}
