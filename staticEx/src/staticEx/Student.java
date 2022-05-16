package staticEx;

public class Student {
	static int serialNum = 1000;
	int grade;

	public static void addCount() {
		serialNum++;
	}
	public int getSerialNum() {
		return serialNum;
	}
	public static void AddserialNum() { // static method
		serialNum++;
	}
}
