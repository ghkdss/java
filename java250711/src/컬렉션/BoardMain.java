package 컬렉션;

import java.util.ArrayList;

public class BoardMain {

	public static void main(String[] args) {
		
		// ArrayList 컬렉션 생성 ( Board에 지정된 타입의 객체만 저장 )
		ArrayList<Board> list = new ArrayList<>();
		
		// 객체 추가
		list.add(new Board("제목1", "내용1", "저자1"));
		list.add(new Board("제목2", "내용2", "저자2"));
		list.add(new Board("제목3", "내용3", "저자3"));
		list.add(new Board("제목4", "내용4", "저자4"));
		list.add(new Board("제목5", "내용5", "저자5"));
		
		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수 " + size);
		System.out.println();

		// 특정 인덱스의 객체 가져오기
		Board board = list.get(2);
		System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		System.out.println();
		
		// 모든 객체를 하나씩 가져오기
		for(int i=0; i<list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
		System.out.println();
		
		// 객체 삭제
		list.remove(2);
		// list.remove(2);
		for(Board b : list) {
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
	}

}
