package classSubstitute;

public class Train {
	int lineNum;
	int fare;
	String speed;
	
	public Train() {
		this(0,0,"����");
	}
	
	public Train(int lineNum, int fare, String speed) {
		this.lineNum = lineNum;
		this.fare = fare;
		this.speed = speed;
		System.out.println("Train ������ ȣ��");
		System.out.println();
	}
	
	public void showTrainInfo() {
		System.out.println("ȣ�� : " + this.lineNum);
		System.out.println("����ö ��� : " + this.fare);
		System.out.println("����ö �ӵ� : " + this.speed);
	}
}
