package scannerEx;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.println("나이와 이름을 입력하세요");
		age = scan.nextInt();
		name = scan.next();
		
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);
		scan.close();
		
	}
}
