package classEx;

public class Professor {
	
	String stName;
	String stGender;
	int stAge;
	String stPhNumber;
	String stAddress;
	int stGrade;
	
	// �Է� ����
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

	// ���
	
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
		System.out.println("Person ������ ȣ��!");
		this("�̸�����", "�����̻�", 0, "��ȭ��ȣ ��", "�ּ� ��", 0)
		stName = "�̸�����";
		stGender = "�����̻�";
		stAge = 0;
		stPhNumber = "��ȭ��ȣ ��";
		stAddress = "�ּ� ��";
		stGrade = 0;
	}
	
	public void ShowProfessorInfo() {
		System.out.println("�̸� : " + stName);
		System.out.println("���� : " + stGender);
		System.out.println("���� : " + stAge);
		System.out.println("��ȭ��ȣ : " + stPhNumber);
		System.out.println("�ּ� : " + stAddress);
		System.out.println("��� : " + stGrade+"����");
	}
	
}
