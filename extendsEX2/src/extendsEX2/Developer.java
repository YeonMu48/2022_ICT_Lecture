package extendsEX2;

public class Developer extends People {
	public Developer(String name, int age, String address, int height, int weight, int experience) {
		super(name, age, address, height, weight, experience);
		System.out.println("Developer(자식) 생성자 출력!");
	}
}
