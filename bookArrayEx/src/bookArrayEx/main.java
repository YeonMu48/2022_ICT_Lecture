package bookArrayEx;

public class main {
	public static void main(String[] args) {
		
			/*
			Book[] bookArray1 = new Book[5];
			Book[] bookArray2 = new Book[5]; // �ν��Ͻ� ���� ���ϰ� ���� ī���ؿԾ bookArray2 �� ���� ��µȴ�. �ν��Ͻ��� �����ϰ� �Էµ� ���� ������ �Ա� ���� 
			
			bookArray1[0] = new Book("�������� ȭ��", "������");
			bookArray1[1] = new Book("�̹���"," �˺��� �");
			bookArray1[2] = new Book("�������� ��ȭ"," �˺��� �");
			bookArray1[3] = new Book("���� �� ���� ������ ������"," �ж� �ﵥ��");
			bookArray1[4] = new Book("����� �ð�"," ���̵���");
			
			System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);
			
			for(int i =0; i < bookArray2.length; i++) {
				
				System.out.println(bookArray2[i].getBookName()+", " +bookArray2[i].getAuthor());
			}
			*/
		
		
			Book[] bookArray1 = new Book[3];
			Book[] bookArray2 = new Book[3];
			
			bookArray1[0] = new Book("å1", "����1");
			bookArray1[1] = new Book("å1", "����1");
			bookArray1[2] = new Book("å1", "����1");
			
			System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);
			
			bookArray1[0].setBookName("�ٸ�å1");
			bookArray1[0].setAuthor("�ٸ�����1");
			
			
			for(int i = 0; i < bookArray2.length; i++) {
				System.out.println(bookArray2[i].getBookName()+", " +bookArray2[i].getAuthor());
			}
		}
	}

