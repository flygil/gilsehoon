package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Test08 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		List<BoardVO> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE" , "hr", "hr");
			
			String sql = "select no, title, writer, reg_date "
							+"from tb_board "
							+"order by no desc";
			
			pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setNo(rs.getInt("no"));
				vo.setTitle(rs.getString("title"));
				vo.setWriter(rs.getString("writer"));
				//시분초 정보가 없음
				//vo.setRegDate(rs.getDate("reg_date"));
				//시분초 정보를 유지하기위해
				vo.setRegDate(rs.getTimestamp("reg_date"));
				
				list.add(vo);
			}
			for (BoardVO vo : list) {
				System.out.printf("%d\t%s\t%s\t%s\n", 
						vo.getNo(), vo.getTitle(), vo.getWriter(), sdf.format(vo.getRegDate()));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
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
