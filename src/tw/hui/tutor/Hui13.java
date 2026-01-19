package tw.hui.tutor;

import java.util.List;

import tw.hui.apis.Gift;
import tw.hui.apis.JdbcTool;
import tw.hui.apis.Member;

public class Hui13 {

	public static void main(String[] args) {
		JdbcTool tool = new JdbcTool();
		String sql = """
				SELECT email, name
				FROM member
				""";
	

		
		List<Member> gifts = tool.query(sql, rs -> {
			Member member = new Member();
			member.setName(rs.getString("name"));
			member.setEmail(rs.getString("email"));
			return member;
		});
		
		gifts.forEach(System.out::println);
	
	
	}

}
