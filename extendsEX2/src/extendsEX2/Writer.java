package extendsEX2;

public class Writer extends People {
	public Writer(String name, int age, String address, int height, int weight, int experience) {
		super(name, age, address, height, weight, experience);
		System.out.println("Writer(�ڽ�) ������ ���!");
	}
	public void showExper() {
		System.out.println(this.name + "���� ����� " + this.experience + "�� �Դϴ�.");
	}
}
