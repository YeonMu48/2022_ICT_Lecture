package cctvEx;

public class main {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc(); // �ν��Ͻ��� CompleteCalc ������ ������ Calc. Calc �������̽��� showInfo�� �ִ°�? ���� �׷��� ����� �� ����. 
										// ���� Ŭ������ ������ �� ��ȯ �������� ���� Ŭ������ ���� �޼ҵ尡 ���� Ŭ������ ���� �Ǿ��ִٸ�, �ش� �޼ҵ�� ��� �� �� ����. 
		System.out.println(calc.add(num1, num2));
	}
}
