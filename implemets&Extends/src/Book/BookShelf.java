package Book;

import Queue.Queue;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		// TODO Auto-generated method stub
		shelf.add(title);
		System.out.println(title + "�� �߰� �Ǿ����ϴ�.");
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		if(getSize() ==0) {
			return "ť�� ������ϴ�.";
		}
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}
	

}
