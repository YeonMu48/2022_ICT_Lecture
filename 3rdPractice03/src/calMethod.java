import java.util.ArrayList;

public class calMethod {
	// ���� �Ϸ��� �� : ����� ���ϴ� �Լ� 
	// �ʿ��� �� : �迭�� ���(���ؼ� ���� ��)
	// �켱 �����;� �� �� : �迭���� �� ����� ��(���ؾ� ��) --> ��ҿ� ��� ������ ���ΰ�? 
	// ���������� ��ǥ�� �� : ��Ҹ� �� ���ϰ� ������ ���ġ�� ���� �� 
	double sum = 0;
	
	public void calcAvg(ArrayList<People> arrayList) {
		for(int i = 0; i < arrayList.size(); i++) {
			sum += arrayList.get(i).getGrade();
		}
		System.out.println(sum / arrayList.size());
	}
}
