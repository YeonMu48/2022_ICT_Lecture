package classSubstitute;

public class Train {
	int lineNum;
	int fare;
	String speed;
	
	public Train() {
		this(0,0,"미정");
	}
	
	public Train(int lineNum, int fare, String speed) {
		this.lineNum = lineNum;
		this.fare = fare;
		this.speed = speed;
		System.out.println("Train 생성자 호출");
		System.out.println();
	}
	
	public void showTrainInfo() {
		System.out.println("호선 : " + this.lineNum);
		System.out.println("지하철 요금 : " + this.fare);
		System.out.println("지하철 속도 : " + this.speed);
	}
}
