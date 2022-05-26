package Architecture;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		System.out.println("문자열을 입력하세요.");
		
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
			System.out.println("지원하지 않는 기능입니다.");
			isSupport = false;
		}
		
		if(isSupport == true) {
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}
		sc.close();
	}
}
