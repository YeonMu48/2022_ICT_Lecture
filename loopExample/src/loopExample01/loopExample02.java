package loopExample01;

public class loopExample02 {
	public static void main(String[] args) {
		

		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
			//for(int j=6; j > 0; j--) { // �̰� ���� �� �̷��� ��ư� ����?
				if(i+j == 6) {
					System.out.println("����� �� : " + i + "+" + j + "=" + (i+j));					
				}
			}
		}
	}
}	
