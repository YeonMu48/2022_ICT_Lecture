package arrayExample;

import javax.xml.crypto.Data;

public class main {
	public static void main(String[] args) {
		System.out.println("arrayEx 프로그램 시작!");
		
		// 첫 번째 선언 방법
		// int[] arr = new int[10];
		
		// 두 번째
		// int arr[] = new int[10]; 
		
		// 세 번째 (갯수 명시 x 컴퓨터가 뒤의 원소 갯수를 카운팅하여 자동으로 값 넣어줌 이러면 new int[3]
		// int arr[] = new int[] {0, 1, 2} ;
		
		
		// int[] numbers1 = new int[3]
	
		/*
		int [] arr = new int[3]; // -> 값은 0, 0, 0 의 3개가 들어가있음 이것을 다시 값을 넣으려면
		arr[0] = 0; // 다음과 같다. 
		arr[1] = 1;
		arr[2] = 2;
		*/
		
		// int[] arr = new int[] { 0, 1, 2}; = int[] arr = { 0, 1, 2};
		
		
		// 배열의 원소에 접근 (100개에 따른 조건식 작성)
		/*
		int arr[] = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
		
		
		
		// for 문을 while 문으로 변경 
		System.out.println("--------");
		System.out.println("while 문 시작");
		System.out.println("--------");
		int arr01[] = new int[100];
		int a = 0;
		while(a < 100) {
			arr01[a] = a+1;
			System.out.println(arr01[a]);
			a++;
		}
		
		
		// 배열의 원소 출력(100개에 따른 조건식 작성)
		System.out.println("--------");
		System.out.println("for문 시작");
		System.out.println("--------");
		for(int i = 0; i <100; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("--------");
		System.out.println("while 시작");
		System.out.println("--------");
		int i = 0;  // for를 while로 바꾸는 법, 초기화 식은 위로. 조건식은 그대로 while 조건문으로 , 증감식은 while 식 내부로.
		while (i <100) {
			System.out.println(arr[i]);
			i++;
		}
		
		*/
		
		/*
		char[] arr = new char[10];
		int i= 0;
		int a= 65;
		
		for (i = 0; i < 10; i++) { // 우선 반복문으로 열 번 반복하는 것을 먼저 생각해야 한다.
			arr[i]= (char)a;
			System.out.println((char)arr[i]);
			a = a+1;
		}
		*/
		
		
		
		double[] data = new double[5];
		
		data[0] = 10.0; 
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i =0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
	}
}
