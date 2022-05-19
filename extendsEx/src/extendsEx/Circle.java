package extendsEx;

public class Circle extends Point {
	public Circle() {
		super(5, 6);
		setX(3); // super로 부모클래스에 접근 가능
		System.out.println("Circle 생성자 호출!");
	}
}
