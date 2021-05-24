package ex07_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J20210427_01_emp {

	public static void main(String[] args) {
		// 사원테이블에서 년봉이 10000이상인 사원의 
		//아이디 성 연봉을 조회 
		Connection con = DBConn.getConn();
		List<EmployeesDTO> list = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			String sql ="SELECT EMPLOYEE_ID , FIRST_NAME, HIRE_DATE, SALARY\r\n" + 
					"FROM EMPLOYEES\r\n" + 
					"WHERE SALARY >= 10000\r\n" + 
					"ORDER BY SALARY DESC";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
				
				String employee_ID = rs.getString("employee_ID");
				String FIRST_NAME = rs.getString("FIRST_NAME");
				
				int SALARY=rs.getInt("SALARY");
				EmployeesDTO rdto = new EmployeesDTO(employee_ID,FIRST_NAME,SALARY);
				
				
				list.add(rdto);
			}
			
		} catch (SQLException e) {
			System.out.println("sql예외");
			e.printStackTrace();
		}finally { //예외가 발생 하든지 안하든지 무조건 실행
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	
	 }
	}

}