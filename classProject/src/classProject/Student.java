package classProject;

public class Student {
	public String name; // �̰� ���������� �� ���°���?
	public int grade;
	public int money;
	
	public Student() {
		this("�̸�����", 0, 2500);
		System.out.println("Student default");
		System.out.println();
	}
	
	
	public Student(String name, int grade, int money) {
		System.out.println("Student Initialize");
		System.out.println();
		
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	public void showStudentInfo() {
		System.out.println("�л� �̸� : " + name);
		System.out.println("�г� : " + grade);
		System.out.println("���� �� : " + money);
		System.out.println();
	}
	
	
	public void takeBus(Bus bus) {
		if(this.money < bus.busFare) {
			 System.out.println(this.name + "���� �ܾ׺������� ž���� �� �����ϴ�.");
		}else {
			bus.charge(bus.busFare);
			this.money -= bus.busFare;
			System.out.println(name + "�� �ܾ��� " + money + "�� �Դϴ�.");
			System.out.println();
		}
	}
	
	public void takeSubway(Subway subway) {
		if(this.money < subway.subFare) {
			System.out.println(this.name + "���� �ܾ׺������� ž���� �� �����ϴ�.");
		}else {			
			subway.charge(subway.subFare);
			this.money -= subway.subFare;
			System.out.println(name + "�� �ܾ��� " + money + "�� �Դϴ�.");
			System.out.println();
		}
		// ȯ�� ����غ���
	}
}
