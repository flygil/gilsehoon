package advance;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.ConnectionFactory;
import util.ConnectionPool;

public class Test06 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			
			con = ConnectionPool.getConnection();
			
			String sql = "update tb_board set title='연습중' where no = 13";
			pstmt = con.prepareStatement(sql);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt +"개행 업데이트완료");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(pstmt);
			ConnectionPool.releaseConnection(con);
		}
	}
}
