package bookArrayEx;

public class main {
	public static void main(String[] args) {
		
			/*
			Book[] bookArray1 = new Book[5];
			Book[] bookArray2 = new Book[5]; // 인스턴스 생성 안하고 값을 카피해왔어도 bookArray2 의 값은 출력된다. 인스턴스를 생성하고 입력된 값을 복사해 왔기 때문 
			
			bookArray1[0] = new Book("오은영의 화해", "오은영");
			bookArray1[1] = new Book("이방인"," 알베르 까뮈");
			bookArray1[2] = new Book("시지프스 신화"," 알베르 까뮈");
			bookArray1[3] = new Book("참을 수 없는 존재의 가벼움"," 밀란 쿤데라");
			bookArray1[4] = new Book("존재와 시간"," 하이데거");
			
			System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);
			
			for(int i =0; i < bookArray2.length; i++) {
				
				System.out.println(bookArray2[i].getBookName()+", " +bookArray2[i].getAuthor());
			}
			*/
		
		
			Book[] bookArray1 = new Book[3];
			Book[] bookArray2 = new Book[3];
			
			bookArray1[0] = new Book("책1", "저자1");
			bookArray1[1] = new Book("책1", "저자1");
			bookArray1[2] = new Book("책1", "저자1");
			
			System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);
			
			bookArray1[0].setBookName("다른책1");
			bookArray1[0].setAuthor("다른저자1");
			
			
			for(int i = 0; i < bookArray2.length; i++) {
				System.out.println(bookArray2[i].getBookName()+", " +bookArray2[i].getAuthor());
			}
		}
	}

