package run;

import Book.BookShelf;
import Queue.Queue;
import Stack.Stack;
import Stack.StackShelf;

public class main {
	public static void main(String[] args) {
		// 자료구조 Queue 방식
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("1번책");
		shelfQueue.enQueue("2번책");
		shelfQueue.enQueue("3번책");
		System.out.println();
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println("--------------");
		
		// 자료구조 Stack 방식
		
		Stack shlefStack = new StackShelf();
		shlefStack.push("1번책");
		shlefStack.push("2번책");
		shlefStack.push("3번책");	
		System.out.println();
		System.out.println(shlefStack.pop());
		System.out.println(shlefStack.pop());
		System.out.println(shlefStack.pop());
		System.out.println(shlefStack.pop());
	}
}
