package Architecture;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��ϼ���.");
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		
		boolean isSupport = true;
		
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch =='r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L' || ch == '1') {
			scheduler = new LeastJob();
		}
		else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			isSupport = false;
		}
		
		if(isSupport == true) {
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}
		sc.close();
	}
}
