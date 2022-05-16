package classProject;

public class Bus {
	public int busNum;
	public int busPassenger;
	public int busFare;
	private int busTotal;

	public Bus() {
		this(999, 0, 0); // this 구문만 쓰면 아래 생성자 호출 하여 999 , 0 , 0 의 값을 집어넣음 그래서 순서가  
		System.out.println("Bus default"); // 과정 2. 아래 루트를 끝내고 다시 돌아와서 멘트 출력 
		System.out.println();
	}
	
	
	public Bus(int busNum, int busPassenger, int busFare) {
		System.out.println("Bus Initialize"); // 과정 1. this 사용시 1번으로 호출 인자에 999 0 0 값을 집어넣음 
		System.out.println();
		
		this.busNum = busNum;
		this.busPassenger = busPassenger;
		this.busFare = busFare;
	}
	
	public void showBusInfo() {
		System.out.println("버스 번호 : " + busNum);
		System.out.println("탑승객 수 : " + busPassenger);
		System.out.println("버스 요금 : " + busFare);
		System.out.println();
	}
	public void charge(int busFare) {
		this.busTotal += busFare;
		busPassenger++;
		System.out.println("현재 버스의 총 탑승객은 : " + busPassenger + "명, 총 수입은 : " + busTotal + "원 입니다.");
	}
}
