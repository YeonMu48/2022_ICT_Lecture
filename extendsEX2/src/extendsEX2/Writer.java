package extendsEX2;

public class Writer extends People {
	public Writer(String name, int age, String address, int height, int weight, int experience) {
		super(name, age, address, height, weight, experience);
		System.out.println("Writer(자식) 생성자 출력!");
	}

}
