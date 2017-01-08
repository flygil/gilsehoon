package advance;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.ConnectionPool;

public class Test07 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			
			con = ConnectionPool.getConnection();
			
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
			
			ConnectionPool.releaseConnection(con);
		}
	}
}
