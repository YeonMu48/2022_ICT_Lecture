package Queue;

public interface Queue {
	void enQueue(String title); // Queue라는 자료구조에서 자료를 받을때 enQueue를 사용 반대 deQueue
	String deQueue();
	int getSize();
}
