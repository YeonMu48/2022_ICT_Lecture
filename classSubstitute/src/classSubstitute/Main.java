package classSubstitute;

public class Main {
	public static void main(String[] args) {
		System.out.println("메인문이 구동중입니다.");
		System.out.println();
		
		Train line1 = new Train();
		Train line2 = new Train(9, 1500, "급행");
		
		line1.fare = 1200;
		
		System.out.println("클래스 값을 받기 이전, 라인1의 가격은 " + line1.fare + "원");
		line1.showTrainInfo();
		System.out.println();
		
		line1 = line2;
		System.out.println("클래스 값을 받은 후, 라인 1의 가격은 " + line1.fare + "원");
		line1.showTrainInfo();
		
	}
}
