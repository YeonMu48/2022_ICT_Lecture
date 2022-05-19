package bookArrayListEx;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		ArrayList<Book> bookArrayList = new ArrayList<Book>();
		
		bookArrayList.add(new Book("참을 수 없는 존재의 가벼움", "밀란 쿤데라"));
		bookArrayList.add(new Book("시지프 신화", "알베르 까뮈"));
		bookArrayList.add(new Book("정신현상학", "헤겔"));
		bookArrayList.add(new Book("순수이성비판", "칸트"));
		bookArrayList.add(new Book("불안", "알랭 드 보통"));
		
		
		for(int i = 0; i < bookArrayList.size(); i++) {
			bookArrayList.get(i).showBookInfo();
			
		}
		
		System.out.println("------삭제------");
		System.out.println("삭제 한 책 : " + bookArrayList.remove(4));
		
		bookArrayList.add(new Book("도리언 그레이의 초상", "오스카 와일드"));
		System.out.println("------추가------");
		
		for(int i = 0; i < bookArrayList.size(); i++) {
			bookArrayList.get(i).showBookInfo();
			
		}
		
	}

}	

	