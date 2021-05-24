package project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TeslaTest {

	@Test
	void test() {
		TeslaDAO tdao = new TeslaDAOImpl();
		TeslaDTO tdto = new TeslaDTO();
		int cnt = tdao.insert(tdto);
		System.out.println(cnt +"건 수정");
		
	}

}
