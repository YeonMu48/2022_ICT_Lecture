package arrayCopyEx;

public class main {
	public static void main(String[] args) {

		// 1. Book 클래스 5개를 원소로 가진 첫 번째 배열 생성

		// 2. 각각의 Book 클래스의 인스턴스 생성 및 책이름, 저자 대입

		// 3. Book 클래스 5개를 원소로 가진 두 번째 배열 생성

		// 4. 두 번째 배열에 첫 번째 배열을 얕은복사 한다.(System.arrayCopy)

		// 5. Book 클래스 5개를 원소로 가진 세 번째 배열 생성

		// 6. 세 번째 배열에 첫 번째 배열을 깊은복사 한다.

		Book[] bookArr01 = new Book[5];
		bookArr01[0] = new Book("오은영의 화해", "오은영"); //인스턴스 생성
		bookArr01[1] = new Book("이방인", " 알베르 까뮈");
		bookArr01[2] = new Book("시지프스 신화", " 알베르 까뮈");
		bookArr01[3] = new Book("참을 수 없는 존재의 가벼움", " 밀란 쿤데라");
		bookArr01[4] = new Book("존재와 시간", " 하이데거");
		
		Book[] bookArr02 = new Book[5];
		
		for(int i = 0; i < bookArr01.length; i++) {
			if (bookArr02[i] == null) {                                               
				bookArr02[i] = new Book(); }
		}
		
		System.arraycopy(bookArr01, 0, bookArr02, 0, bookArr01.length);
		
		Book[] bookArr03 = new Book[5];
		
		for(int i = 0; i < bookArr01.length; i++) {
			if (bookArr03[i] == null) {                                                  // if ( instance == null) {
				bookArr03[i] = new Book();   // 왜 오른쪽이 아니고 왼쪽 일까? Book은 클래스 명이기 때문.     bookArr03[i] = new instance
				bookArr03[i].bookName = bookArr01[i].getBookName();
				bookArr03[i].author = bookArr01[i].getAuthor();
			}
		}
		
		/*for(int i = 0; i < bookArr01.length; i++);  { // 배열의 전체를 보고 싶을 땐 반복문으로 원소에 각각 접근하여 출력문을 찍기 
			bookArr02[i].showBookInfo();
		}*/
		

		/*for(int i = 0; i < bookArr01.length; i++);  { // 배열의 전체를 보고 싶을 땐 반복문으로 원소에 각각 접근하여 출력문을 찍기 
			bookArr03[i].showBookInfo();
		}*/
		bookArr01[3].setBookName("나는 왜 너를 사랑하는가?"); 
		bookArr01[3].setAuthor("알랭 드 보통");
		
		bookArr02[3].showBookInfo(); // 값이 변함. 같은 인스턴스이기 때문

		bookArr03[3].showBookInfo(); // 값이 바뀌지 않음 왜 ? 인스턴스가 개별이고 값만 가져왔기 때문에 
	}
}
