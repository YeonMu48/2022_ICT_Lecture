package singletonEx;

public class Singleton {
	private static Singleton instance; // ��������� �ڽ��� �ڷ����� �̱����� �ν��Ͻ��� ���ڴٰ� ����
	
	private Singleton() {
		System.out.println("Singleton ������ ȣ��!");
	}
	 // Ŭ������ �ν��Ͻ��� �����ؾ� �ϰ�, �� ������ ����ƽ ���� ���� �޼ҵ�� ��� �� �� ����. �׷��� ���� �����ڸ� �����̺����� �����ؼ� �ν��Ͻ��� �Ұ��ϴ�. 
	public static Singleton getInstance() { // �׷� �ν��Ͻ��� �������� �ϴµ� ��� �ؾ� �ϴ°�? ���� ����ƽ �޼ҵ�� �ν��Ͻ��� �����ϴ� ���̴�.  
		if(instance==null) {				// �ν��Ͻ� ��� �޼���, ��ȯ �� �ڷ��� �̱��� 
			instance = new Singleton(); 	// ���⼭�� �� private Singleton�� ��� �����Ѱ�? �����̺��� �ڱ� ���ο��� ��� �����ϱ� ������. 
		}
	return instance;
	}
}
