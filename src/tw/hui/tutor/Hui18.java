package tw.hui.tutor;

import java.util.List;

import tw.hui.apis.Member;
import tw.hui.apis.MemberDAO;
import tw.hui.apis.MemberDAOImpl;

public class Hui18 {
	public static void main(String[] args) {
		MemberDAO dao = new MemberDAOImpl();
		
		Member member = new Member();
		member.setEmail("rose@rose.tw");
		member.setPasswd("12345678");
		member.setName("羅斯");
//		try {
//			if (dao.addMember(member)) {
//				System.out.println("OK1");
//			}else {
//				System.out.println("XX1");
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//		}

//		try {
//			Member member1 = dao.findById(3);
//			System.out.println(member.getEmail() + ":" + member.getName());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			if (dao.delMember(3)) {
//				System.out.println("DELETE success");
//			}else {
//				System.out.println("DELETE failure");
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		try {
//			Member member2 = dao.findById(2);
//			System.out.println(member.getEmail() + ":" + member.getName());
//			member.setEmail("tony@brad.tw");
//			member.setPasswd("12345678");
//			if (dao.updateMember(member)) {
//				System.out.println("OK3");
//			}else {
//				System.out.println("XX3");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
		try {
			List<Member> members = dao.findAll();
			for (Member m : members) {
				System.out.printf("%d:%s:%s\n", m.getId(), m.getEmail(), m.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
		
		
	}
}