
public class main {
	public static void main(String[] args) {
		System.out.println("2차원 배열 출력 프로그램 시작!");
		int[][] arr01 = new int[9][9];

		for (int i = 0; i < arr01.length; i++) {
			for (int j = 0; j < arr01.length; j++) {
				arr01[i][j] = ((i + 1) * (j + 1));

				System.out.print(arr01[i][j]+ " ");
			}
			System.out.println();
		}
		
		/*
		char a = 'a';
		System.out.println((int)a);
		*/
		System.out.println();
		System.out.println("2차원 배열 출력 프로그램 시작!");
		
		int a = 97;
		//char b = 'z';
		//System.out.println((int)b);
				
		char[][] arr02 = new char[3][9];
		
		for(int i = 0; i < arr02.length; i++) {
			for(int j = 0; j < 9; j++) {
				if(a == 123) {
					arr02[i][j] = '-';
				}else {
					arr02[i][j] = (char)a;
				}
				System.out.print((char)arr02[i][j] + " ");
				a++;					
			}
			System.out.println();
		}

	}
}
