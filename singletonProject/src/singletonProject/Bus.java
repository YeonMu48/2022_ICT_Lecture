package singletonProject;

public class Bus {
	private static Bus instance;
	private int studentFee = 720;
	private int employeeFee = 1250;
	private int busPassenger = 0;
	private int busTotalFee = 0;


	
	public static Bus getInstance() { 
		if(instance==null) {				
			instance = new Bus(); 
			System.out.println("103�� ���� ���� ����!");
		}
	return instance;
	}
	
	public void setBusInfo(int studenetFee, int employeeFee, int busPassenger, int busTotalFee) {
		this.studentFee = studentFee;
		this.employeeFee = employeeFee;
		this.busPassenger = busPassenger;
		this.busTotalFee = busTotalFee;
	}

	public void showBusInfo() { 
		System.out.println("������ �� ���� : " + busTotalFee);
		System.out.println("������ ź ��� �� : " + busPassenger);
	}
	
	public void takeBus(People people) {
		if(people.money < this.studentFee) {
			System.out.println("�ܾ��� �����մϴ�.");
			System.out.println(people.name + "���� �ܾ� : " + people.money);
			showBusInfo();
			System.out.println();
		}else {
			if(people.job == "������") {
				this.busTotalFee += this.employeeFee;
				people.money -= employeeFee;
				busPassenger++;
				System.out.println("�߻�! " + people.job + " �Դϴ�.");
				System.out.println(people.name + "���� �ܾ� : " + people.money);
				showBusInfo();
				System.out.println();
			}else {
				this.busTotalFee += this.studentFee;
				people.money -= studentFee;
				busPassenger++;
				System.out.println("�߻�! " + people.job + " �Դϴ�.");
				System.out.println(people.name + "���� �ܾ� : " + people.money);
				showBusInfo();
				System.out.println();
			}
		
		}

	}
}
