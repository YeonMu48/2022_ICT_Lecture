package run;

import Book.BookShelf;
import Queue.Queue;
import Stack.Stack;
import Stack.StackShelf;

public class main {
	public static void main(String[] args) {
		// �ڷᱸ�� Queue ���
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("1��å");
		shelfQueue.enQueue("2��å");
		shelfQueue.enQueue("3��å");
		System.out.println();
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println("--------------");
		
		// �ڷᱸ�� Stack ���
		
		Stack shlefStack = new StackShelf();
		shlefStack.push("1��å");
		shlefStack.push("2��å");
		shlefStack.push("3��å");	
		System.out.println();
		System.out.println(shlefStack.pop());
		System.out.println(shlefStack.pop());
		System.out.println(shlefStack.pop());
		System.out.println(shlefStack.pop());
	}
}
