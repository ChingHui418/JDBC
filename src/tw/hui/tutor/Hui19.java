package tw.hui.tutor;

import java.util.Scanner;

import tw.hui.apis.Member;
import tw.hui.apis.MemberDAO;
import tw.hui.apis.MemberDAOImpl;

public class Hui19 {

	public static void main(String[] args) {
		// 登入
		System.out.println("Member Login");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Email: ");
		String email = scanner.nextLine();
		System.out.print("Password: ");
		String passwd = scanner.nextLine();
		
		MemberDAO dao = new MemberDAOImpl();
		try {
			Member member = dao.login(email, passwd);
			if (member != null) {
				System.out.printf("Welcome, %s", member.getName());
			}else {
				System.out.println("Login Failure");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
