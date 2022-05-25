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
			System.out.println("이름과 학점을 입력하세요. ");
			name = scan.next();
			grade = scan.nextDouble();
			stuList.add(new People(name, grade));
			scan.nextLine();
		}
		scan.close();
		System.out.println();
		
		System.out.println("ArrayList 학점 관리 프로그램 시작!");
		System.out.println("---학점이 4.0 이상인 인원 목록---");
		
		for(int i = 0; i < 10; i++) {
			stuList.get(i).checkGrade();   				
			}
	
		System.out.println("---------------------------");
		System.out.println("--전체 인원의 학점 평균---");
		System.out.print("학점 평균 : ");
		
		method1.calcAvg(stuList);	
		 	
		System.out.println("--------------------");
		
		/*
		stuList.add(new People("이선민", 4.5));
		stuList.add(new People("박재현", 4.5));
		stuList.add(new People("홍재광", 4.5));
		stuList.add(new People("신도현", 4.5));
		stuList.add(new People("김민수", 4.5));
		stuList.add(new People("이이름", 4.2));
		stuList.add(new People("박이름", 3.9));
		stuList.add(new People("홍이름", 2.4));
		stuList.add(new People("신이름", 1.7));
		stuList.add(new People("김이름", 2.8));
		
		
		for(int i = 0; i < stuList.size(); i++) {
			if(stuList.get(i).getGrade() >= 4.0) { // 이 자체가 인스턴스이기 때문에 자체로 함수 가능  
				stuList.get(i).showInfo();        // 다른 방법으로는 인스턴스를 개별 생성해 거기에 값을 담아서 개별 보관 가능
			}
		}
		*/
		
	}
}
	
