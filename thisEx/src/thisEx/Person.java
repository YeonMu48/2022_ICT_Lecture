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
	// �ý��ۿ��� Ŭ������ ����ϴ� �Ͱ� Ŭ�������� �ڱ� �ڽ��� ����ϴ� ���� ����. Ÿ���� ���忡�� ���� �θ��� �Ŷ� ���� ���� �θ��� ���� ���� ����.
	
}

