package classEx;

public class Student {
	   
	int studentID;
	String studentName;
	int grade;
	String gender;
	String address; // ��������
	
	public String getStudentName() { // get - Student Ŭ���� ���� studentName�� ������
		return this.studentName;
	}
	public int getStudentID() {
		return this.studentID;
		// return StdeuntID; �� ����
	}
	public String getStudentAddress() {
		return this.address;
	}
	public String getStudentGender() {
		return gender;
	}
	
	public void setStudentName(String _studentname) { // �Է��� name ���� Student Ŭ������ studentName�� ������
		this.studentName = _studentname;
	} // return ���� �����ϱ� void , return ���� ������ ���� �ڷ����� ����
	public void setStudentID(int _studentId) {
		this.studentID = _studentId;
	}
	public void setStudentAddress(String _studentAddress) {
		this.address = _studentAddress;
	}
	public void setStudentGender(String _studentGender) {
		gender = _studentGender;
	}
	public void showStudentInfo() { // void -> ���۸� ����
		System.out.println("�̸� : " + this.studentName);
		System.out.println("�й� : " + this.studentID);
		System.out.println("�ּ� : " + this.address);
		System.out.println("���� : " + this.gender);
	}
}
