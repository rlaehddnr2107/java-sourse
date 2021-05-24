package ex07_jdbc.sales;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void test() {
		SalesDAO sdao=new SalesDAO();
		List<Map<String, Object>> list= sdao.dayItemSalesList();
//		System.out.println(list);
//		//출력
//		for(Map<String,Object> map:list) {
//			System.out.println(map.get("itemcode"+"itemname"+"qyt"+"amount"+"saledate"+"seq"));
			 
		}
	@Test
	void test2() {
		SalesDAO sdao = new SalesDAO();
		
		String saledate = "20210429";
		saledate = saledate.substring(0,4)+"-"
				+saledate.substring(4, 6)+ "-"
				+saledate.substring(6);
		System.out.println(saledate);
		
		List<Map<String, Object>> list = sdao.dayItemSalesTotal("2021-04-29");
		System.out.println(list);
	}
		
		
		
		
		
		
}



























