package classProject;

public class Bus {
	public int busNum;
	public int busPassenger;
	public int busFare;
	private int busTotal;

	public Bus() {
		this(999, 0, 0); // this ������ ���� �Ʒ� ������ ȣ�� �Ͽ� 999 , 0 , 0 �� ���� ������� �׷��� ������  
		System.out.println("Bus default"); // ���� 2. �Ʒ� ��Ʈ�� ������ �ٽ� ���ƿͼ� ��Ʈ ��� 
		System.out.println();
	}
	
	
	public Bus(int busNum, int busPassenger, int busFare) {
		System.out.println("Bus Initialize"); // ���� 1. this ���� 1������ ȣ�� ���ڿ� 999 0 0 ���� ������� 
		System.out.println();
		
		this.busNum = busNum;
		this.busPassenger = busPassenger;
		this.busFare = busFare;
	}
	
	public void showBusInfo() {
		System.out.println("���� ��ȣ : " + busNum);
		System.out.println("ž�°� �� : " + busPassenger);
		System.out.println("���� ��� : " + busFare);
		System.out.println();
	}
	public void charge(int busFare) {
		this.busTotal += busFare;
		busPassenger++;
		System.out.println("���� ������ �� ž�°��� : " + busPassenger + "��, �� ������ : " + busTotal + "�� �Դϴ�.");
	}
}
