import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		ArrayList<People> stuList = new ArrayList<People>();
		stuList.clear();
		
		System.out.println("ArrayList ���� ���� ���α׷� ����!");
		System.out.println("---������ 4.0 �̻��� �ο� ���---");
		
		stuList.add(new People("�̼���", 4.5));
		stuList.add(new People("������", 4.5));
		stuList.add(new People("ȫ�籤", 4.5));
		stuList.add(new People("�ŵ���", 4.5));
		stuList.add(new People("��μ�", 4.5));
		stuList.add(new People("���̸�", 4.2));
		stuList.add(new People("���̸�", 3.9));
		stuList.add(new People("ȫ�̸�", 2.4));
		stuList.add(new People("���̸�", 1.7));
		stuList.add(new People("���̸�", 2.8));
		
		
		for(int i = 0; i < stuList.size(); i++) {
			if(stuList.get(i).getGrade() >= 4.0) { // �� ��ü�� �ν��Ͻ��̱� ������ ��ü�� �Լ� ����  
				stuList.get(i).showInfo();        // �ٸ� ������δ� �ν��Ͻ��� ���� ������ �ű⿡ ���� ��Ƽ� ���� ���� ����
			}
		}
		System.out.println("---------------------------");
		double a = 0;
		
		for(int i = 0; i < stuList.size(); i++) {
			a+= stuList.get(i).getGrade();			
			}
		System.out.println("--��ü �ο��� ���� ���---");
		System.out.print("���� ��� : ");
		System.out.println(a / stuList.size()); 
		System.out.println("--------------------");
	}
}
	
