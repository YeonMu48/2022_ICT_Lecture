package arrayExample;

import javax.xml.crypto.Data;

public class main {
	public static void main(String[] args) {
		System.out.println("arrayEx ���α׷� ����!");
		
		// ù ��° ���� ���
		// int[] arr = new int[10];
		
		// �� ��°
		// int arr[] = new int[10]; 
		
		// �� ��° (���� ��� x ��ǻ�Ͱ� ���� ���� ������ ī�����Ͽ� �ڵ����� �� �־��� �̷��� new int[3]
		// int arr[] = new int[] {0, 1, 2} ;
		
		
		// int[] numbers1 = new int[3]
	
		/*
		int [] arr = new int[3]; // -> ���� 0, 0, 0 �� 3���� ������ �̰��� �ٽ� ���� ��������
		arr[0] = 0; // ������ ����. 
		arr[1] = 1;
		arr[2] = 2;
		*/
		
		// int[] arr = new int[] { 0, 1, 2}; = int[] arr = { 0, 1, 2};
		
		
		// �迭�� ���ҿ� ���� (100���� ���� ���ǽ� �ۼ�)
		/*
		int arr[] = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
		
		
		
		// for ���� while ������ ���� 
		System.out.println("--------");
		System.out.println("while �� ����");
		System.out.println("--------");
		int arr01[] = new int[100];
		int a = 0;
		while(a < 100) {
			arr01[a] = a+1;
			System.out.println(arr01[a]);
			a++;
		}
		
		
		// �迭�� ���� ���(100���� ���� ���ǽ� �ۼ�)
		System.out.println("--------");
		System.out.println("for�� ����");
		System.out.println("--------");
		for(int i = 0; i <100; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("--------");
		System.out.println("while ����");
		System.out.println("--------");
		int i = 0;  // for�� while�� �ٲٴ� ��, �ʱ�ȭ ���� ����. ���ǽ��� �״�� while ���ǹ����� , �������� while �� ���η�.
		while (i <100) {
			System.out.println(arr[i]);
			i++;
		}
		
		*/
		
		/*
		char[] arr = new char[10];
		int i= 0;
		int a= 65;
		
		for (i = 0; i < 10; i++) { // �켱 �ݺ������� �� �� �ݺ��ϴ� ���� ���� �����ؾ� �Ѵ�.
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
