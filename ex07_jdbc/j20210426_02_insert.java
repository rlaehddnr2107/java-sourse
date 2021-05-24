package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class j20210426_02_insert {

	public static void main(String[] args) {
		//오라클에 데이터추가 :insert
		Connection conn = DBConn.getConn();
		PreparedStatement pstmt=null;
		//Statement stmt =null;
		//입력 받기
		 Scanner sc=new Scanner(System.in);
		 System.out.println("추가하실 코드를 입력하시오");
		 String itemcode=sc.next();
		 sc.nextLine();
		 System.out.println("추가하실 제품명을 입력하시오");
		 String itemname=sc.next();
		 System.out.println("추가하실 제품의 가격을 입력하시오");
		 int price =sc.nextInt();
	
		
//		String sql = "INSERT INTO ITEM (ITEMCODE, ITEMNAME, PRICE) VALUES("  
//					+ "'" + itemcode +"', '" + itemname + "', " + price + ")";

		String sql = "INSERT INTO ITEM (ITEMCODE, ITEMNAME, PRICE) VALUES(?,?,?)";

		System.out.println(sql);
		
		try {
			pstmt = conn.prepareStatement(sql);
			//sql문의 ?에 값 대치
			pstmt.setString(1, itemcode);
			pstmt.setString(2,  itemname);
			pstmt.setInt(3, price);
			
			int cnt = pstmt.executeUpdate(); //적용된 건수를 반환
			System.out.println(cnt+"건 추가");
		} catch (SQLException e) {
			System.out.println("sql문 예외");
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}
