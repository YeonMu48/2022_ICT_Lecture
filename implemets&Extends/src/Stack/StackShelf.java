package Stack;

import Book.Shelf;

public class StackShelf extends Shelf implements Stack{

	@Override
	public void push(String title) {
		// TODO Auto-generated method stub
		shelf.add(title); 
		System.out.println(title + "�� �߰� �Ǿ����ϴ�.");
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		if(getStackSize() ==0) {
			return "������ ������ϴ�.";
		}
		return shelf.remove(shelf.size()-1);
		// return shelf.remove(getCount()-1); �� ����
	}

	@Override
	public int getStackSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

}
