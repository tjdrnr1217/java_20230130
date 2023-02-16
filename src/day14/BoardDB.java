package day14;

import java.util.List;

public interface BoardDB {
	
	//게시판 글쓰기
	public int insertBoardOne(Board board);
	
	//게시판 조회(10개씩)
	public List<Board> selectBoardList(int page);
	
	//게시판 수정
	public int updateBoardOne(Board board);
	
	//게시판 1개 조회
	public Board selectBoardOne(long page);
	
	//게시판 삭제
	public int deleteBoardOne(long no);
}
