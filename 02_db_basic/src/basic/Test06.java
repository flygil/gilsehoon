package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test06 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2단계
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			//3단계
			String sql = "update tb_board set title=? where no = ?";
			//4단계
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, "사랑해");
			pstmt.setInt(2, 13);
			//5단계
			int cnt = pstmt.executeUpdate();
			//6단계
			System.out.println(cnt +"개행 업데이트완료");
			
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
					e2.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
}
