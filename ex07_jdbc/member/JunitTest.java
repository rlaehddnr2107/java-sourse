package ex07_jdbc.member;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//단위테스트
class JunitTest {
	MemberDAO mdao = new MemberDAO(); //객체 생성
	
	@Test
	void testSelectList() {
		
		
		//assertNotNull(mlist);
	}

	@Test
	void testSelectOne() {
		
		//assertNotNull(mdto);
	}

	@Test
	void testInsert() {
		String userid = "park";
		String passwd = "1111";
		int birthyear = 2006;
		MemberDTO mdto = new MemberDTO(userid, passwd, birthyear);
		int cnt = mdao.insert(mdto);
		//cnt가 0이 아니면 성공
		//assertNotEquals(0,cnt);
		//cnt가 1이면 성공
		assertEquals(1, cnt);
	}

	@Test
	void testUpdate() {
		String userid = "yyyyy";
		String passwd = "2222";
		int birthyear = 2010;
		MemberDTO mdto = new MemberDTO(userid, passwd, birthyear);
		int cnt = mdao.update(mdto);
		assertEquals(1, cnt);
	}

	@Test
	void testDelete() {
		String userid = "JAVA";
		int cnt=mdao.delete(userid);
		assertEquals(1, cnt);//실패
	}

}