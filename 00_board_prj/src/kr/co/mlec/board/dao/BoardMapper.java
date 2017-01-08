package kr.co.mlec.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.mlec.board.vo.BoardVO;
import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.util.ConnectionFactory;
import kr.co.mlec.util.ConnectionPool;

public class BoardMapper {
	
	private static SqlSession sqlMapper;
	
	public BoardMapper() throws Exception {
		sqlMapper = MyAppSqlConfig.getSqlSessionInstance();
		
	}
	

	
	public List<BoardVO> selectBoard() throws Exception{
		List<BoardVO> list = sqlMapper.selectList("kr.co.mlec.board.dao.BoardMapper.getBoardInfo1");
		return list;
	}
	
	// 글번호에 해당하는 게시물 조회
	public BoardVO selectOneBoard(int no) throws Exception{
		BoardVO board = sqlMapper.selectOne("kr.co.mlec.board.dao.BoardMapper.getBoardInfo2", no);
		
		return board;
		/*
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			String sql = "select no, title, writer, content, reg_date "
					   + "  from tb_board "
					   + " where no = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setNo(rs.getInt("no"));
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setRegDate(rs.getTimestamp("reg_date"));
				return vo;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(pstmt);
			ConnectionPool.releaseConnection(con);
		}
		return null;*/
	}
	
	public void insertBoard(BoardVO vo) throws Exception {
		sqlMapper.insert("kr.co.mlec.board.dao.BoardMapper.insertboard", vo);
		sqlMapper.commit();
		
	}
	
	public boolean updateBoard(BoardVO vo) throws Exception {
		sqlMapper.update("kr.co.mlec.board.dao.BoardMapper.updateboard", vo);
		sqlMapper.commit();
		return true;
		
	}

	public boolean deleteBoard(int no) throws Exception {
		sqlMapper.delete("kr.co.mlec.board.dao.BoardMapper.deleteboard", no);
		sqlMapper.commit();
		return true;
		
	}
}














