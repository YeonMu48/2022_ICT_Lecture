package classProject;

public class main {
	public static void main(String[] args) {
		// 할일 :  인스턴스 생성해서 값 넣었을 때 값이 제대로 출력되는지 확인 - 1. 인스턴스 생성 , 2. 값 선언 , 3. 출력 
	System.out.println("메인문이 구동중입니다.");
	System.out.println();
	
	Bus bus704 = new Bus(704,0,1300); // 버스 클래스의 인스턴스 생성 & 생성자로 값 선언 / 번 버스 탑승 0명 요금 1300원 선언
	Subway line1 = new Subway(1,0,1700); 		// 지하철 클래스의 인스턴스 생성
	Subway line2 = new Subway(2,0,1700);
	Student Lee = new Student("이지윤", 4, 20000); // 학생 클래스의 인스턴스 생성 & 생성자로 값 선언
	Student Han = new Student("한솔",2,10000);
	Student Kim = new Student();
	
	bus704.showBusInfo(); // bus704에 대해 showBusInfo라는 함수를 호출
	line1.showSubwayInfo(); // line1에 대해 showSubwayInfo라는 함수를 호출
	Lee.showStudentInfo(); // Lee에 대해 showStuedentInfho라는 함수를 호출 
	
	Lee.takeBus(bus704);
	Han.takeBus(bus704);
	Kim.takeBus(bus704);
	
	Lee.takeSubway(line1);
	Han.takeSubway(line1);
	Kim.takeSubway(line1);
	
	/* 환승하는거 만들기
	System.out.println();
	System.out.println("환승하면 어떻게 될까?");
	Lee.takeSubway(line2);
	*/
	}
}
