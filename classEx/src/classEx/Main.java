package classEx;

import classEx.Student;

public class Main {
	public static void main(String[] args) {
		

		
		// professor �۾�
		
		Professor proPark = new Professor("������", "����", 32, "010-9650-9705", "���������� ������ �׵�", 7);
		Professor proLee = new Professor();
		
		

		/*
		proLee.setStName("�̼���");
		*/
		
		proPark.ShowProfessorInfo();
		System.out.println();
		proLee.ShowProfessorInfo();
		System.out.println();
		
		/*
		proPark.setStName("������");
		proPark.setStGender("����");
		proPark.setStAge(32);
		proPark.setStPhNumber("010-9650-9705");
		proPark.setStAddress("���������� ������ �׵�");
		proPark.setStGrade(7);
		*/
		
		/*
		proPark.ShowProfessorInfo();
		System.out.println();
		
		System.out.println();
		System.out.println("Get�� ����Ͽ� ����ϱ�");
		System.out.println("�̸� : " + proPark.getStName());
		System.out.println("���� : " + proPark.getStGender());
		System.out.println("���� : " + proPark.getStAge());
		System.out.println("��ȭ��ȣ : " + proPark.getStPhNumber());
		System.out.println("�ּ� : " + proPark.getStAddress());
		System.out.println("��� : " + proPark.getStGrade() +"����");
		*/
	
	}
}
