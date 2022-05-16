package staticEx;

public class main {
	public static void main(String[] args) {
		/*
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.serialNum++;
		System.out.println(student1.serialNum);
		System.out.println(student2.serialNum);
		*/
		
		Student.AddserialNum();
		System.out.println(Student.serialNum);
		
		Student student = new Student();
		System.out.println(student.serialNum);
		
	}
}
