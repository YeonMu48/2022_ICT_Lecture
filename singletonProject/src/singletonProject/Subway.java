package singletonProject;

public class Subway {
	private static Subway instance;
	private int studentFee = 720;
	private int employeeFee = 1250;
	private int subPassenger = 0;
	private int subTotalFee = 0;

	
	public static Subway getInstance() { 
		if(instance==null) {				
			instance = new Subway(); 
			System.out.println("����ö 1ȣ�� ���� ����!");
		}
	return instance;
	}
	
	public void setSubInfo(int studenetFee, int employeeFee, int subPassenger, int subTotalFee) {
		this.studentFee = studentFee;
		this.employeeFee = employeeFee;
		this.subPassenger = subPassenger;
		this.subTotalFee = subTotalFee;
	}
	
	public void showSubInfo() { 
		System.out.println("����ö�� �� ���� : " + subTotalFee);
		System.out.println("����ö�� ź ��� �� : " + subPassenger);
	}
	
	
	public void takeSubway(People people) {
		if(people.money < this.studentFee) {
			System.out.println("�ܾ��� �����մϴ�.");
			System.out.println(people.name + "���� �ܾ� : " + people.money);
			showSubInfo();
			System.out.println();
		}else {
			if(people.job == "������") {
				this.subTotalFee += this.employeeFee;
				people.money -= employeeFee;
				subPassenger++;
				System.out.println("�߻�! " + people.job + " �Դϴ�.");
				System.out.println(people.name + "���� �ܾ� : " + people.money);
				showSubInfo();
				System.out.println();
			}else {
				this.subTotalFee += this.studentFee;
				people.money -= studentFee;
				subPassenger++;
				System.out.println("�߻�! " + people.job + " �Դϴ�.");
				System.out.println(people.name + "���� �ܾ� : " + people.money);
				showSubInfo();
				System.out.println();
			}
		}
	}
}
