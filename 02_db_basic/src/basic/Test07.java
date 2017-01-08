package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test07 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2단계
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			//3단계
			String sql = "delete from tb_board where no = ?";
			//4단계
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, 13);
			//5단계
			int cnt = pstmt.executeUpdate();
			//6단계
			System.out.println(cnt + "개행 삭제완료");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			//7단계
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
