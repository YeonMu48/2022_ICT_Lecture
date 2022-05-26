package Book;

import Queue.Queue;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		// TODO Auto-generated method stub
		shelf.add(title);
		System.out.println(title + "이 추가 되었습니다.");
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		if(getSize() ==0) {
			return "큐가 비었습니다.";
		}
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}
	

}
