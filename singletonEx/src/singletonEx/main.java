package singletonEx;

public class main {
	public static void main(String[] args) {
		System.out.println("���ι��� ���� ���Դϴ�.");
		System.out.println();
		
	// ��ü �ΰ��� �ν��Ͻ� �ѰͰ� �̱����� �ΰ��� �ִ� ���� ���������� �ٸ���. 
	//�ν��Ͻ��� �ٸ� �̸��� �ٸ� �׸��̱� ������ ���� ���� ������ �ν��Ͻ��� �ϳ��� ���� �̸��� �ΰ� �� ���̴�. �����ϴ� ���� �߿�!!!
		
		Singleton stInstance1 = Singleton.getInstance();
		Singleton stInstance2 = Singleton.getInstance();
		Singleton stInstance3 = Singleton.getInstance();
		
		Basic basic1 = new Basic();
		Basic basic2 = new Basic();
		
		System.out.println();
		System.out.println(basic1);
		System.out.println(basic2);
		System.out.println();
		System.out.println(stInstance1);
		System.out.println(stInstance2);
		System.out.println(stInstance3);
	
	}
}
