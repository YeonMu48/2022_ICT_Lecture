package extendsEX2;

public class Developer extends People {
	public Developer(String name, int age, String address, int height, int weight, int experience) {
		super(name, age, address, height, weight, experience);
		System.out.println("Developer(�ڽ�) ������ ���!");
	}
	
	public void showLang() {
		System.out.println(this.name + "���� ������ ���� " + this.experience + "�� �Դϴ�.");
	}
	
	public void showExper() {
		System.out.println(this.name + "���� ����� " + this.experience + "�� �Դϴ�.");
	}
}
