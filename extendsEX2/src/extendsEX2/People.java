package extendsEX2;

public class People {
	String name;
	int age;
	String address;
	int heigth;
	int weight;
	int experience;
	
	public People(String name, int age, String address, int height, int weight, int experience) {
		System.out.println("People(부모) 생성자 출력!");
		this.name = name;
		this.age = age;
		this.address = address;
		this.heigth = height;
		this.weight = weight;
		this.experience = experience;
	}
	
	public void showInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.address);
		System.out.println(this.heigth);
		System.out.println(this.weight);
	}
	
}
