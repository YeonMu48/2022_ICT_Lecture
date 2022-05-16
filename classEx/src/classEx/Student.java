package classEx;

public class Student {
	   
	int studentID;
	String studentName;
	int grade;
	String gender;
	String address; // 전역변수
	
	public String getStudentName() { // get - Student 클래스 안의 studentName을 가져옴
		return this.studentName;
	}
	public int getStudentID() {
		return this.studentID;
		// return StdeuntID; 도 가능
	}
	public String getStudentAddress() {
		return this.address;
	}
	public String getStudentGender() {
		return gender;
	}
	
	public void setStudentName(String _studentname) { // 입력한 name 값을 Student 클래스의 studentName에 셋팅함
		this.studentName = _studentname;
	} // return 값이 없으니까 void , return 값이 있으면 값의 자료형을 대입
	public void setStudentID(int _studentId) {
		this.studentID = _studentId;
	}
	public void setStudentAddress(String _studentAddress) {
		this.address = _studentAddress;
	}
	public void setStudentGender(String _studentGender) {
		gender = _studentGender;
	}
	public void showStudentInfo() { // void -> 동작만 진행
		System.out.println("이름 : " + this.studentName);
		System.out.println("학번 : " + this.studentID);
		System.out.println("주소 : " + this.address);
		System.out.println("성별 : " + this.gender);
	}
}
