package membership;

import java.util.ArrayList;

public class MemberDAOTest {

	private static MemberDAO memberDAO = new MemberDAO();

	public static void printMemberDTO() {
		// Test getMemberDTO()
		MemberDTO memberDTO = memberDAO.getMemberDTO("test1", "1111");
		System.out.println(memberDTO);
	}

	public static void printAllMemberDTO() {
		// Test getAllMemberDTO()
		ArrayList<MemberDTO> list = memberDAO.getAllMemberDTO();
		for (MemberDTO m : list) {
			System.out.println(m);
		}
	}
	
	public static void insertMemberDTO() {
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("Hong");
		memberDTO.setPass("1234");
		memberDTO.setName("홍길동");
		memberDAO.insertMemberDTO(memberDTO);
	}

	public static void main(String[] args) {

//		printMemberDTO();
		printAllMemberDTO();
		
		System.out.println("-".repeat(80));
		
		insertMemberDTO();
		printAllMemberDTO();
		
		System.out.println("-".repeat(80));
	}
}