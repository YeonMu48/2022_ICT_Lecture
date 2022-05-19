package extendsEX2;

public class Developer extends People {
	public Developer(String name, int age, String address, int height, int weight, int experience) {
		super(name, age, address, height, weight, experience);
		System.out.println("Developer(자식) 생성자 출력!");
	}
	
	public void showLang() {
		System.out.println(this.name + "님이 가능한 언어는 " + this.experience + "개 입니다.");
	}
	
	public void showExper() {
		System.out.println(this.name + "님의 경력은 " + this.experience + "년 입니다.");
	}
}
