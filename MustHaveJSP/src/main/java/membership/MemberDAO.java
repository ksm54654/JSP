package membership;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.JDBCConnect;

public class MemberDAO extends JDBCConnect {
	
	public MemberDAO() {}

	// 명시한 데이터베이스로의 연결이 완료된 MemberDAO 객체를 생성합니다.
	public MemberDAO(String drv, String url, String id, String pw) {
		super(drv, url, id, pw);
	}
	
	// executeQuery ------------------------------------------------
	// 명시한 아이디 / 패스워드와 일치하는 회원 정보를 반환합니다.
	public MemberDTO getMemberDTO(String uid, String upass) {

		MemberDTO dto = new MemberDTO();
		String query = "Select * from member where id = ? and pass= ?";

		Connection con = getConnection();
		if (con == null)
			return null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, uid);
			psmt.setString(2, upass);
			rs = psmt.executeQuery();

			if (rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString(3));
				dto.setRegidate(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (psmt != null) psmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return dto;
	}
	
	// 모든 회원 정보를 반환합니다.
	public ArrayList<MemberDTO> getAllMemberDTO() {
		
		Connection con = getConnection();
		if (con == null) return null;
		Statement st = null;
		ResultSet rs = null;
		
		ArrayList<MemberDTO> list = null;

		try {
			st = con.createStatement();
			rs = st.executeQuery("Select * from member");
			
			list = new ArrayList<>();

			while (rs.next()) {
				MemberDTO dto = new MemberDTO();
				// 쿼리 결과로 얻은 회원 정보를 DTO 객체에 저장
				dto.setId(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString(3));
				dto.setRegidate(rs.getString(4));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (st != null) st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return list;
	}
	
	// executeUpdate ------------------------------------------------
	// 새로운 회원을 입력합니다.
	public int insertMemberDTO(MemberDTO member) {
		String query = "insert into member(id, pass, name) values (?, ?, ?)";
		
		Connection con = getConnection();
		if (con == null) return 0;
		
		PreparedStatement psmt = null;
		int ret = 0;

		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, member.getId());
			psmt.setString(2, member.getPass());
			psmt.setString(3, member.getName());
			ret = psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null) psmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return ret;
	}
	
	// 기존 회원 정보를 변경합니다.
	public int updateMemberDTO(MemberDTO member) {
		String query = "update member set name='?' where id = '?'";
		
		Connection con = getConnection();
		if (con == null) return 0;
		
		PreparedStatement psmt = null;
		int ret = 0;

		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, member.getName());
			psmt.setString(2, member.getName());

			ret = psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null) psmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return ret;
	}
	
//	// 기존 회원을 삭제합니다.
//	public int deleteMemberDTO(String uid) {
//		Connection con = getConnection();
//		if (con == null) return null;
//	}
}
