import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		ArrayList<People> stuList = new ArrayList<People>();
		stuList.clear();
		
		Scanner scan = new Scanner(System.in);
		String name = "";
		double grade = 0.0;

		calMethod method1 = new calMethod();
	
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println("�̸��� ������ �Է��ϼ���. ");
			name = scan.next();
			grade = scan.nextDouble();
			stuList.add(new People(name, grade));
			scan.nextLine();
		}
		scan.close();
		System.out.println();
		
		System.out.println("ArrayList ���� ���� ���α׷� ����!");
		System.out.println("---������ 4.0 �̻��� �ο� ���---");
		
		for(int i = 0; i < 10; i++) {
			stuList.get(i).checkGrade();   				
			}
	
		System.out.println("---------------------------");
		System.out.println("--��ü �ο��� ���� ���---");
		System.out.print("���� ��� : ");
		
		method1.calcAvg(stuList);	
		 	
		System.out.println("--------------------");
		
		/*
		stuList.add(new People("�̼���", 4.5));
		stuList.add(new People("������", 4.5));
		stuList.add(new People("ȫ�籤", 4.5));
		stuList.add(new People("�ŵ���", 4.5));
		stuList.add(new People("��μ�", 4.5));
		stuList.add(new People("���̸�", 4.2));
		stuList.add(new People("���̸�", 3.9));
		stuList.add(new People("ȫ�̸�", 2.4));
		stuList.add(new People("���̸�", 1.7));
		stuList.add(new People("���̸�", 2.8));
		
		
		for(int i = 0; i < stuList.size(); i++) {
			if(stuList.get(i).getGrade() >= 4.0) { // �� ��ü�� �ν��Ͻ��̱� ������ ��ü�� �Լ� ����  
				stuList.get(i).showInfo();        // �ٸ� ������δ� �ν��Ͻ��� ���� ������ �ű⿡ ���� ��Ƽ� ���� ���� ����
			}
		}
		*/
		
	}
}
	
