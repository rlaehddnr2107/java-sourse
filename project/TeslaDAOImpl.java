package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeslaDAOImpl implements TeslaDAO {
	PreparedStatement pstmt=null;
	ResultSet rs = null;
	@Override
	public int insert(TeslaDTO tdto) {
		Connection conn = DBConn.getConn();	
		// 추가
		int cnt=0;

		String sql = "INSERT INTO QUOTE3(TESLAMODLE3)VALUES(?) ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, tdto.getTeslamodle3());
			cnt=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public int update(TeslaDTO tdto) {
		Connection conn = DBConn.getConn();		
		int cnt=0;
		String sql = "UPDATE QUOTE3 SET TESLAMODLE3 = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, tdto.getTeslamodle3());
			cnt=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;

		
	}
}