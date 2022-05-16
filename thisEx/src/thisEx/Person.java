package thisEx;

public class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void printThis( ) {
		System.out.println(this);
	}
	// 시스템에서 클래스를 출력하는 것과 클래스에서 자기 자신을 출력하는 것은 같다. 타인의 입장에서 나를 부르는 거랑 내가 나를 부르는 것이 같기 때문.
	
}

