package boardDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import boardVO.BoardVO;
public class BoardDAO {
	private List<BoardVO> list = new ArrayList<>();
	Connection con = null;
	PreparedStatement pstmt = null;
	Calendar c = Calendar.getInstance();
	
	
	public List selectBoard() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			
			String sql = "select * from tb_board order by no desc";
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setNo(rs.getInt("no"));
				vo.setTitle(rs.getString("title"));
				vo.setWriter(rs.getString("writer"));
				vo.setRegDate(rs.getDate("reg_date"));
				
				list.add(vo);
			}
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
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
		return list;
	}
	
	public BoardVO selectByNo(BoardVO board) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			
			String sql = "select * from tb_board where no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, board.getNo());
			
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setNo(rs.getInt("no"));
				vo.setTitle(rs.getString("title"));
				vo.setWriter(rs.getString("writer"));
				vo.setContent(rs.getString("content"));
				vo.setRegDate(rs.getTimestamp("reg_date"));
				return vo;
			}else {
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
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
		return null;
	}
	
	public void insertBoard(BoardVO board) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			
			String sql = "insert into tb_board(no, title, writer, content, reg_date) "
						+ "values(s_board_no.nextval, ?, ?, ?, sysdate)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getContent());
			
			int cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
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
	
	
	public boolean updateBoard(BoardVO board) {
		boolean flag = false;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			
			String sql = "update tb_board set title = ? "
						+ "where no = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setInt(2, board.getNo());
			
			
			int cnt = pstmt.executeUpdate();
			if (cnt == 1) flag = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
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
		return flag;
	}
	
	public boolean deleteBoard(int no) {
		boolean flag = false;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			
			String sql = "delete from tb_board "
						+ "where no = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			
			int cnt = pstmt.executeUpdate();
			if (cnt == 1) flag = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
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
		return flag;
	}
	
}
