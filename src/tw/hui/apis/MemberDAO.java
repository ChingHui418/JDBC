package tw.hui.apis;

import java.util.List;

// 定義介面
public interface MemberDAO {
	boolean addMember(Member member) throws Exception;
	boolean updateMember(Member member) throws Exception;
	boolean delMember(long id) throws Exception;
	Member findById(long id) throws Exception;
	List<Member> findAll() throws Exception;
	Member login(String email, String passwd) throws Exception;
}
