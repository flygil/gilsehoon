package boardDAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import boardVO.BoardVO;
import db.MyAppSqlConfig;

public class BoardDAO {
	private static SqlSession sqlMapper;
	public BoardDAO () {
		sqlMapper = MyAppSqlConfig.getSqlSessionInstance();
	}
	public List<BoardVO> selectList() {
		List<BoardVO> list = sqlMapper.selectList("boardDAO.BoardDAO.selectList");
		return list;
	}
	
	public BoardVO selectByOne(int no) {
		BoardVO vo = sqlMapper.selectOne("boardDAO.BoardDAO.selectOne", no);
		
		return vo;
	}
	
	public int insertBoard(BoardVO vo) {
		int cnt = sqlMapper.insert("boardDAO.BoardDAO.insertBoard", vo);
		sqlMapper.commit();
		return cnt ;
	}
	
	
	public int updateBoard(BoardVO vo) {
		int cnt = sqlMapper.update("boardDAO.BoardDAO.updateBoard", vo);
		sqlMapper.commit();
		return cnt;
	}
	
	public int deleteBoard(int no) {
		int cnt = sqlMapper.delete("boardDAO.BoardDAO.deleteBoard", no);
		sqlMapper.commit();
		return cnt;
	}
}
