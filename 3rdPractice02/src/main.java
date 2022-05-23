
public class main {
	public static void main(String[] args) {
		System.out.println("규칙에 맞는 박수치기 프로그램 시작 !");
		
		int[][] arr03 = new int[10][10];
		int n = 1;
		
		for(int i = 0; i < arr03.length; i++) {
			for(int j = 0; j < arr03.length; j++) {
				arr03[i][j] = ((i*10)+(j+1));
					if(arr03[i][j] == n+1) {
						System.out.print("(짝) ");
						n=n*2;
					}else {
						System.out.print("(쉿) ");
					}
				//System.out.print("(" + arr03[i][j] + ") ");
			}
			System.out.println();
		}
	}
}
