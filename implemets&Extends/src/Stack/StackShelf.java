package Stack;

import Book.Shelf;

public class StackShelf extends Shelf implements Stack{

	@Override
	public void push(String title) {
		// TODO Auto-generated method stub
		shelf.add(title); 
		System.out.println(title + "이 추가 되었습니다.");
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		if(getStackSize() ==0) {
			return "스택이 비었습니다.";
		}
		return shelf.remove(shelf.size()-1);
		// return shelf.remove(getCount()-1); 과 같음
	}

	@Override
	public int getStackSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

}
