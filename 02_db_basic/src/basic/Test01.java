package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test01 {
	public static void main(String[] args){
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//1단계. 드라이버로딩
			//오라클 드라이버 클래스명 : 오라클제공
			//ojdbc14.jar에 포함된 클래스명(패키지포함)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			//2단계. 연결객체 얻어오기
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			System.out.println("연결정보 : " + con);
			//3단계. SQL문 작성하기
			String sql = "insert into tb_board(no, title, writer, content) "
							+ "values(s_board_no.nextval,'test','hong','exam')";
			//4단계. SQL실행 객체 얻기
			//Statement <- PreparedStatement (컴파일된거 재활용?) <- CallableStatement
			pstmt = con.prepareStatement(sql);
			
			//5단계. SQL실행
			//int executeUpdate : select문 이외의 쿼리
			//ResultSet executeQuery : select문
			
			int cnt = pstmt.executeUpdate();
			
			//6단계. 결과처리
			System.out.println(cnt + "개의 행이 변경되었습니다.");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (pstmt != null) 
				try {
					pstmt.close();
				} catch (Exception e2) {
					// TODO: handle exception
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
