package bookArrayListEx;

import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		ArrayList<Book> bookArrayList = new ArrayList<Book>();
		
		bookArrayList.add(new Book("���� �� ���� ������ ������", "�ж� �ﵥ��"));
		bookArrayList.add(new Book("������ ��ȭ", "�˺��� �"));
		bookArrayList.add(new Book("����������", "���"));
		bookArrayList.add(new Book("�����̼�����", "ĭƮ"));
		bookArrayList.add(new Book("�Ҿ�", "�˷� �� ����"));
		
		
		for(int i = 0; i < bookArrayList.size(); i++) {
			bookArrayList.get(i).showBookInfo();
			
		}
		
		System.out.println("------����------");
		System.out.println("���� �� å : " + bookArrayList.remove(4));
		
		bookArrayList.add(new Book("������ �׷����� �ʻ�", "����ī ���ϵ�"));
		System.out.println("------�߰�------");
		
		for(int i = 0; i < bookArrayList.size(); i++) {
			bookArrayList.get(i).showBookInfo();
			
		}
		
	}

}	

	