package tw.hui.tutor;

import tw.hui.apis.BCrypt;

public class Hui09 {

	public static void main(String[] args) {
		String passwd = "12345678";
		String hashPassword = BCrypt.hashpw(passwd, BCrypt.gensalt());
		System.out.println(hashPassword);
		
		String input = new String("12345678");
		if(BCrypt.checkpw("12345678", hashPassword)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}

	}

}
