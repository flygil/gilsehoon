/*
 * 트랜잭션 테스트용 테이블
 -------------------------
 create table tb_account (
 	id varchar2(10),
 	money number(8)
 );
 insert into tb_account(id, money) values('a', 10000);
 insert into tb_account(id, money) values('b', 20000);
 * 
 * 
 */

package advance;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.ConnectionFactory;
import util.ConnectionPool;

public class Test10 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			con.setAutoCommit(false);
			
			String sql1 = "update tb_account set money = money + 50000 where id = 'a'";
			String sql2 = "update tb_account set money = money - 50000 where id = 'b'";
			
			pstmt = con.prepareStatement(sql1);
			pstmt.executeUpdate();
			
			pstmt = con.prepareStatement(sql2);
			pstmt.executeUpdate();
			
			//정상적 수행시 commit하기
			con.commit();
			System.out.println("데이터베이스 적용 완료");
		} catch (Exception e) {
			e.printStackTrace();
			// 실행이 잘못되었을 경우 rollback 하기
			try {
				con.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		} finally {
			ConnectionFactory.close(pstmt);
			ConnectionPool.releaseConnection(con);
		}
		
	}
}



















