package Queue;

public interface Queue {
	void enQueue(String title); // Queue��� �ڷᱸ������ �ڷḦ ������ enQueue�� ��� �ݴ� deQueue
	String deQueue();
	int getSize();
}
