package functionDetail;

public class main {
	public static void main(String[] args) {
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
		
		/*
		Method function = new Method(); // 'Method function' -> ���� ���� '= new Method' -> �ν��Ͻ� ����
		String data = "������"; // �̷��� �ϰų� 'function.setData("������");' �� �ص� ���� ����. ���� �����ϴ� ����� �������̳� ���ڿ� ��� �־����� ����
		function.setData(data, data); // ����� ����� �ٸ���. �Լ��� ���� �ִ°��� ������ �ƴ�. 
									 //  ���� data ���� �־������� �Լ��� ���ڷν� �ٸ� �������� �׿� ���� ��. 
									//   ���ڴ� �̸��� ������ �ȵȴ�? �� ? �̸��� ������ ��ǻ�Ͱ� ȣ������ �� ������ �� ����� ���̱� ����. 
								   //    ���ڴ� ���� �����ϴ� �뵵. 
		System.out.println("main data : " + data); 
		*/
		
		Method function = new Method();
		int num = 10;
		function.setInt(num); 
		System.out.println("main int : " + num); // �̸��� �������� �Լ��� ���ڿ� �ִ� ���� ���� �ٸ��Ŵ�. 
												//  ���ڸ� �ø� �� ',' �� ����� �ڷ����� �̸��� �ٿ� ������ �Ѵ�. 
	}
}
