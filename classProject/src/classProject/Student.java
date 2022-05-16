package classProject;

public class Student {
	public String name; // 이거 접근제어자 왜 쓰는거지?
	public int grade;
	public int money;
	
	public Student() {
		this("이름없음", 0, 2500);
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
		System.out.println("학생 이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("가진 돈 : " + money);
		System.out.println();
	}
	
	
	public void takeBus(Bus bus) {
		if(this.money < bus.busFare) {
			 System.out.println(this.name + "님은 잔액부족으로 탑승할 수 없습니다.");
		}else {
			bus.charge(bus.busFare);
			this.money -= bus.busFare;
			System.out.println(name + "의 잔액은 " + money + "원 입니다.");
			System.out.println();
		}
	}
	
	public void takeSubway(Subway subway) {
		if(this.money < subway.subFare) {
			System.out.println(this.name + "님은 잔액부족으로 탑승할 수 없습니다.");
		}else {			
			subway.charge(subway.subFare);
			this.money -= subway.subFare;
			System.out.println(name + "의 잔액은 " + money + "원 입니다.");
			System.out.println();
		}
		// 환승 고민해보기
	}
}
