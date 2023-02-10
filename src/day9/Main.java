package day9;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		try {
			BoardDAO boardDAO = new BoardDAOImpl();
			List<Board> list = boardDAO.selectBoardList(1);
			System.out.println(boardDAO.selectiBoardReplyCount(3));
			for (Board board : list) {
				System.out.println("게시글번호 => " + board.getBrdno());
				System.out.println("게시글제목 => " + board.getBrdTitle());
				System.out.println("게시글조회수 => " + board.getBrdHit());
				System.out.println("게시글날짜 => " + board.getBrdDate());
				System.out.println("답글 개수 => " + board.getReplyCount());
				System.out.println("답글번호는 => "+board.getReplyNoList());
				System.out.println("------------------------------------");
			}
				
		}
		catch (Exception e) {
			e.printStackTrace();

		}
		}

}
//			

//			BoardDAO boardDAO = new BoardDAOImpl();
//			List<Board> list = boardDAO.selectBoardList();
//			for(Board board : list) {
//				System.out.println("게시글번호 => " + board.getBrdno());
//				System.out.println("게시글제목 => " + board.getBrdTitle());
//				System.out.println("게시글조회수 => " + board.getBrdHit());
//				System.out.println("게시글날짜 => " + board.getBrdDate());
//				System.out.println("답글 개수 => " + board.getReplyCount());
//				System.out.println("답글번호는 => "+board.getReplyNoList().toString());
//				for(Long tmp : board.getReplyNoList()) {
//					System.out.print(tmp);
//				}
//				System.out.println("--------------------------------");
		

		// 1.접속, 컬렉션2개 객체 변수보관
//			ReplyDB replyDB = new ReplyDBImpl();	

		// 변경
//			Reply reply = new Reply();
//			reply.setNo(221);
//			reply.setContent("룰");
//			reply.setWriter("루");
//			
//			short ret = replyDB.updateReply(reply);
//			System.out.println(ret);

		// 삭제
//			short ret = replyDB.deleteReply(4);
//			System.out.println(ret);

		// 원본 게시글을 이용한 전체 답글 조회하기, list
//			List<Reply> list = replyDB.selecteReplyList(2);
//			if(list != null) {
//			for(Reply reply : list) {
//				if(reply != null) {
//					System.out.println("답글번호=> " + reply.getNo());
//					System.out.println("답글내용=> " + reply.getContent());
//					System.out.println("답글작성자=> " + reply.getWriter());
//					System.out.println("답글일자=> " + reply.getRegdate());
//					System.out.println("-----------------------------");
//				}
//			}
//		}
		// 1개씩 출력
//			Reply reply = replyDB.selectReplyOne(2111111);
//			if(reply != null) {
//			System.out.println("답글번호=> " + reply.getNo());
//			System.out.println("답글내용=> " + reply.getContent());
//			System.out.println("답글작성자=> " + reply.getWriter());
//			System.out.println("답글일자=> " + reply.getRegdate());
//			System.out.println("원본게시글정보=> " + reply.getBoard().toString());
//			}

		// 3. 답글 객체
//			Reply reply = new Reply();
//			reply.setContent("카악");
//			reply.setWriter("툴");
//			reply.setRegdate(new Date());
//			
//			Board board = new Board();
//			board.setBrdno(5L);
//			
//			reply.setBoard(board);
		
		// 2. 추가하는 메소드
//			ReplyDB replyDB = new ReplyDBImpl();
//			short ret = replyDB.insertReply(reply);
//			System.out.println(ret);

