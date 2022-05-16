package classEx;

public class Professor {
	
	String stName;
	String stGender;
	int stAge;
	String stPhNumber;
	String stAddress;
	int stGrade;
	
	// 입력 설정
	/*
	public void setStName(String _stName) {
		stName = _stName;
	}
	public void setStGender(String _stGender) {
		stGender = _stGender;
	}
	public void setStAge(int _stAge) {
		stAge = _stAge;
	}
	public void setStPhNumber(String _stPhNumber) {
		stPhNumber = _stPhNumber;
	}
	public void setStAddress(String _stAddress) {
		stAddress = _stAddress;
	}
	public void setStGrade(int _stGrade) {
		stGrade = _stGrade;
	}
	*/
	
	public Professor(String stName, String stGender, int stAge, String stPhNumber, String stAddress, int stGrade) {
			this.stName = stName;
			this.stGender = stGender;
			this.stAge = stAge;
			this.stPhNumber = stPhNumber;
			this.stAddress = stAddress;
			this.stGrade = stGrade;
	}

	// 출력
	
	public String getStName() {
		return this.stName;
	}
	public String getStGender() {
		return this.stGender;
	}
	public int getStAge() {
		return this.stAge;
	}
	public String getStPhNumber() {
		return this.stPhNumber;
	}
	public String getStAddress() {
		return this.stAddress;
	}
	public int getStGrade() {
		return this.stGrade;
	}
	
	public Professor() {
		System.out.println("Person 생성자 호출!");
		this("이름없음", "성별미상", 0, "전화번호 모름", "주소 모름", 0)
		stName = "이름없음";
		stGender = "성별미상";
		stAge = 0;
		stPhNumber = "전화번호 모름";
		stAddress = "주소 모름";
		stGrade = 0;
	}
	
	public void ShowProfessorInfo() {
		System.out.println("이름 : " + stName);
		System.out.println("성별 : " + stGender);
		System.out.println("나이 : " + stAge);
		System.out.println("전화번호 : " + stPhNumber);
		System.out.println("주소 : " + stAddress);
		System.out.println("경력 : " + stGrade+"년차");
	}
	
}
