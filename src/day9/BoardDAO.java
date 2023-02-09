package day9;
//2023.02.07(3)
import java.util.List;


public interface BoardDAO {
	
	// 답글의 개수가 n개인 이상인 게시글 조회
	public List<Board> selectiBoardReplyCount(int n);
	// 게시글 추가
	public int insertBoard(Board board);
	
	// 게시글 수정
	public int updateBoard(Board board);
	
	// 게시글 삭제
	public int deleteBoard(long no);
	
	// 게시글 조회
	public List<Board> selectBoardList(int n);
	
	// 게시글 수에 따른 조회 ex) n보다 큰경우
	public List<Board> selectBoardHitList(long hit);
	
	// 게시글 1개 조회
	public Board selectBoardOne(long no);
}
