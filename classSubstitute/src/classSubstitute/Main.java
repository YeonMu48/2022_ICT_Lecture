package classSubstitute;

public class Main {
	public static void main(String[] args) {
		System.out.println("���ι��� �������Դϴ�.");
		System.out.println();
		
		Train line1 = new Train();
		Train line2 = new Train(9, 1500, "����");
		
		line1.fare = 1200;
		
		System.out.println("Ŭ���� ���� �ޱ� ����, ����1�� ������ " + line1.fare + "��");
		line1.showTrainInfo();
		System.out.println();
		
		line1 = line2;
		System.out.println("Ŭ���� ���� ���� ��, ���� 1�� ������ " + line1.fare + "��");
		line1.showTrainInfo();
		
	}
}
