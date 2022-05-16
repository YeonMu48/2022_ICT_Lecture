package calendar;

import java.util.Scanner;

public class calender {
	public static void main(String[] args) {
		
		int year = 1600;
		int month = 2;
		int date = 0;
//		int date[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		/*
		boolean a = true;
		
		System.out.println("년을 입력하세요. 년: " + year);
		System.out.println("월을 입력하세요. 월: " + month);
		
		if(year % 4 == 0) { // 윤년
			if(month == 4 || month == 6 || month == 9 || month == 11) {
				date = 30;
			}else if(month == 2) {
				date = 29;
			}else {
				date = 31;
			}
			
			//---------------------------------
			if(year % 100 == 0) { //평년
				if(month == 4 || month == 6 || month == 9 || month == 11) {
					date = 30;
				}else if(month == 2) {
					date = 28;
				}else {
					date = 31;
				}
				
				//---------------------------------
				if(year % 400 == 0) { //윤년
					if(month == 4 || month == 6 || month == 9 || month == 11) {
						date = 30;
					}else if(month == 2) {
						date = 29;
					}else {
						date = 31;
					}
				}
			}
		}else {
			if(month == 4 || month == 6 || month == 9 || month == 11) {
				date = 30;
			}else if(month == 2) {
				date = 28;
			}else {
				date = 31;
			}
		}
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("연도 입력 : "); 
		int year = sc.nextInt(); 
		System.out.print("월 입력 : "); 
		int month = sc.nextInt();
		*/
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { // 윤년...
			
			if(month == 4 || month == 6 || month == 9 || month == 11) {
				date = 30;
			}else if(month == 2) {
				date = 29;
			}else {
				date = 31;
			}
		}else {
			if(month == 4 || month == 6 || month == 9 || month == 11) {
				date = 30;	
			}else if(month == 2) {
				date = 28;
			}else {
				date = 31;
			}
		}
		
		System.out.println(year + "년 " + month + "월은 " + date + "일까지 있습니다.");
	}
}
