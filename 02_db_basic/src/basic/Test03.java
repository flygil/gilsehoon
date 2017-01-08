package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test03 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			
			String sql = "delete from tb_board where no = 14";
			pstmt = con.prepareStatement(sql);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개행 삭제완료");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
			if (con != null) {
				try {
					con.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
}
