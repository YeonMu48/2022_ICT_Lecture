package classProject;

public class main {
	public static void main(String[] args) {
		// ���� :  �ν��Ͻ� �����ؼ� �� �־��� �� ���� ����� ��µǴ��� Ȯ�� - 1. �ν��Ͻ� ���� , 2. �� ���� , 3. ��� 
	System.out.println("���ι��� �������Դϴ�.");
	System.out.println();
	
	Bus bus704 = new Bus(704,0,1300); // ���� Ŭ������ �ν��Ͻ� ���� & �����ڷ� �� ���� / �� ���� ž�� 0�� ��� 1300�� ����
	Subway line1 = new Subway(1,0,1700); 		// ����ö Ŭ������ �ν��Ͻ� ����
	Subway line2 = new Subway(2,0,1700);
	Student Lee = new Student("������", 4, 20000); // �л� Ŭ������ �ν��Ͻ� ���� & �����ڷ� �� ����
	Student Han = new Student("�Ѽ�",2,10000);
	Student Kim = new Student();
	
	bus704.showBusInfo(); // bus704�� ���� showBusInfo��� �Լ��� ȣ��
	line1.showSubwayInfo(); // line1�� ���� showSubwayInfo��� �Լ��� ȣ��
	Lee.showStudentInfo(); // Lee�� ���� showStuedentInfho��� �Լ��� ȣ�� 
	
	Lee.takeBus(bus704);
	Han.takeBus(bus704);
	Kim.takeBus(bus704);
	
	Lee.takeSubway(line1);
	Han.takeSubway(line1);
	Kim.takeSubway(line1);
	
	/* ȯ���ϴ°� �����
	System.out.println();
	System.out.println("ȯ���ϸ� ��� �ɱ�?");
	Lee.takeSubway(line2);
	*/
	}
}
