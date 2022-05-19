package twoDimension;

public class main {
	public static void main(String[] args) {
		/*
		int[] arr1 = new int[3];
		int[][] arr2 = new int[2][3];
		
		// 위와 아래를 비교 
		
		int[] arr01 = {1, 2, 3};
		int[][] arr02 = { {1, 2, 3}, {1, 2, 3}};
	
		
		int[][] arr = { {1, 2, 3}, {4, 5, 6}};
		*/
		
		int[][] arr0 = new int[5][5];
		
		for(int i=0 ; i <5; i++) {
			for(int j = 0; j < 5; j++) {
				arr0[i][j]=((i*5)+(j*1))+1;
				System.out.println(arr0[i][j]);
				}
			}	
		
		int[] arr00 = new int[5];
		
		int a = 1;
		for(int i = 0; i <5; i++) {
			arr00[i] = a;
			a++;
			System.out.println(arr00[i]);
				}
		}
}
