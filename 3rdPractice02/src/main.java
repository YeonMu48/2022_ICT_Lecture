
public class main {
	public static void main(String[] args) {
		System.out.println("��Ģ�� �´� �ڼ�ġ�� ���α׷� ���� !");
		
		int[][] arr03 = new int[10][10];
		int n = 1;
		
		for(int i = 0; i < arr03.length; i++) {
			for(int j = 0; j < arr03.length; j++) {
				arr03[i][j] = ((i*10)+(j+1));
					if(arr03[i][j] == n+1) {
						System.out.print("(¦) ");
						n=n*2;
					}else {
						System.out.print("(��) ");
					}
				//System.out.print("(" + arr03[i][j] + ") ");
			}
			System.out.println();
		}
	}
}
