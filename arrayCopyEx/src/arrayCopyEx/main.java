package arrayCopyEx;

public class main {
	public static void main(String[] args) {

		// 1. Book Ŭ���� 5���� ���ҷ� ���� ù ��° �迭 ����

		// 2. ������ Book Ŭ������ �ν��Ͻ� ���� �� å�̸�, ���� ����

		// 3. Book Ŭ���� 5���� ���ҷ� ���� �� ��° �迭 ����

		// 4. �� ��° �迭�� ù ��° �迭�� �������� �Ѵ�.(System.arrayCopy)

		// 5. Book Ŭ���� 5���� ���ҷ� ���� �� ��° �迭 ����

		// 6. �� ��° �迭�� ù ��° �迭�� �������� �Ѵ�.

		Book[] bookArr01 = new Book[5];
		bookArr01[0] = new Book("�������� ȭ��", "������"); //�ν��Ͻ� ����
		bookArr01[1] = new Book("�̹���", " �˺��� �");
		bookArr01[2] = new Book("�������� ��ȭ", " �˺��� �");
		bookArr01[3] = new Book("���� �� ���� ������ ������", " �ж� �ﵥ��");
		bookArr01[4] = new Book("����� �ð�", " ���̵���");
		
		Book[] bookArr02 = new Book[5];
		
		for(int i = 0; i < bookArr01.length; i++) {
			if (bookArr02[i] == null) {                                               
				bookArr02[i] = new Book(); }
		}
		
		System.arraycopy(bookArr01, 0, bookArr02, 0, bookArr01.length);
		
		Book[] bookArr03 = new Book[5];
		
		for(int i = 0; i < bookArr01.length; i++) {
			if (bookArr03[i] == null) {                                                  // if ( instance == null) {
				bookArr03[i] = new Book();   // �� �������� �ƴϰ� ���� �ϱ�? Book�� Ŭ���� ���̱� ����.     bookArr03[i] = new instance
				bookArr03[i].bookName = bookArr01[i].getBookName();
				bookArr03[i].author = bookArr01[i].getAuthor();
			}
		}
		
		/*for(int i = 0; i < bookArr01.length; i++);  { // �迭�� ��ü�� ���� ���� �� �ݺ������� ���ҿ� ���� �����Ͽ� ��¹��� ��� 
			bookArr02[i].showBookInfo();
		}*/
		

		/*for(int i = 0; i < bookArr01.length; i++);  { // �迭�� ��ü�� ���� ���� �� �ݺ������� ���ҿ� ���� �����Ͽ� ��¹��� ��� 
			bookArr03[i].showBookInfo();
		}*/
		bookArr01[3].setBookName("���� �� �ʸ� ����ϴ°�?"); 
		bookArr01[3].setAuthor("�˷� �� ����");
		
		bookArr02[3].showBookInfo(); // ���� ����. ���� �ν��Ͻ��̱� ����

		bookArr03[3].showBookInfo(); // ���� �ٲ��� ���� �� ? �ν��Ͻ��� �����̰� ���� �����Ա� ������ 
	}
}
