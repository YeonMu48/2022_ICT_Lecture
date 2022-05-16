package classEx;

import classEx.Student;

public class Main {
	public static void main(String[] args) {
		

		
		// professor 작업
		
		Professor proPark = new Professor("박재현", "남자", 32, "010-9650-9705", "대전광역시 유성구 죽동", 7);
		Professor proLee = new Professor();
		
		

		/*
		proLee.setStName("이선민");
		*/
		
		proPark.ShowProfessorInfo();
		System.out.println();
		proLee.ShowProfessorInfo();
		System.out.println();
		
		/*
		proPark.setStName("박재현");
		proPark.setStGender("남자");
		proPark.setStAge(32);
		proPark.setStPhNumber("010-9650-9705");
		proPark.setStAddress("대전광역시 유성구 죽동");
		proPark.setStGrade(7);
		*/
		
		/*
		proPark.ShowProfessorInfo();
		System.out.println();
		
		System.out.println();
		System.out.println("Get을 사용하여 출력하기");
		System.out.println("이름 : " + proPark.getStName());
		System.out.println("성별 : " + proPark.getStGender());
		System.out.println("나이 : " + proPark.getStAge());
		System.out.println("전화번호 : " + proPark.getStPhNumber());
		System.out.println("주소 : " + proPark.getStAddress());
		System.out.println("경력 : " + proPark.getStGrade() +"년차");
		*/
	
	}
}
