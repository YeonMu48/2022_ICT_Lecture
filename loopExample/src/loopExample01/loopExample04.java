package loopExample01;

public class loopExample04 {
	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		
		while(true) {
			while (sum < 100) {
				num++;
				sum += num;
			}
			System.out.println("�ִ밪 : " + (sum-num));
			System.out.println("���������� : " + num);
			break;
		}
	}
}
	